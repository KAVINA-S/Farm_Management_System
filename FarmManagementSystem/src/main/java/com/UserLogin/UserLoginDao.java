package com.UserLogin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.UserLogin.UserLogin;

public class UserLoginDao {
	 public boolean select(UserLogin userlogin) throws SQLException {
	    	boolean result = false;
	    	
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/FarmManagementSystem", "root", "Kavina112286");
	            String query = "select * from NewUserLogin(EmailID,Password) values(?,?)";
	            PreparedStatement ps = con.prepareStatement(query);
	            
	            ps.setString(1, userlogin.getEmail());
	            ps.setString(2, userlogin.getPassword());
	            

	            int rowsAffected = ps.executeUpdate();

	            ps.close();
	            con.close();
	            

	            // Return true if at least one row was affected, indicating a successful insert.
	            return rowsAffected > 0;

	        } catch (ClassNotFoundException | SQLException e) {
	            // Handle exceptions appropriately, e.g., log or throw.
	            e.printStackTrace();
	        }
	        
	        return result;
	    }

}
