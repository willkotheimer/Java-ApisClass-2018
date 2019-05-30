package entity;

public class User {

	
	//Create a Bean
	
	private long id;
	private String username;
	private String firstname;
	private String lastname;
	private String password;
	
	
	public User() {
		
	}
	
	
	public User(long id, String username, String password, String firstname, String lastname) {
		super();
		this.id = id;
		this.username = username;
		this.password =  password;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	public User(String username, String firstname, String lastname) {
		super();
		
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", firstname=" + firstname + ", lastname=" + lastname
				+ "]";
	}


	public String getpassword() {
		return password;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	
}
