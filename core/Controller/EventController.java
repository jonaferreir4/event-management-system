package core.Controller;

import java.util.ArrayList;
import core.Model.Users;
import core.Utils.Date;
import core.Utils.Time;
import core.Model.Events;
import core.Model.Nivel;
import core.Model.Participant;

public class EventController {
    private ArrayList<Events> eventsList;
    private Users user;

    public EventController() {
        eventsList = new ArrayList<Events>();

    }
    
    public EventController(Users user) {
        this.user = user;
        eventsList = new ArrayList<Events>();
    }
    
    private boolean hasUserPermission() {
        return	(user.getNivel() == Nivel.USER ||
        user.getNivel() == Nivel.ORGANIZER || 
        user.getNivel() == Nivel.PARTICIPANT);
    }

    private boolean hasOrganizerPermission() {
        return user.getNivel().equals(Nivel.ORGANIZER);
    }

    private boolean hasParticipantPermission() {
        return user.getNivel().equals(Nivel.PARTICIPANT);
    }
    
    public void createEvent(String eventID, String Eventname, String type, String category, String description, String address, String theme) {
        if (hasUserPermission()) {
            Events newEvent = new Events(eventID,Eventname, type, category, description, address, theme);
            eventsList.add(newEvent);
        } else {
            System.out.println("Você não tem permissão para criar eventos.");
        }
    }

    public Events searchEventByName(String name) {
    	 if(hasUserPermission()){
    		 for (Events event : eventsList) {
    			 if (event.getEventName().equals(name)) {
    				 return event;
    			 }
    		 }
    	 }
    	 return null; // Retorna null se o evento não for encontrado
    }

    public String listEvents() {
    	 ArrayList<String> eventsAsStringList = new ArrayList<String>();
    	    if (eventsList != null) {
    	    	String eventList = eventsList.toString();
    	    	return eventList;
    	    }else {
    	    	return "Não há eventos Cadastrados";
    	    }
    	    
    	    
    	    
    }

    public void updateEvent(String nome) {
        if(hasOrganizerPermission()) {
        	Events event = searchEventByName(nome);
        	if (event != null) {
        		// Implemente a lógica de atualização aqui
        	}
        	
        }
    }

    public void deleteEvent(String nome, String tipo) {
    	if(hasOrganizerPermission()) {
    		
    	}
    }

    public void registerParticipantForEvent(Users user, String eventName, Participant participant) {
    	if (hasUserPermission()) {
    		Events event = searchEventByName(eventName);
            	if (event != null) {
                event.addParticipant(participant);
            }
        }
    }
    
    public void setCurrentUser(Users user) {
        this.user = user;
    }
}
