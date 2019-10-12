/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.restaurant.database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author User
 */
public class DatabaseHandler {

    /**
     *
     * @return
     */
 
    Connection conn = null; 
    private static DatabaseHandler handler = null;
    private DatabaseHandler() 
    {
    }
    
    private void createConnection() 
    {
    try {
        conn = DriverManager.getConnection("jdbc:mysql://localhost/restaurant_db?" + "user=root&password=pass&useSSL=false");
        
        } catch(Exception e) 
        {
            System.err.println("Create connection exception " + e.getMessage());
                    
        }
} 
    
public static DatabaseHandler getInstance()
{
if (handler == null) 
{
handler = new DatabaseHandler();
}
return handler; 
}

public boolean insertUser(String firsName, String LastName, String email, String passwordd)
{
    PreparedStatement = null; 
    try {
        ResultSet resultSet; 
        
        String countEmails = "SELECT COUNT(*) FROM USERS WHERE email = ?";  
        preparedStatement = conn.prepareStatement(countEmails); 
    }
}

   

}
