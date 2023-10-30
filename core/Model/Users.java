package core.Model;

import core.Utils.Date;

public class Users {
	private String name;
	private String email;
	private String password;
	private Date dateOfBirth;
	
	public Users(String name, String email, String password, Date dateOfBirth) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.dateOfBirth = dateOfBirth;
	}
	
	public Users() {
		
	}

	public void setName(String name){
		if (name != null) {
			this.name = name;			
		}
	}

	public void setEmail(String email){
		if (email != null) {
		this.email = email;
		}
	}

	public void setPassword(String password){
		if (password != null) {
		this.password = password;
		}
	}

	public void setDateOfBirth(Date dateOfBirth){
		if (dateOfBirth != null) {
		this.dateOfBirth = dateOfBirth;
		}
	}

	public String getName(){
		return name;
	}

	public String getEmail(){
		return email;
	}

	public String getPassword(){
		return password;
	}

	public Date getDateOfBirth(){
		return dateOfBirth;
	}
}
