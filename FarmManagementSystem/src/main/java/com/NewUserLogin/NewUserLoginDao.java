package com.NewUserLogin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Result;

public class NewUserLoginDao {

    public boolean insert(NewUserLogin newuserlogin) throws SQLException {
    	boolean result = false;
    	
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/FarmManagementSystem", "root", "Kavina112286");
            String query = "insert into NewUserLogin(Fname, Lname, Gender, EmailID, Contact, Password, Cpassword) values(?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, newuserlogin.getFname());
            ps.setString(2, newuserlogin.getLname());
            ps.setString(3, newuserlogin.getGender());
            ps.setString(4, newuserlogin.getEmail());
            ps.setString(5, newuserlogin.getContact());
            ps.setString(6, newuserlogin.getPassword());
            ps.setString(7, newuserlogin.getCpassword());

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
