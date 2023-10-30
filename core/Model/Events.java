package core.Model;

import java.util.ArrayList;	

import core.Utils.Date;
import core.Utils.Time;


public class Events {
	private String EventName;
	private String type;
	private String category;
	private String description;
	private String address;
	private String theme;
	private Date dateStartEvent;
	private Date dateEndEvent;
	private Time timeEvent;	
	private ArrayList<Activity> activities;

	
	public Events(String Eventname,String type, String category, String description, String address, String theme ) {
		 this.EventName = Eventname;
		 this.type = type;
		 this.category = category;
		 this.description = description;
		 this.address = address;
		 this.theme = theme;
		 this.activities = new ArrayList<Activity>();
	}
	
	public void setEventName(String name){
		if (name != null) {
			this.EventName = name;
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
	
	public void setActivities(ArrayList<Activity> activity){
		if (activity != null) {
			this.activities = activity;			
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
		return EventName;
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
	
	public ArrayList<Activity> getActivities(){
		return activities;
	}
	
	public Date getDateStartEvent(){
		return dateStartEvent;
	}
	
	public Date getDateEndtEvent(){
		return dateEndEvent;
	}

	
	public Time getTimeEvent(){
		return timeEvent;
	}
}
