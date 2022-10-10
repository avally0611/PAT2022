/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import UI.menuScreen;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Aaminah1
 */
public class basketManager {
    
    public static String[][] getCurrentFood() throws SQLException
    {

        ResultSet currentOrder = sqlManager.query("SELECT name, price FROM currentBooking");
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
    
    public static int getNumCurrent() throws SQLException
    {
        int numRows = 0;
        
        ResultSet currentOrder = sqlManager.query("SELECT name FROM currentBooking");
        while (currentOrder.next())
        {
            numRows++;
        }
        return numRows;
    }
       
    
     
     

}
