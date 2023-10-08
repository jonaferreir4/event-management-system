package com.eventManagementSystem.core;

import java.util.ArrayList;


public class Events {
	private String Eventname;
	private String type;
	private String category;
	private String description;
	private String address;
	private String theme;
	private Date dateEvent;
	private Time timeEvent;	
	private ArrayList<Activity> activities;

	
	public Events(String Eventname,String type, String category, String description, String address,String theme ) {
		 this.Eventname = Eventname;
		 this.type = type;
		 this.category = category;
		 this.description = description;
		 this.address = address;
		 this.theme = theme;
		 this.activities = new ArrayList<Activity>();
	}
	
}
