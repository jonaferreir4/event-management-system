package core.Model;

import java.util.ArrayList;

import core.Utils.Date;

public class Users {
	private String userID;
	private String name;
	private String email;
	private String password;
	private String dateOfBirth;
	private Nivel nivel;
	// como organizador
	private ArrayList<Events> myEvents = new ArrayList<Events>();
	// como participante
	private ArrayList<Events> registeredEvents;
	private ArrayList<Activity> registeredActivities;
	
	public Users(String userID, String name, String email, String password, String dateOfBirth) {
		this.userID = userID;
		this.name = name;
		this.email = email;
		this.password = password;
		this.dateOfBirth = dateOfBirth;
		this.nivel = nivel.USER;
	}
	
	public Users() {
	}
	
	
	public String getMyEvents(){
		 StringBuilder eventsInfo = new StringBuilder();

		    for (Events event : myEvents) {
		        eventsInfo.append(event.toString()).append("\n");
		    }

		    if (myEvents.isEmpty()) {
		        eventsInfo.append("Nenhum evento encontrado.");
		    }

		    return eventsInfo.toString();

	}
	
	public void addMyEvent(Events event) {
		if (event != null) {
			myEvents.add(event);
		}
	}
	public void registerInEvents(Events event) {
		if (event != null) {
			registeredEvents.add(event);
		}
	}
	
	public void registerInActivity(Activity activity) {
		if (activity != null) {
			registeredActivities.add(activity);
		}
	}
	
	

	 public Nivel getNivel() {
		return nivel;
	}
	 
	 public void setNivel(Nivel nivel) {
		 if (nivel != null) {
			 this.nivel = nivel;
		 }
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
