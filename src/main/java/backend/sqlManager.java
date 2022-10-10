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
public class sqlManager {
    
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/pat_grade10";
    private static final String user = "root";
    private static final String pass = "1786";

    public static void update(String update) throws SQLException 
    {
            Connection conn = DriverManager.getConnection(url, user, pass);

            PreparedStatement statement = conn.prepareStatement(update);
            statement.executeUpdate();
            statement.close();
	}

    public static ResultSet query(String query) throws SQLException {
            Connection conn = DriverManager.getConnection(url, user, pass);

            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
                
            return resultSet;
	}
    
}
