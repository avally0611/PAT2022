/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Aaminah1
 */
public class reservationManager {
    public static int addBookingDetails()
    {
        
        //return id when adding
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
