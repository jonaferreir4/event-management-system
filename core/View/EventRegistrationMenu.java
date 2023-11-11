package core.View;

import core.Model.*;
import java.util.Scanner;
import core.Controller.*;

public class EventRegistrationMenu {
	private EventController eventController;
	private UserController userController;
	private Users loggedInUser;
	
	public EventRegistrationMenu() {
		
	}
	
	public EventRegistrationMenu(UserController userController ,EventController eventController) {
		this.userController = userController;
		this.eventController = eventController;
	}

	  public void EventMenu() {
	        Scanner scanner = new Scanner(System.in);
	        
	        if (loggedInUser == null) {
	            System.out.println("Usuário não logado. Não é possível criar eventos.");
	            return;
	        }
	        
	        eventController.setCurrentUser(loggedInUser);
	        
	        
	        System.out.println("Insira os seguintes dados para criar um evento: \n");
	        System.out.println("ID do evento: ");
	        String eventID = scanner.nextLine();
	        System.out.print("Nome do evento: ");
	        String eventName = scanner.nextLine();
	        System.out.print("tipo do evento: ");
	        String type = scanner.nextLine();
	        System.out.print("categoria do evento: ");
	        String category = scanner.nextLine();
	        System.out.print("descrição do evento: ");
	        String description = scanner.nextLine();
	        System.out.print("endereço do evento: ");
	        String address = scanner.nextLine();
	        System.out.print("tema do evento: ");
	        String theme = scanner.nextLine();
	        
	        eventController.createEvent(eventID, eventName, type, category, description, address, theme);
	        
	        System.out.println("Evento criado com sucesso: " + eventName);
	        
	        
	    }
	  
	  public void setLoggedInUser(Users user) {
		    this.loggedInUser = user;
		}
}
