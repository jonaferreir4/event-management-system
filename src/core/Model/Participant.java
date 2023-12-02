package core.Model;

import java.util.ArrayList;
import core.Utils.Date;

public class Participant  extends Users{
	private String participantID;
	private Nivel nivel;
	private ArrayList<String> registeredEvents;
	private ArrayList<String> registeredActivities;
	
	public Participant(String participantID, String name, String email, String password, String dateOfBirth) {
	    super(participantID, name, email, password, dateOfBirth);
	    this.nivel = Nivel.PARTICIPANT;
	}
	
	
	public String getParticipantID() {
		return participantID;
	}

	public void setParticipantID(String participantID) {
		if (participantID != null) {
			this.participantID = participantID;			
		}
	}
	
	

	public Nivel getNivel() {
		return nivel;
	}


	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
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
