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

 // No método EventController.updateEvent
    public void updateEvent(String nome, String novoNome, String novoTipo, String novaCategoria, String novaDescricao, String novoEndereco, String novoTema) {
        if (hasOrganizerPermission()) {
            Events event = searchEventByName(nome);
            if (event != null) {
                // Atualizar os atributos do evento apenas se o novo valor não for nulo
                if (novoNome != null) {
                    event.setEventName(novoNome);
                }
                if (novoTipo != null) {
                    event.setType(novoTipo);
                }
                if (novaCategoria != null) {
                    event.setCategory(novaCategoria);
                }
                if (novaDescricao != null) {
                    event.setDescription(novaDescricao);
                }
                if (novoEndereco != null) {
                    event.setAddress(novoEndereco);
                }
                if (novoTema != null) {
                    event.setTheme(novoTema);
                }        
            } 
        } else {
            System.out.println("Você não tem permissão para atualizar eventos.");
        }
    }


    public void deleteEvent(String nome) {
        if (hasOrganizerPermission()) {
            Events event = searchEventByName(nome);
            if (event != null) {
                // Remover evento da lista
                eventsList.remove(event);
            }
        } else {
            System.out.println("Você não tem permissão para remover eventos.");
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
