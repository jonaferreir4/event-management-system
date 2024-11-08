package core.Model;

import java.util.ArrayList;	
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;




public class Events {
	private static int nextEventIDCounter = 1;
	private String eventID; 
	private String eventName;
	private Users creator;
	private String type;
	private String category;
	private String description;
	private String address;
	private String theme;
	private LocalDateTime dateStartEvent;
	private LocalDateTime dateEndEvent;


	private ArrayList<Users> participants = new ArrayList<Users>(); 
	private ArrayList<Activity> activities = new ArrayList<Activity>();

	public Events() {
		
	}
	
	public Events(String eventname,Users creator,String type, String category, String description, String address, String theme, LocalDateTime dateStartEvent, LocalDateTime dateEndEvent ) {
		this.eventID = generateEventID();
		this.eventName = eventname;
		this.creator = creator;
		this.type = type;
		this.category = category;
		this.description = description;
		this.address = address;
		this.theme = theme;
		this.dateStartEvent = dateStartEvent;
		this.dateEndEvent = dateEndEvent;
		
	}
	
	
		
	 public String getEventID() {
		return eventID;
	}

	public void setEventID(String eventID) {
		if (eventID != null) {
			this.eventID = eventID;			
		}
	}

	public Users getCreator() {
		return creator;
	}
	
	public void setCreator(Users creator) {
		if (creator != null) {
			this.creator = creator;
		}
	}


	public void addParticipant(Users participant) {
	        participants.add(participant);
	    }

	    public void removeParticipant(Users participant) {
	        participants.remove(participant);
	    }

	    public ArrayList<Users> getParticipants() {
	        return participants;
	    }
	    
	    public void addActivity(Activity activity) {
	        activities.add(activity);
	    }
	    
	    public Activity getActivity(String activityName){
	    	for (Activity activity : activities) {
	    	    if (activity != null && activityName.equals(activity.getActivityName())) {
	    	        return activity;
	    	    }
	    	}
	    	
	    	return null;
	    }

	    public void removeActivity(Activity activity) {
	        activities.remove(activity);
	    }

	    public ArrayList<Activity> getActivities() {
	        return activities;
	    }
	    
	    public void setActivities(ArrayList<Activity> activities) {
	    	this.activities = activities;
	    }
	
	public void setParticipants(ArrayList<Users> participants) {
		this.participants = participants;
	}
	
	public void setEventName(String name){
		if (name != null) {
			this.eventName = name;
		}
	}

	public void setType(String type){
		if (type != null) {
			this.type = type;			
		}
	}

	public void setCategory(String category){
		if (category != null) {
			this.category = category;			
		}
	}

	public void setAddress(String address){
		if (address != null) {
			this.address = address;			
		}
	}
	
	public void setDescription(String description){
		if ( description != null) {
			this.description = description;			
		}
	}
	
	public void setTheme(String theme){
		if (theme != null) {
			this.theme = theme;			
		}
	}

	
	public void setDateStartEvent(LocalDateTime dateStartEvent){
		if (dateStartEvent != null) {
		this.dateStartEvent = dateStartEvent;
		}
	}
	
	public void setDateEndEvent(LocalDateTime dateEndEvent){
		if (dateEndEvent != null) {			
		this.dateEndEvent = dateEndEvent;
		}
	}
	

	public String getEventName(){
		return eventName;
	}

	public String getType(){
		return type;
	}

	public String getCategory(){
		return category;
	}

	public String getAddress(){
		return address;
	}
	
	public String getDescription(){
		return description;
	}
	
	public String getTheme(){
		return theme;
	}
	
	public LocalDateTime getDateStartEvent(){
		return dateStartEvent;
	}
	
	public LocalDateTime getDateEndEvent() {
		return dateEndEvent;
	}
	
	private String generateEventID() {
	    return  String.valueOf(nextEventIDCounter++);
	}

	
  @Override
    public String toString() {
        return "ID: " + eventID + " - Nome: " + eventName + " - Tipo: " + type + " - Categoria: " + category + " - Descrição: " + description + " - Endereço: " + address + " - Tema: " + theme + " - Data de início: " + dateStartEvent + " - Data de término: " + dateEndEvent;
    }
}