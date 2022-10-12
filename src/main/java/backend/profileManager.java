/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import UI.loginScreen;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Aaminah1
 */
public class profileManager {
    static String user = loginScreen.user;
    
    //in order for the user to see their details, we have to get their ID so we can get THEIR info from the database
    public static int getUserID() throws SQLException
    {
        int userID = 0;

        ResultSet ID = sqlManager.query("SELECT usersID FROM users WHERE userName = '"+user+"'");
        while(ID.next())
        {
           userID = ID.getInt("usersID");
        }
        return userID;
    }
    
    //gets firstname from database
    public static String getFName() throws SQLException
    {
        String fName = "";
        ResultSet rs = sqlManager.query("SELECT firstname FROM users WHERE usersID = '"+getUserID()+"'");
        while (rs.next())
        {
            fName = rs.getString("firstname");
        }
        return fName;
    }
    
    //gets lastname from database
    public static String getLName() throws SQLException
    {
        String LName = "";
        ResultSet rs = sqlManager.query("SELECT lastname FROM users WHERE usersID = '"+getUserID()+"'");
        while (rs.next())
        {
            LName = rs.getString("lastname");
        }
        return LName;
    }
    
    //gets username from database
    public static String getUsername() throws SQLException
    {
        String username = "";
        ResultSet rs = sqlManager.query("SELECT username FROM users WHERE usersID = '"+getUserID()+"'");
        while (rs.next())
        {
            username = rs.getString("username");
        }
        return username;
    }
    
    //gets password from database
    public static String getPassword() throws SQLException
    {
        String pass = "";
        ResultSet rs = sqlManager.query("SELECT password FROM users WHERE usersID = '"+getUserID()+"'");
        while (rs.next())
        {
            pass = rs.getString("password");
        }
        return pass;
    }
    
    //gets email from database
    public static String getEmail() throws SQLException
    {
        String email = "";
        ResultSet rs = sqlManager.query("SELECT email FROM users WHERE usersID = '"+getUserID()+"'");
        while (rs.next())
        {
            email = rs.getString("email");
        }
        return email;
    }
    
    //gets phone number from database
    public static String getPhone() throws SQLException
    {
        String phone = "";
        ResultSet rs = sqlManager.query("SELECT phone FROM users WHERE usersID = '"+getUserID()+"'");
        while (rs.next())
        {
            phone = rs.getString("phone");
        }
        return phone;
    }
    
    //if the user wants to edit their details, this method is used to change the details
    public static void updateDetails(String username, String password, String firstName, String lastName, String email, String number ) throws SQLException
    {
        int userID = getUserID();
        sqlManager.update("INSERT INTO users (users_id, username, password, first_name, last_name, email, phone) VALUES ('" + username +"', '" + password +"', '" + firstName +"', '" + lastName +"', '" + email +"', '" + number +"') WHERE (usersID = '"+ userID+"')");


    }
    
}
