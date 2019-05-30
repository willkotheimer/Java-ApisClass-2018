package cooksys.day7_JDBC;

import dao.UserDao;
import entity.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main (String[] args) {

    	final String URL = "jdbc:postgresql://localhost:5432/postgres/smartshare";
    	final String USER = "postgres";
        final String PASSWORD = "bondstone";

    
		
		
		try {
			Class.forName("org.postgresql.Driver");
			Connection connection;
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
			
			String Prepare = "INSERT INTO smartshare.files (file_name,time_created, expiry_time,max_downloads,total_downloads,password) VALUES (?,?,?,?,?,?)";

			
			PreparedStatement preparedStatement = connection.prepareStatement(Prepare);
			preparedStatement.setString(1, "hello.xml");
			
			Timestamp time = new Timestamp(System.currentTimeMillis() * 1000);
			preparedStatement.setTimestamp(2, time);
			preparedStatement.setTimestamp(3, time);
			preparedStatement.setInt(4, 3);
			preparedStatement.setInt(5, 3);
			preparedStatement.setString(6, "posucerbdwfnijrznwvx");

			// Execute the prepared statement to save the user to the database
			preparedStatement.executeUpdate();
			
			
			
			        List<User> users = new ArrayList<User>();
			        try {
			            Statement stmt = connection.createStatement();
			            ResultSet resultSet = stmt.executeQuery("SELECT * from smartshare.files;");
			            while (resultSet.next()) {
			                
			                        System.out.println(resultSet.getString("file_name"));
			                        System.out.println(resultSet.getString("password"));
			                       
			                       
			                    
			                
			            }
			        } catch (SQLException e) {
			            e.printStackTrace();
			        }
			        

			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

    /*  for (User user : users) {
    	  System.out.println(user);
       
           }*/
       }
    }


