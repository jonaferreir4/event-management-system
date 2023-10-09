package core.Model;

import core.Utils.Date;

public class Users {
	private String name;
	private String email;
	private String password;
	Date dateOfBirthday;
	
	public Users(String name, String email, String password) {
		this.name = name;
		this.email = email;
		this.password = password;
	}
	
}
