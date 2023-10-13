package core.Model;

import java.util.ArrayList;

// Classe temporária para servir como banco 

public class EventManager {
    private ArrayList<Events> eventsList;

    public EventManager() {
        eventsList = new ArrayList<Events>();
    }

    public void addEvent(Events event) {
        eventsList.add(event);
    }

    public ArrayList<Events> getAllEvents() {
        return eventsList;
    }
    
    public Events getEventByName(String nome) {
    	// implementar lógica para procurar evento pelo nome
    	
    	return eventsList.get(0);
    }
}
