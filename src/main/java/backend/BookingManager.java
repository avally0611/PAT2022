/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import static backend.MenuManager.getResID;
import static backend.MenuManager.getSectionID;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

/**
 *
 * @author Aaminah1
 */
public class BookingManager {
    
    //gets the current user's bookings based off their ID - 2D array for populating jTable
     public static String[][] getBooking() throws SQLException
    {
        int userID = ProfileManager.getUserID();
        int rows = getNumBookings(userID);
        String tbData [][] = new String[rows][4];
        


        ResultSet rs = SqlManager.query("SELECT date, numGuests, restaurantID, type FROM bookings WHERE (userID = '"+userID+"') ");
        while (rs.next())
        {
            for (int i = 0; i < rows; i++) 
            {
                String date = rs.getString("date");
                String numGuests = rs.getString("numGuests");
                int restaurantID = rs.getInt("restaurantID");
                String type = rs.getString("type");
                
                String restaurantName = getRestaurant(restaurantID);
                
                tbData [i][0] = date;
                tbData[i][1] = numGuests;
                tbData[i][2] = restaurantName;
                tbData[i][3] = type;


                rs.next();
            }
                    
        }
         
       
        return tbData;
    }
     
    //get number of booking to set the size of 2D array for getBooking() method 
    public static int getNumBookings(int userID) throws SQLException
    {
        int count = 0;
        ResultSet rs = SqlManager.query("SELECT bookingID FROM bookings WHERE (userID = '"+userID+"')");
        while(rs.next())
        {
            count++;

        }

        return count;
    }
    
    //the booking table returns the restaurant ID so this method gets the name of the restaurant so we can display it on the jTable
    public static String getRestaurant(int resID) throws SQLException
    {
        String resName = "";
        ResultSet rs = SqlManager.query("SELECT restaurantName FROM restaurants WHERE (restaurantID = '"+resID+"')");
        while (rs.next())
        {
            resName = rs.getString("restaurantName");
        }
        return resName;
    }

    
}
