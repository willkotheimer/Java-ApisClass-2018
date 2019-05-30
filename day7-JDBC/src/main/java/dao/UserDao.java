package dao;
import entity.User;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

    private static final String URL = "jdbc:postgresql://localhost:5432/postgres/schemadesign";
    private static final String USER = "postgres";
    private static final String PASSWORD = "bondstone";

    public UserDao() {

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Unable to load the postgreSQL Driver.");
        }

    }

    public List<User> getAll () {
        List<User> users = new ArrayList<User>();
        try (
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
        ) {
            Statement stmt = connection.createStatement();
            ResultSet resultSet = stmt.executeQuery("SELECT * from public.user;");
            while (resultSet.next()) {
                users.add(
                    new User(
                        resultSet.getString("interest"),
                        resultSet.getString("location"),
                        resultSet.getString("person")
                       
                    )
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    public User save (User user) {
        try (
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
        ) {
            // Create and populate a prepared statement
            String sql = "INSERT INTO public.user (username, password, firstname, lastname) VALUES (?, ?, ?, ?);";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2, user.getpassword());
            preparedStatement.setString(3, user.getFirstname());
            preparedStatement.setString(4, user.getLastname());
            // Execute the prepared statement to save the user to the database
            preparedStatement.executeUpdate();

            // Get the new users id from the database (We do this because the database generated the id)
            PreparedStatement getId = connection.prepareStatement("SELECT id FROM public.user WHERE username = ?;");
            getId.setString(1, user.getUsername());
            getId.executeQuery();
            ResultSet resultSet = getId.executeQuery();
            while(resultSet.next()) {
                user.setId(resultSet.getInt("id"));
            }

            // If the user was saved successfully and we were able to add its id, return the new user.
            return user;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

 


}