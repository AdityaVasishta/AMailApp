package daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dao.UserDAO;
import model.User;
import utility.ConnectionProvider;

public class UserDAOImpl implements UserDAO {
	
     @Override
 	public User getUser(String userName) throws Exception {
    	 
    	 Connection conn=ConnectionProvider.getconn();
    	 PreparedStatement ps=conn.prepareStatement("select * from jsptable where username=?");
    	 ps.setString(1, userName);
    	 ResultSet rs=ps.executeQuery();
    	 if(rs.next()) {
    		 
    		 User user=new User();
    		 user.setUserName(rs.getString(1));
    		 user.setPassword(rs.getString(2));
    		 user.setFirstName(rs.getString(3));
    		 user.setLastName(rs.getString(4));
    		 
    		 
    		 return user;
    		 
    	 }
    	 else {
        	 return null ;
 
    	 }
		
	}
    
      @Override  
	public User validateUser(String userName,String pass) throws Exception {
    	  System.out.println("Validate is called");
    	  Connection conn=ConnectionProvider.getconn();
    	  System.out.println("Connnection called");
    	  PreparedStatement ps=conn.prepareStatement("select * from jsptable where username=? and password=? ");
    	  ps.setString(1, userName);
    	  ps.setString(2, pass);
    	  ResultSet rs=ps.executeQuery();
    	  System.out.println("After Execute Query");
    	  
    	  if(rs.next()) {
    		   
    		  User user =new User();
    		  user.setUserName(rs.getString(1));
    		  user.setPassword(rs.getString(2));
    		  user.setFirstName(rs.getString(3));
    		  user.setLastName(rs.getString(4));
    		  
    		  return user;
    	  }
    	  else {
    		  return null; 
    	  }
    	  
	}
      @Override
	public boolean changePassword(String userName, String newPassword) throws Exception {
		
    	  Connection conn=ConnectionProvider.getconn();
    	  PreparedStatement ps=conn.prepareStatement("update jsptable set password=? where username=?");
    	  ps.setString(1, newPassword);
    	  ps.setString(2, userName);
    	  int i=ps.executeUpdate();
    	  if(i==0) {
    		  return false;
    		  
    	  }
    	  return true;
	}
      @Override
	public boolean addUser(User user) throws Exception {
		
    	  Connection conn= ConnectionProvider.getconn();
    	  PreparedStatement ps=conn.prepareStatement("insert into jsptable values(?,?,?,?)");
    	  ps.setString(1, user.getUserName() );
    	  ps.setString(2, user.getPassword());
    	  ps.setString(3, user.getFirstName());
    	  ps.setString(4, user.getLastName());
    	  
    	  ps.executeUpdate();
    	  return true;
		
	}

	

}
