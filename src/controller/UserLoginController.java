package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.User;

/**
 * Servlet implementation class UserLoginController
 */
@WebServlet("/UserLoginController")
public class UserLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
     

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		
		String s1= request.getParameter("t1");
		String s2=request.getParameter("t2");
		
		User userModel=new User();
		try {
			 System.out.println("UserlOginController");
			User obj=userModel.validateUser(s1, s2);
		    if(obj!=null) {
		    	
		          HttpSession session=request.getSession();
		          session.setAttribute("userObj", obj);
		          RequestDispatcher rd=request.getRequestDispatcher("Sucess.jsp");
		          rd.forward(request, response); 
		    
		    }
		    else
		    {
		    	response.sendRedirect("Error.jsp");
		    }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
