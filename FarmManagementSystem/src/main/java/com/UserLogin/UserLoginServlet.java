package com.UserLogin;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class UserLoginServlet
 */
@WebServlet ("/UserLoginServlet")
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String email = request.getParameter("email");
        String password = request.getParameter("password");
       
        // Create a NewUserLogin object
        UserLogin userlogin = new UserLogin(email, password);

        // Create an instance of NewUserLoginDao
        UserLoginDao UserLoginDao = new UserLoginDao();

        try {
            // Call the insert method of NewUserLoginDao
            boolean result = UserLoginDao.select(userlogin);

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
