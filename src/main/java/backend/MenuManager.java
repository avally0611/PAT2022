/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author Aaminah1
 */
public class MenuManager {
    

    //get restaurant ID from database so we can use it later (getting food items)
    public static int getResID(String selectedRes) throws SQLException
    {
        int restaurantID = 0;

        ResultSet resID = SqlManager.query("SELECT restaurantID FROM restaurants WHERE restaurantName = '"+selectedRes+"'");
        while(resID.next())
        {
           restaurantID = resID.getInt("restaurantID");
        }
        return restaurantID;
    }
    
    //get sections of restaurant and save into ArrayList to populate combo box
    public static ArrayList<String> getSections(String selectedRes) throws SQLException
    {
        ArrayList<String> sectionList = new ArrayList<String>();
        
        int restaurantID = getResID(selectedRes);
        
        ResultSet rs = SqlManager.query("SELECT DISTINCT sectionName FROM section, menu WHERE (section.sectionID = menu.sectionID) AND menu.restaurantID = '"+restaurantID+"'");
        while (rs.next())
        {
            String section = rs.getString("sectionName");
            sectionList.add(section);
        }
        


        return sectionList;
    }
    
    //get section ID based on secion for future use (getting food items)
    public static int getSectionID(String section) throws SQLException
    {
        int secID = 0;
        ResultSet sectionID = SqlManager.query("SELECT sectionID FROM section WHERE sectionName = '"+section+"'");
        while(sectionID.next())
        {
           secID = sectionID.getInt("sectionID");
        }
        return secID;
    }
    
    //get food items based on restaurant and section chosen, save it in 2D array so that we can populate jTable with all the food items
    public static String[][] getFood(String selectedRes, String section) throws SQLException
    {
        int rows = getNumFood(selectedRes, section);
        String tbData [][] = new String[rows][2];
        
        int resID = getResID(selectedRes);
        int secID = getSectionID(section);

        ResultSet rs = SqlManager.query("SELECT name, price FROM menuItem, menu WHERE (menu.restaurantID = '"+resID+"') AND (menu.sectionID = '"+secID+"') AND  (menuItem.menuItemID = menu.itemID) ");
        while (rs.next())
        {
            for (int i = 0; i < rows; i++) 
            {
                String food = rs.getString("name");
                String price = rs.getString("price");
                tbData [i][0] = food;
                tbData[i][1] = price;
                rs.next();
            }
                    
        }
         
       
        return tbData;
    }
     
    //get the number of food items so we can set a size to our 2D array for getFood() as we have to use a 2D array for jTables
    private static int getNumFood(String selectedRes, String section) throws SQLException
             
    {
        int resID = getResID(selectedRes);
        int secID = getSectionID(section);
       
        int count = 0;

        ResultSet rs = SqlManager.query("SELECT name FROM menuItem, menu WHERE (menuItem.menuItemID = menu.itemID) AND (menu.sectionID = '"+secID+"') AND (menu.restaurantID = '"+resID+"') ");
        while (rs.next())
        {
            count++;
                    
        }
        
        
        return count;
    }  
    
    
    //when user presses add button, it uses this method so we can keep track of all the food items chosen 
    public static void currentOrder(String selectedItem, String prices) throws SQLException
    {
        
        
        SqlManager.update("INSERT INTO currentBooking (name, price) VALUES ('" + selectedItem +"', '" + prices +"')");
    
    }
    
    //gets the food items chosen
    public static ArrayList<String> getCurrentOrder() throws SQLException
    {
    
        ArrayList<String> listFoods = new ArrayList<String>();  
        ResultSet foods = SqlManager.query("SELECT name FROM currentBooking");
        while(foods.next())
        {
            String food = foods.getString("name");
            listFoods.add(food);

        }
        return listFoods;
    }
    
    //gets the total price of the food items chosen and returns as double
    public static double getTotalPrice() throws SQLException
    {
        ResultSet pricesList = SqlManager.query("SELECT price FROM currentBooking");
        double totalPrice = 0;
        while (pricesList.next())
        {
            double price = pricesList.getDouble("price");
            totalPrice += price;
        }
        return totalPrice;
    }
    
    //user presses delete button and we remove from currentOrder table, we also have to reset the itemID auto-increment as it gets messed up when we delete an item 
    public static void removeItem(String item, int count) throws SQLException
    {
        SqlManager.update("DELETE FROM currentBooking WHERE currentBookingID = '"+count+"'");
        SqlManager.update("ALTER TABLE currentBooking DROP currentBookingID");
        SqlManager.update("ALTER TABLE currentBooking ADD currentBookingID INT NOT NULL AUTO_INCREMENT FIRST, ADD PRIMARY KEY (currentBookingID)");
    }
    
 
   
}
