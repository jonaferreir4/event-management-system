package core.Model;

import java.util.ArrayList;	

import core.Utils.Date;
import core.Utils.Time;


public class Events {
	private String eventID; 
	private String eventName;
	private Organizer owner;
	private Users creator;
	private String type;
	private String category;
	private String description;
	private String address;
	private String theme;
	private Date dateStartEvent;
	private Date dateEndEvent;
	private Time timeEvent;


	private ArrayList<Participant> participants; 
	private ArrayList<Activity> activities;

	public Events() {
		
	}
	
	public Events(String eventID,String eventname,Organizer owner,Users creator,String type, String category, String description, String address, String theme ) {
		this.eventID = eventID; 
		this.eventName = eventname;
		this.owner = owner;
		this.creator = creator;
		this.type = type;
		this.category = category;
		this.description = description;
		this.address = address;
		this.theme = theme;
		this.participants = new ArrayList<Participant>();
		this.activities = new ArrayList<Activity>();
	}
	
	
		
	 public String getEventID() {
		return eventID;
	}

	public void setEventID(String eventID) {
		if (eventID != null) {
			this.eventID = eventID;			
		}
	}

	public Organizer getOwner() {
		return owner;
	}

	public void setOwner(Organizer owner) {
		if(owner != null) {
			this.owner = owner;
		}
	}

	public void setActivities(ArrayList<Activity> activities) {
		this.activities = activities;
	}

	public void addParticipant(Participant participant) {
	        participants.add(participant);
	    }

	    public void removeParticipant(Participant participant) {
	        participants.remove(participant);
	    }

	    public ArrayList<Participant> getParticipants() {
	        return participants;
	    }
	    
	    public void addActivity(Activity activity) {
	        activities.add(activity);
	    }
	    
	    public Activity getActivity(String activityID){
	    	if (activityID != null) {
	    		for(Activity activity : activities) {
	    			if(activity != null) {
	    				return activity;
	    			}
	    			
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
	    
	
	public void setParticipants(ArrayList<Participant> participants) {
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

	
	public void setDateStartEvent(Date dateStartEvent){
		if (dateStartEvent != null) {
		this.dateStartEvent = dateStartEvent;
		}
	}
	
	public void setDateEndEvent(Date dateEndEvent){
		if (dateEndEvent != null) {
		this.dateEndEvent = dateEndEvent;
		}
	}
	
	public void setTimeEvent(Time timeEvent){
		if (timeEvent != null) {
		this.timeEvent = timeEvent;
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
	
	public Date getDateStartEvent(){
		return dateStartEvent;
	}
	
	public Date getDateEndEvent() {
		return dateEndEvent;
	}
		
	public Time getTimeEvent(){
		return timeEvent;
	}
	
  @Override
    public String toString() {
        return "Evento{" + "eventID=" + eventID + ", eventName=" + eventName + ", type=" + type + ", category=" + category + ", description=" + description + ", address=" + address + ", theme=" + theme + ", dateStartEvent=" + dateStartEvent + ", dateEndEvent=" + dateEndEvent + ", timeEvent="+ timeEvent + '}';
    }
}
