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
	            System.out.println("3 - Inscrição em um Evento");
	            System.out.println("7 - Busca de Eventos");
	            System.out.println("8 - Voltar ao Menu Principal");
	            
	            String input = scanner.nextLine();

	            try {
	                int choice = Integer.parseInt(input);

	                switch (choice) {
	                    case 1:
	                    	 EventRegistrationMenu event = new EventRegistrationMenu(userController, eventController);
	                         event.setLoggedInUser(user);
	                         event.EventMenu();	                  
	                      break;
	                    // case 2:
	                      //     inscreverNoEvento();
	                    //     break;
	               
	                    // case 7:
	                    //     buscarEventos();
	                    //     break;
	                    case 8:
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
	            
		  public void registerMeForEvent(String eventName, Participant participant) {
			  EventController event = new EventController();
			  Events myEvent = event.searchEventByName(eventName);
			  
			  if (myEvent != null) {
				  myEvent.addParticipant(participant);
			  }
		  }
		  
		  
		  public void setUser(Users user) {
			    this.user = user;
			}
		  
		  
	  }

	

