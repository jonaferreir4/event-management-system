package core.View;

import java.util.Scanner;
import core.Model.*;
import core.Controller.*;
import core.View.*;

public class UserSignUpMenu {
	private Users user;
	private EventController eventController;
	public UserSignUpMenu() {
		
	}
	
	public UserSignUpMenu(Users user, EventController eventController) {
		this.user = user;
		this.eventController = eventController;
	}
	
	public void userSignUpMenu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Qual o nome do evento em que você deseja se increver?");
		String eventName = scanner.nextLine();
		Events event = eventController.searchEventByName(eventName);
		
    	if (event != null) {
    		System.out.println("Nome: " + event.getEventName() +" - Endereço: " + event.getAddress() + " - Data e Horário: " 
    	+ event.getDateStartEvent() + " a " + event.getDateEndEvent());
    	boolean state = true;
    	
    		ParticipantMenu menu = new ParticipantMenu(user, event);
    		 do{
    			 
    			System.out.println("Esse é o evento certo?");
    			System.out.println("1 - Sim");
    			System.out.println("2 - Não");
    			int op = scanner.nextInt();
    			
    			 if (op == 1) {
    	                state = false;
    	                eventController.registerParticipantForEvent(user, event);
    	                menu.participantMenu();
    	            } else if (op == 2) {
    	                state = false;
    	              
    	            }
    		}while(state);
    		
    		
    	} else {
    		System.out.println("O evento não existe! Verifique se o nome está correto.");
    	}
		
		
	}
}
