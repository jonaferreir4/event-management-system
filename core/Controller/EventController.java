package core.Controller;

import core.Model.Users;
import core.Model.EventManager;
import java.util.ArrayList;
import core.Model.Events;


public class EventController {
	
	private EventManager eventManager;

	public EventController(EventManager eventManager) {
		this.eventManager = eventManager;
		}
	
    public void createEvent(String Eventname,String type, String category, String description, String address, String theme) {
    	 Events newEvent = new Events(Eventname, type, category, description, address, theme);
         eventManager.addEvent(newEvent);   
         }
    
    public void searchEvent(String name) {
    	 Events foundEvent = eventManager.getEventByName(name);

    	    if (foundEvent != null) {
    	    	// mandar evento para a view
    	    } else {
    	       // mandar mensagem de nao encontrado para a view
    	   
    	    }
    }

    public void listEvents() {
    	 ArrayList<Events> events = eventManager.getAllEvents();

    	    if (!events.isEmpty()) {
    	        // Exiba a lista de eventos
    	    } else {
    	       //Nenhum evento disponível no momento.
    	    }
    }
    
    public void upDateEvent(String nome, String tipo) {
    	// atualizar evento
    }
    
    public void deleteEvent(String nome, String tipo) {
    	// deletar evento 
    }
    
    
}
