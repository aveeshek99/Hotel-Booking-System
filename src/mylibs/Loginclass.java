package mylibs;

public class Loginclass {
	String Email;
	String Password;
	String name;
	int id;
	
	public Loginclass() {
		this.Email = "";
		this.Password = "";
		this.name = "";
		this.id = 0;
	}
	
	public Loginclass(String email, String password, String name, int id) {
		this.Email = email;
		this.Password = password;
		this.name = name;
		this.id = id;
	}
	
	public String getEmail() {
		return Email;
	}
	
	public void setEmail(String email) {
		Email = email;
	}
	
	public String getPassword() {
		return Password;
	}
	
	public void setPassword(String password) {
		Password = password;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	 
	@Override
	public String toString() {
		return "Loginclass [Email=" + Email + ", Password=" + Password + ", name=" + name + ", id=" + id + "]";
	}
	
	
}
