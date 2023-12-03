package core.View;


import core.Model.*;
import core.Controller.*;

import java.util.Scanner;


public class UserMenu {
	private EventController eventController;
	private UserController userController;
	private Users user;
	public UserMenu() {
		
	}
	
	public UserMenu(UserController userController, EventController eventController, Users user) {
		this.userController = userController;
		this.eventController = eventController;
		this.user = user;
		
	}
	
	  public  void userMenu() {
		  Scanner scanner = new Scanner(System.in);
		  
	        while (true) {
	        	
	            System.out.println("Menu do Usuário:");
	            System.out.println("1 - Criar Evento");
	            System.out.println("2 - Inscrever-se em um Evento");
	            System.out.println("3 - Busca de Eventos");
	            System.out.println("4 - Meus eventos");
	            System.out.println("5 - Voltar ao Menu Principal");
	            
	            String input = scanner.nextLine();

	            try {
	                int choice = Integer.parseInt(input);

	                switch (choice) {
	                    case 1:
	                    	 EventRegistrationMenu event = new EventRegistrationMenu(user, userController, eventController);
	                         event.setLoggedInUser(user);
	                         event.EventMenu();	                  
	                      break;
	                    case 2:
	                    	UserSignUpMenu userSignUpMenu = new UserSignUpMenu(user, eventController);
	                    	userSignUpMenu.userSignUpMenu();
	                      break;
	               
	                    case 3:
	                    	searchEvent();
	                    	break;
	                    case 4:
	                    	System.out.println(user.getMyEvents());
	                    	break;
	                    case 5:
	                        return;
	  
	                    default:
	                        System.out.println("Opção inválida. Tente novamente.");
	                        break;
	                }
	            } catch (NumberFormatException e) {
	                System.out.println("Entrada inválida. Digite um número válido.");
	            }
	        }
	        }
	            
		  public void registerMeForEvent(String eventName, Users participant) {
			  EventController event = new EventController();
			  Events myEvent = event.searchEventByName(eventName);
			  
			  if (myEvent != null) {
				  myEvent.addParticipant(participant);
			  }
		  }
		  
		  public void searchEvent() {
			  Scanner scanner = new Scanner(System.in);
			  System.out.println("Qual o nome do evento? ");
			  String name = scanner.nextLine();
			  Events event = eventController.searchEventByName(name);
			  if (event == null) {
				  System.out.println("Evento não encontrado!");
			  }else {
				  System.out.println(event.toString());  
			  }
		  }
		  
		  public void setUser(Users user) {
			    this.user = user;
			}
		  
		  
		  
		  
	  }

	

