package model;

import daoimpl.UserDAOImpl;

public class User {

	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	public void registerUser(User userObj) throws Exception {
	    new UserDAOImpl().addUser(userObj);
	}
	
	public User validateUser(String userName,String pass) throws Exception {
		return new UserDAOImpl().validateUser(userName, pass);
	}
	
	public User viewProfile(String userName) throws Exception{
		return new UserDAOImpl().getUser(userName);
	}
	
	public boolean changePwd(String userName,String newPassword) throws Exception{
		return new UserDAOImpl().changePassword(userName,newPassword);
	}
	
	
	

}
