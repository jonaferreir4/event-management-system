package core.Controller;

import java.util.ArrayList;
import core.Model.Users;
import core.Model.EventManager;
import java.util.ArrayList;
import core.Model.Events;


public class EventController {
	  private ArrayList<Events> eventsList; // Lista de eventos
	  

	   public EventController() {
	        eventsList = new ArrayList<Events>();
	       
	    }
	   
	   
	/// Esse método vai criar os eventos e adicionar ao arrayList na classe EventManager
    public void createEvent(String Eventname,String type, String category, String description, String address, String theme) {
    	 Events newEvent = new Events(Eventname, type, category, description, address, theme);
    	 eventsList.add(newEvent);
    	 
         }
    
    // Esse método queando terminado servirá para pesquisar eventos pelo nome 
    public Events searchEvent(String name) {
    	 for (Events event : eventsList) {
             if (event.getEventName().equals(name)) {
                 return event;
             }
         }
         return null; // Retorna null se o evento não for encontrado
     }    
    

    //Esse método servirá para listar os eventos
    public ArrayList<Events> listEvents() {
    		return eventsList;    		
    	
    }
    
    // Esse servirá pra atualizar dados do evento
    public void updateEvent(String nome) {
        Events event = searchEvent(nome);
        if (event != null) {
           
        }
    }
    
    // Esse servirá para deletar eventos
    public void deleteEvent(String nome, String tipo) {
    	// deletar evento 
    }
    
    
}
