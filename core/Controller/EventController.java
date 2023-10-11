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
         eventManager.addEvent(newEvent);    }

    public void carryOutRegistration(Users user, Events event) {
        // Lógica para registrar a inscrição de um usuário em um evento
    }
}
