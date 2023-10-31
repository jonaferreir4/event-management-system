package core.Controller;

import java.util.ArrayList;
import core.Model.Users;
import core.Utils.Date;
import core.Utils.Time;
import core.Model.Events;
import core.Model.Participant;


public class EventController {
	  private ArrayList<Events> eventsList; // Lista de eventos
	  

	   public EventController() {
	        eventsList = new ArrayList<Events>();
	       
	    }
	   
		   private boolean hasOrganizerPermission(Users user) {
		        return "Organizer".equals(user.getRole());
		    }
		   
		   private boolean hasParticipantPermission(Users user) {
		        return "Participante".equals(user.getRole());
		    }
		   
		   
		/// Esse método vai criar os eventos e adicionar ao arrayList na classe EventManager
	    public void createEvent(Users user, String Eventname,String type, String category, String description, String address, String theme) {
	    	if (hasOrganizerPermission(user)) {
	    		Events newEvent = new Events(Eventname, type, category, description, address, theme);
	    		eventsList.add(newEvent);	
	    		
	    	}
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
        
	    	String eventName = event.getEventName();
	        String type = event.getType();
	    	String category = event.getCategory();
	    	String description = event.getDescription();
	    	String address = event.getAddress();
	    	String theme = event.getTheme();
	    	Date dateStartEvent =  event.getDateStartEvent();
	    	Date dateEndEvent = event.getDateEndEvent();
	    	Time timeEvent = event.getTimeEvent();
	    	
    	// As infomações do evento devem ser mandadas para a interface para que o para que o organizador visualize e
	    //  Altere as informações que desejar.
        }
    }
    
    // Esse servirá para deletar eventos
    public void deleteEvent(String nome, String tipo) {
    	// deletar evento 
    }
    
    
    public void registerParticipantForEvent(Users user, String eventName, Participant participant) {
        Events event = searchEvent(eventName);
        if (hasParticipantPermission(user)) {
        	
        	if (event != null) {
        		event.addParticipant(participant);
        	}
        }
    }
    
    
}
