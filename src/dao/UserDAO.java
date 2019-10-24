package dao;

import model.User;

public interface UserDAO {
	
	public boolean addUser(User user) throws Exception;
	public User validateUser(String userName,String password) throws Exception;
	public User getUser(String userName) throws Exception;
	public boolean changePassword(String userName,String newPassword) throws Exception;
	

}
