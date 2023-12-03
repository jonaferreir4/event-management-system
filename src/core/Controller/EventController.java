package core.Controller;

import java.util.ArrayList;

import core.Utils.Date;
import core.Utils.Time;
import core.Model.*;

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
    	if (user == null) {
             return false;
        }
        return (user.getNivel() == Nivel.USER ||
                user.getNivel() == Nivel.ORGANIZER || 
                user.getNivel() == Nivel.PARTICIPANT);
    }

    private boolean hasOrganizerPermission() {
    	if (user == null) {
            return false;
       }
        return user.getNivel().equals(Nivel.ORGANIZER);
    }

    private boolean hasParticipantPermission() {
    	if (user == null) {
            return false;
       }
        return user.getNivel().equals(Nivel.PARTICIPANT);
    }
    
	    public Events createEvent(String eventID, String eventName, Users creator, String type, String category, String description, String address, String theme) {
	        if (hasUserPermission()) {
	            Events newEvent = new Events(eventID, eventName, creator, type, category, description, address, theme);
	            creator.setNivel(Nivel.ORGANIZER);
	            eventsList.add(newEvent);
	            user.addMyEvent(newEvent);
	            return newEvent;
	        } else {
	            System.out.println("Você não tem permissão para criar eventos.");
	            return null;
	        }
	    }

    public Events searchEventByName(String name) {
    	 if(hasUserPermission() &&  this.user != null){
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
    		/// implementar lógica para deletar evento
    	}
    }

    public void registerParticipantForEvent(Users user, Events event) {
    	 if (hasUserPermission()) {
    	            event.addParticipant(user);
    	            user.setNivel(Nivel.PARTICIPANT);
    	            System.out.println("Inscrição realizada com sucesso!");
    	       
    	        } else {
    	        System.out.println("Você não tem permissão para se inscrever em eventos.");
    	    }
    }
    
    public void setCurrentUser(Users user) {
        this.user = user;
    }
}
