package core.View;


import core.Model.*;
import core.Controller.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class UserMenu {
	private EventController eventController;
	private UserController userController;
	private Users user;
	 private ActivityMenu activityMenu;
	public UserMenu() {
		
	}
	
	public UserMenu(UserController userController, EventController eventController, Users user) {
		this.userController = userController;
		this.eventController = eventController;
		this.user = user;
		this.activityMenu = new ActivityMenu(user, null, userController, eventController);
		
	}
	
	  public  void userMenu() {
		  Scanner scanner = new Scanner(System.in);
		  
	        while (true) {
	        	
	            System.out.println("Menu do Usuário:");
	            System.out.println("1 - Criar Evento");
	            System.out.println("2 - Atualizar Eventos");
	            System.out.println("3 - Deletar Evento");
	            System.out.println("4 - Inscrever-se em um Evento");
	            System.out.println("5 - Busca de Eventos");
	            System.out.println("6 - Meus eventos");
	            System.out.println("7 - Menu de Atividades");
	            System.out.println("8 - Voltar ao Menu Principal");
	            
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
	                    	updateEventView();
	                        break;
	                    case 3:
	                    	deleteEventView();
	                        break;
	                    case 4:
	                    	UserSignUpMenu userSignUpMenu = new UserSignUpMenu(user, eventController);
	                    	userSignUpMenu.userSignUpMenu();
	                      break;
	               
	                    case 5:
	                    	searchEvent();
	                    	break;
	                    case 6:
	                    	System.out.println(user.getMyEvents());
	                    	break;
	                    case 7:
	                    	activityMenu.activityMenu();
	                    	break;
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
		  
		  
		  
			public void updateEventView() {
			    Scanner scanner = new Scanner(System.in);

			    System.out.println("Digite o nome do evento que deseja atualizar:");
			    String nomeEvento = scanner.nextLine();

			    Events evento = eventController.searchEventByName(nomeEvento);

			    if (evento != null) {
			        System.out.println("Digite as novas informações do evento (ou pressione Enter para manter as informações existentes):");

			        System.out.print("Novo nome: ");
			        String novoNome = scanner.nextLine();

			        System.out.print("Novo tipo: ");
			        String novoTipo = scanner.nextLine();

			        System.out.print("Nova categoria: ");
			        String novaCategoria = scanner.nextLine();

			        System.out.print("Nova descrição: ");
			        String novaDescricao = scanner.nextLine();

			        System.out.print("Novo endereço: ");
			        String novoEndereco = scanner.nextLine();

			        System.out.print("Novo tema: ");
			        String novoTema = scanner.nextLine();
			        
			        System.out.print("Nova data e hora do início do evento (yyyy-MM-dd HH:mm): ");
			        String newDateStartEvent = scanner.nextLine();			
			        
			        System.out.print("Nova data e hora do término do evento (yyyy-MM-dd HH:mm): ");
			        String newDateEndEvent = scanner.nextLine();			        

			        eventController.updateEvent(
			            nomeEvento,
			            (novoNome.isEmpty() ? null : novoNome),
			            (novoTipo.isEmpty() ? null : novoTipo),
			            (novaCategoria.isEmpty() ? null : novaCategoria),
			            (novaDescricao.isEmpty() ? null : novaDescricao),
			            (novoEndereco.isEmpty() ? null : novoEndereco),
			            (novoTema.isEmpty() ? null : novoTema),
			            (newDateStartEvent.isEmpty() ? null : newDateStartEvent),
			            (newDateEndEvent.isEmpty() ? null : newDateEndEvent)
			        );

			        System.out.println("Evento atualizado com sucesso!");
			    } else {
			        System.out.println("Evento não encontrado.");
			    }
			}

			
			public void deleteEventView() {
			    Scanner scanner = new Scanner(System.in);

			    System.out.println("Digite o nome do evento que deseja deletar:");
			    String nomeEvento = scanner.nextLine();

			    Events evento = eventController.searchEventByName(nomeEvento);

			    if (evento != null) {
			    	user.removeMyEvent(evento);
			        eventController.deleteEvent(nomeEvento);
			        System.out.println("Evento deletado com sucesso!");
			    } else {
			        System.out.println("Evento não encontrado.");
			    }
			}

		  
	  }

	

