package core.Model;

import core.Utils.Date;

public class Users  implements State{
	private String userID;
	private String name;
	private String email;
	private String password;
	private String dateOfBirth;
	private Nivel nivel;
	private boolean state;
	
	public Users(String userID, String name, String email, String password, String dateOfBirth) {
		this.userID = userID;
		this.name = name;
		this.email = email;
		this.password = password;
		this.dateOfBirth = dateOfBirth;
		this.nivel = nivel.USER;
		this.state = true;
	}
	
	public Users() {
		this.state = true;
	}
	
	
	 public Nivel getNivel() {
		return nivel;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
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

	public void setDateOfBirth(String dateOfBirth){
		if (dateOfBirth != null) {
		this.dateOfBirth = dateOfBirth;
		}
	}

	public String getName(){
		return name;
	}

	@Override
	public void reset() {
		this.state = true;
	}
	@Override	
	public void changeState() {
		this.state = !this.state;
	}
	
	
	public String getEmail(){
		return email;
	}

	public String getPassword(){
		return password;
	}

	public String getDateOfBirth(){
		return dateOfBirth;
	}
	
}
