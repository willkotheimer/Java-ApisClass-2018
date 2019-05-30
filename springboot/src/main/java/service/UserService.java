package service;

import java.util.List;

public class UserService {

	private List<User> users;

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public UserService(List<User> users) {
		super();
		this.users = users;
	}
	
}
