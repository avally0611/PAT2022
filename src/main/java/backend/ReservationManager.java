/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import UI.LoginScreen;
import UI.MainScreen;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 *
 * @author Aaminah1
 */
public class ReservationManager {
    
    //when the reserve button is clicked, the data is entered into database and then the booking ID is returned as int so that the confirmation screen can get the data from the database based on the ID
    public static int addReservationDetails(int numGuests, LocalDateTime date, String type) throws SQLException
    {
        int userID = ProfileManager.getUserID();
        int resID = MenuManager.getResID((String) MainScreen.restaurantComboBox.getSelectedItem());
        
       int bookingID = 0;
        SqlManager.update("INSERT INTO bookings (date, numGuests, restaurantID, userID, type) VALUES ('" + date +"', '" + numGuests +"', '" + resID +"', '" + userID +"', '" + type +"')");
        ResultSet booking = SqlManager.query("SELECT bookingID FROM bookings");
        while (booking.next())
        {
            bookingID = booking.getInt("bookingID");
        }
        
        //return id when adding
        return bookingID;
    }
    
    //gets number of guests from database
    public static int getNumGuests(int id) throws SQLException
    {
        int numGuests = 0;
        ResultSet rs = SqlManager.query("SELECT numGuests FROM bookings WHERE bookingID = '"+id+"'");
        while(rs.next())
        {
            numGuests = rs.getInt("numGuests");
        }
        
        return numGuests;
    }
    
    //gets date of booking and returns as String
    public static String getDates(int id) throws SQLException
    {
        String date = "";
        ResultSet rs = SqlManager.query("SELECT date FROM bookings WHERE bookingID = '"+id+"'");
        while(rs.next())
        {
            date = rs.getString("date");
        }
        
        return date;
    }
    
    
    
}
