/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;
import UI.MainScreen;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

/**
 *
 * @author Aaminah1
 */
public class BasketManager {
    
    //gets the current food items chosen - saves as 2D array for jTable
    public static String[][] getCurrentFood() throws SQLException
    {

        ResultSet currentOrder = SqlManager.query("SELECT name, price FROM currentBooking");
        String tbData[][] = new String [getNumCurrent()][2];

        while (currentOrder.next())
        {
            for (int i = 0; i < getNumCurrent(); i++) 
            {
                String food = currentOrder.getString("name");
                String price = currentOrder.getString("price");
                tbData [i][0] = food;
                tbData[i][1] = price;
                currentOrder.next();
            }
        }
        
        return tbData;
    }
    
    //gets number of food items chosen to set size of 2D array for getCurrentFood() method
    public static int getNumCurrent() throws SQLException
    {
        int numRows = 0;
        
        ResultSet currentOrder = SqlManager.query("SELECT name FROM currentBooking");
        while (currentOrder.next())
        {
            numRows++;
        }
        return numRows;
    }
    
    
    //adds delivery/collection details into "bookings" table
    public static int addBookingDetails(LocalDateTime date, String type) throws SQLException
    {
        int userID = ProfileManager.getUserID();
        int resID = MenuManager.getResID((String) MainScreen.restaurantComboBox.getSelectedItem());
        
       int bookingID = 0;
        SqlManager.update("INSERT INTO bookings (date, restaurantID, userID, type) VALUES ("+date+"','" + resID +"', '" + userID +"', '" + type +"')");
        ResultSet booking = SqlManager.query("SELECT bookingID FROM bookings");
        while (booking.next())
        {
            bookingID = booking.getInt("bookingID");
        }
        
        //return id when adding
        return bookingID;
    }
       
    
     
     

}
