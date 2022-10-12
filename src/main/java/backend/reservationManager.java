/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import UI.loginScreen;
import UI.mainScreen;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 *
 * @author Aaminah1
 */
public class reservationManager {
    public static int addBookingDetails(int numGuests, LocalDateTime date, String type) throws SQLException
    {
        int userID = profileManager.getUserID();
        int resID = menuManager.getResID((String) mainScreen.restaurantComboBox.getSelectedItem());
        
       int bookingID = 0;
        sqlManager.update("INSERT INTO bookings (date, numGuests, restaurantID, userID, type) VALUES ('" + date +"', '" + numGuests +"', '" + resID +"', '" + userID +"', '" + type +"')");
        ResultSet booking = sqlManager.query("SELECT bookingID FROM bookings");
        while (booking.next())
        {
            bookingID = booking.getInt(bookingID);
        }
        
        //return id when adding
        return bookingID;
    }
    
    public static int getNumGuests(int id) throws SQLException
    {
        int numGuests = 0;
        ResultSet rs = sqlManager.query("SELECT numGuests FROM bookings WHERE bookingID = '"+id+"'");
        while(rs.next())
        {
            numGuests = rs.getInt("numGuests");
        }
        
        return numGuests;
    }
    
    public static String getDates(int id) throws SQLException
    {
        String date = "";
        ResultSet rs = sqlManager.query("SELECT date FROM bookings WHERE bookingID = '"+id+"'");
        while(rs.next())
        {
            date = rs.getString("date");
        }
        
        return date;
    }
    
    
    
}
