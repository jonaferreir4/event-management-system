package core.View;

import core.Model.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import core.Controller.*;

public class EventRegistrationMenu {
	
	private EventController eventController;
	private UserController userController;
	private Users loggedInUser;
	
	public EventRegistrationMenu() {
		
	}
	
	public EventRegistrationMenu(Users user,UserController userController ,EventController eventController) {
		loggedInUser = user;
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
	        System.out.print("Data e hora do início do evento (yyyy-MM-dd HH:mm): ");
	        String dateStartEvent = scanner.nextLine();
	        LocalDateTime dateStart = LocalDateTime.parse(dateStartEvent, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
	        System.out.print("Data e hora do término do evento (yyyy-MM-dd HH:mm): ");
	        String dateEndEvent = scanner.nextLine();
	        LocalDateTime dateEnd = LocalDateTime.parse(dateEndEvent, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
	        
	        Events event = eventController.createEvent( eventName,loggedInUser, type, category, description, address, theme, dateStart, dateEnd );
	        
	        System.out.println("Evento criado com sucesso: " + eventName);
	        ActivityMenu menu = new ActivityMenu(loggedInUser, event, userController, eventController);
	        menu.activityMenu();
	        
	        
	    }
	  
	  public void setLoggedInUser(Users user) {
		    this.loggedInUser = user;
		}
}
