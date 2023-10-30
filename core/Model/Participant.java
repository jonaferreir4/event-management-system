package core.Model;

import java.util.ArrayList;
import core.Utils.Date;

public class Participant  extends Users{
	private String participantID;
	private ArrayList<String> registeredEvents;
	private ArrayList<String> registeredActivities;
	
	public Participant() {
		super();
	}
	
	
	public String getParticipantID() {
		return participantID;
	}

	public void setParticipantID(String participantID) {
		if (participantID != null) {
			this.participantID = participantID;			
		}
	}

	public ArrayList<String> getRegisteredEvents() {
		return registeredEvents;
	}

	public void setRegisteredEvents(ArrayList<String> registeredEvents) {
		if (registeredEvents != null) {
		this.registeredEvents = registeredEvents;
		}
	}

	public ArrayList<String> getRegisteredActivities() {
		return registeredActivities;
	}

	public void setRegisteredActivities(ArrayList<String> registeredActivities) {
		if (registeredActivities != null) {
		this.registeredActivities = registeredActivities;
		}
	}

	
}
