/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Aaminah1
 */
public class SqlManager {
    
    //Note: most of this code was from Abban
    
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://102.130.115.69:3306/aaminahvDB";
    private static final String user = "aaminahv";
    private static final String pass = "Reddam2021";

    //Add, remove or edit something in a table in the database
    public static void update(String update) throws SQLException 
    {
            Connection conn = DriverManager.getConnection(url, user, pass);

            PreparedStatement statement = conn.prepareStatement(update);
            statement.executeUpdate();
            statement.close();
	}

    //Get information from table in database and save into a separate "table" called a ResultSet
    public static ResultSet query(String query) throws SQLException {
            Connection conn = DriverManager.getConnection(url, user, pass);

            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
                
            return resultSet;
	}
    
}
