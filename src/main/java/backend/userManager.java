/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import UI.loginScreen;
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
public class userManager {

    
    public static boolean checkPassword(String userInput, String passInput) throws SQLException
    {
        boolean loginValid;
        ResultSet username = sqlManager.query("SELECT password FROM users WHERE username = '" + userInput +"'");
        username.next();
        String resultPass = username.getString("password");
        if(resultPass.equals(passInput))
        {
            loginValid = true;

        }
        else
        {
            loginValid = false;
        }
        return loginValid;
    }
    
    public static void addUser(String firstName, String lastName, String email, String number, String username, String password) throws SQLException
    {
        
        sqlManager.update("INSERT INTO users (users_id, username, password, first_name, last_name, email, phone) VALUES ('" + username +"', '" + password +"', '" + firstName +"', '" + lastName +"', '" + email +"', '" + number +"')");
    
    }
    

}

