/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import UI.mainScreen;
import UI.menuScreen;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author Aaminah1
 */
public class menuManager {
    

    public static int getResID(String selectedRes) throws SQLException
    {
        int restaurantID = 0;

        ResultSet resID = sqlManager.query("SELECT restaurantID FROM restaurants WHERE restaurantName = '"+selectedRes+"'");
        while(resID.next())
        {
           restaurantID = resID.getInt("restaurantID");
        }
        return restaurantID;
    }
    
    public static ArrayList<String> getSections(String selectedRes) throws SQLException
    {
        ArrayList<String> sectionList = new ArrayList<String>();
        
        int restaurantID = getResID(selectedRes);
        
        ResultSet rs = sqlManager.query("SELECT DISTINCT sectionName FROM section, menu WHERE (section.sectionID = menu.sectionID) AND menu.restaurantID = '"+restaurantID+"'");
        while (rs.next())
        {
            String section = rs.getString("sectionName");
            sectionList.add(section);
        }
        


        return sectionList;
    }
    
    public static int getSectionID(String section) throws SQLException
    {
        int secID = 0;
        ResultSet sectionID = sqlManager.query("SELECT sectionID FROM section WHERE sectionName = '"+section+"'");
        while(sectionID.next())
        {
           secID = sectionID.getInt("sectionID");
        }
        return secID;
    }
    
    
    public static String[][] getFood(String selectedRes, String section) throws SQLException
    {
        int rows = getNumFood(selectedRes, section);
        String tbData [][] = new String[rows][2];
        
        int resID = getResID(selectedRes);
        int secID = getSectionID(section);

        ResultSet rs = sqlManager.query("SELECT name, price FROM menuItem, menu WHERE (menuItem.itemID = menu.itemID) AND (menu.sectionID = '"+secID+"') AND (menu.restaurantID = '"+resID+"') ");
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
     
    private static int getNumFood(String selectedRes, String section) throws SQLException
             
    {
        int resID = getResID(selectedRes);
        int secID = getSectionID(section);
       
        int count = 0;

        ResultSet rs = sqlManager.query("SELECT name FROM menuItem, menu WHERE (menuItem.itemID = menu.itemID) AND (menu.sectionID = '"+secID+"') AND (menu.restaurantID = '"+resID+"') ");
        while (rs.next())
        {
            count++;
                    
        }
        
        
        return count;
    }  
    
    
    
    public static void currentOrder(String selectedItem, String prices) throws SQLException
    {
        
        
        sqlManager.update("INSERT INTO currentBooking (name, price) VALUES ('" + selectedItem +"', '" + prices +"')");
    
    }
    
    public static ArrayList<String> getCurrentOrder() throws SQLException
    {
    
        ArrayList<String> listFoods = new ArrayList<String>();  
        ResultSet foods = sqlManager.query("SELECT name FROM currentBooking");
        while(foods.next())
        {
            String food = foods.getString("name");
            listFoods.add(food);

        }
        return listFoods;
    }
    
    public static double getTotalPrice() throws SQLException
    {
        ResultSet pricesList = sqlManager.query("SELECT price FROM currentBooking");
        double totalPrice = 0;
        while (pricesList.next())
        {
            double price = pricesList.getDouble("price");
            totalPrice += price;
        }
        return totalPrice;
    }
    
    public static void removeItem(String item, int count) throws SQLException
    {
        sqlManager.update("DELETE FROM currentBooking WHERE currentBookingID = '"+count+"'");
        sqlManager.update("ALTER TABLE currentBooking DROP currentBookingID");
        sqlManager.update("ALTER TABLE currentBooking ADD currentBookingID INT NOT NULL AUTO_INCREMENT FIRST, ADD PRIMARY KEY (currentBookingID)");
    }
    
 
   
}
