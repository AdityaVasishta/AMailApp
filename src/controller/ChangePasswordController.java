package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.User;

@WebServlet("/ChangePasswordController")
public class ChangePasswordController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	    response.setContentType("text/html");
	    String pwd1=request.getParameter("password1");
	    PrintWriter out=response.getWriter();
	    
	    HttpSession session=request.getSession();
	    User user =(User)session.getAttribute("userObj");
	    try {
			
	    	boolean result=user.changePwd(user.getUserName(),pwd1);
	    	if(result) {
	    		out.println("Password Changed SucessFully....");
	    		session.setAttribute("userObj", user.viewProfile(user.getUserName()));
	    	}
	    	else {
	    		
	    	}
		}
	    catch (Exception e) {
			e.printStackTrace();
		}
        response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
