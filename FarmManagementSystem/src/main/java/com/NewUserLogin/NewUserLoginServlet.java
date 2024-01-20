package com.NewUserLogin;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class NewUserLoginServlet
 */
@WebServlet ("/NewUserLoginServlet")
public class NewUserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		 String fname = request.getParameter("fname");
	        String email = request.getParameter("email");
	        String password = request.getParameter("password");
	        String gender = request.getParameter("gender");
	        String lname = request.getParameter("lname");
	        String contact = request.getParameter("contact");
	        String cpassword = request.getParameter("cpassword");

	        // Create a NewUserLogin object
	        NewUserLogin newuserlogin = new NewUserLogin(fname, email, password, gender, lname, contact, cpassword);

	        // Create an instance of NewUserLoginDao
	        NewUserLoginDao newUserLoginDao = new NewUserLoginDao();

	        try {
	            // Call the insert method of NewUserLoginDao
	            boolean result = newUserLoginDao.insert(newuserlogin);

	            // You can use the result to determine the success of the operation
	            if (result) {
	                // Successful insertion
	                response.sendRedirect("success.jsp"); // Redirect to a success page
	            } else {
	                // Failed insertion
	                response.sendRedirect("failure.jsp"); // Redirect to a failure page
	            }
	        } catch (Exception e) {
	            // Handle exceptions appropriately, e.g., log or display an error page
	            e.printStackTrace();
	            response.sendRedirect("error.jsp"); // Redirect to an error page
	        }
	}

}
