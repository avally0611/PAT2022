/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import UI.LoginScreen;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Aaminah
 */
public class UserManager {

    //gets username and password entered and checks the database that the password is correct, returnss boolean
    public static boolean checkPassword(String userInput, String passInput) 
    {
        boolean loginValid = false;
        try {
            ResultSet username = SqlManager.query("SELECT password FROM users WHERE username = '" + userInput +"'");
            username.next();
            String resultPass = username.getString("password");
            if(resultPass.equals(passInput))
            {
                loginValid = true;
                
            }
           
        } catch (SQLException ex) {
            loginValid = false;;
        }
        return loginValid;

    }
    
    //gets all of the users details to add into database
    public static void addUser(String firstName, String lastName, String email, String number, String username, String password) throws SQLException
    {
        
        SqlManager.update("INSERT INTO users (username, password, firstname, lastname, email, phone) VALUES ('" + username +"', '" + password +"', '" + firstName +"', '" + lastName +"', '" + email +"', '" + number +"')");
    
    }
    

}

