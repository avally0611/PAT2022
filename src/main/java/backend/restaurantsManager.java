/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aaminah1
 */
public class restaurantsManager {
    
    //this method gets the list of cities from database and returns it as ArrayList to populate combo box
    public static ArrayList<String> getCities() throws SQLException
    {
        ArrayList<String> citiesList = new ArrayList<String>();
        ResultSet cities = sqlManager.query("SELECT areaName FROM area");
        while (cities.next())
        {
            String city = cities.getString("areaName");
            citiesList.add(city);
     

        }
        return citiesList;
    }
    
    //gets list of restaurants based on city chosen and save it as ArrayList to populate combo box
    public static ArrayList<String> getRestaurants(String city) throws SQLException
    {
        ArrayList<String> restaurantsList = new ArrayList<String>();
        ResultSet restaurantNames = sqlManager.query("SELECT restaurantName FROM pat_grade10.restaurants, area WHERE (restaurants.areaID = area.areaID) AND areaName = '" + city +"'");
        while (restaurantNames.next())
        {
            String restaurant = restaurantNames.getString("restaurantName");
            restaurantsList.add(restaurant);
     

        }
        return restaurantsList;
    }
    
    //gets the description of restaurant from database when a retaurant is chosen
    public static String getDesc (String restaurant) throws SQLException
    {
        String restDesc = "";
        
        ResultSet rs = sqlManager.query("SELECT restaurantDesc FROM restaurants WHERE restaurantName = '" + restaurant +"'");
        while (rs.next())
        {
            restDesc = rs.getString("restaurantDesc");
        }
        
        return restDesc;
    }
    
   
     
   
     
    
   
    
}
