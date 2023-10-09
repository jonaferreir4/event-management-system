package core.Model;

import core.Utils.Date;
import core.Utils.Time;

public class Activity {
	
	private String ActivityName;
	private String theme;
	private String type;
	private String description;
	private String Localization;
	private String speaker;
	private Date dateActivity;
	private Time timeActivity;
	private Time duration;
	
	public Activity(String ActivityName, String theme, String type, String description,
	String Localization, String speaker,Date dateActivity,Time timeActivity,Time duration) {
		this.ActivityName = ActivityName;
		this.theme = theme;
		this.type = type;
		this.description = description;
		this.Localization = Localization;
		this.speaker = speaker;
		this.dateActivity = dateActivity;
		this.timeActivity = timeActivity;
		this.duration = duration;
	}
	
	 // Metods
	
	/* ... */
	
	
	
	// getters and setters
	public String getActivityName(){
		return this.ActivityName;
	}
	
	public void setActivityName(String newName){
		this.ActivityName = newName;
	}
	
	public String getTheme(){
		return this.theme;
	}
	
	public void setTheme(String newTheme){
		this.theme = newTheme;
	}
	
	public String getType(){
		return this.type;
	}
	
	public void setType(String newType){
		this.type = newType;
	}
	
	public String getDescription(){
		return this.description;
	}
	
	public void setDescription(String newDescription){
		this.description = newDescription;
	}
	
	public String getLocalization(){
		return this.Localization;
	}
	
	public void setLocalization(String newLocalization){
		this.Localization = newLocalization;
	}
	
	public String getSpeaker(){
		return this.speaker;
	}
	
	public void setSpeaker(String newSpeaker){
		this.speaker = newSpeaker;
	}
	public Date getDateActivity(){
		return this.dateActivity;
	}
	
	public void setDateActivity(Date newDateActivity){
		this.dateActivity = newDateActivity;
	}
	public Time getTimeActivity(){
		return this.timeActivity;
	}
	
	public void setTimeActivity(Time newTimeActivity){
		this.timeActivity = newTimeActivity;
	}
	
	public Time getDuration(){
		return this.duration;
	}
	
	public void setDuration(Time newDuration){
		this.duration = newDuration;
	}
	
}
