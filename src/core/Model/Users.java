package core.Model;

import java.util.ArrayList;

import core.Utils.Date;

public class Users {
	private static int nextUserIDCounter = 1;
	private String userID;
	private String name;
	private String email;
	private String password;
	private String dateOfBirth;
	private Nivel nivel;
	// como organizador
	private ArrayList<Events> myEvents = new ArrayList<Events>();
	private ArrayList<Activity> myActivities = new ArrayList<Activity>();
	// como participante
	private ArrayList<Events> registeredEvents;
	private ArrayList<Activity> registeredActivities;
	
	public Users( String name, String email, String password, String dateOfBirth) {
		this.userID = generateUserID();
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
	
	public String getMyActivities(){
		 StringBuilder activitiesInfo = new StringBuilder();

		    for (Activity activity : myActivities) {
		    	activitiesInfo.append(activity.toString()).append("\n");
		    }

		    if (myEvents.isEmpty()) {
		    	activitiesInfo.append("Nenhuma atividade encontrada.");
		    }

		    return activitiesInfo.toString();

	}
	
	public void addMyActivity(Activity activity) {
		if (activity != null) {
			myActivities.add(activity);
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
	
	private String generateUserID() {
	    return  String.valueOf(nextUserIDCounter++);
	}
	
}
