package core.Model;

import core.Utils.Date;

import java.time.LocalDateTime;
import java.util.ArrayList;
import core.Utils.Time;

public class Activity {
	private static int nextActivityIDCounter = 1;
	private String activityID;
	private String ActivityName;
	private String theme;
	private String type;
	private String description;
	private String Localization;
	private String speaker;
	private LocalDateTime dateActivity;
	private LocalDateTime duration;
	private ArrayList<Users> participants;
	
	public Activity() {
		participants = new ArrayList<Users>();
		
	}
	
	
	public Activity( String activityName, String theme, String type, String description,
			String localization, String speaker, LocalDateTime dateActivity, LocalDateTime duration) {
		this.activityID = generateActivityID();
		this.ActivityName = activityName;
		this.theme = theme;
		this.type = type;
		this.description = description;
		this.Localization = localization;
		this.speaker = speaker;
		this.dateActivity = dateActivity;
		this.duration = duration;
	}


	public String getActivityName(){
		return this.ActivityName;
	}
	
	public String getActivityID() {
		return activityID;
	}

	public void setActivityID(String activityID) {
		this.activityID = activityID;
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
	 public LocalDateTime getDateActivity() {
	        return this.dateActivity;
	    }

	    public void setDateActivity(LocalDateTime newDateActivity) {
	        this.dateActivity = newDateActivity;
	    }

	    public LocalDateTime getDuration() {
	        return this.duration;
	    }

	    public void setDuration(LocalDateTime newDuration) {
	        this.duration = newDuration;
	    }

	
	public void addParticipant(Users participant) {
		if(participant != null) {
			participants.add(participant);
		}
	}
	
	private String generateActivityID() {
	    return  String.valueOf(nextActivityIDCounter++);
	}
	
	@Override
    public String toString() {
        return "activityID=" + activityID + ", ActivityName=" + ActivityName + ", theme=" + theme  + ", type=" + type + ", description=" + description + ", Localization=" + Localization + ", speaker=" + speaker + ", dateActivity=" + dateActivity + ", duration="+ duration;
    }
	
}
