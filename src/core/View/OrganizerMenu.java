package core.View;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import core.Controller.EventController;
import core.Controller.UserController;
import core.Model.*;
import java.util.Scanner;

public class OrganizerMenu {
	private Users user;
	private Events event;
	private UserController userController;
	private EventController eventController;

	public OrganizerMenu() {
		
	}
	
	public OrganizerMenu(Users user, Events event,UserController userController ,EventController eventController) {
		this.user = user;
		this.event = event;
		this.userController = userController;
		this.eventController = eventController;
		
	}
	
	public void organizerMenu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Menu do Organizador: ");
		System.out.println("1 - Criar Atividades");
		System.out.println("2 - Atualizar Atividades");
		System.out.println("3 - Deletar Atividade");
		System.out.println("4 - Atualizar Eventos");
		System.out.println("5 - Deletar Evento");
		System.out.println("0 - Retornar");
		int op = scanner.nextInt();
		boolean state;;
		do {
			state = false;
		switch (op) {
			
			case 1:
				createActivityView();
				break;
				
			case 2:
				
			    break;
				
			case 3:
			
				break;
			case 4:
				updateEventView();
				break;
			case 5:
				deleteEventView();
				break;
				
			case 0:
				break;
			default:
				System.out.println("opção inválida! tente novamente");
				state = true;
		}
		
		
		}while(state);
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

	        eventController.updateEvent(
	            nomeEvento,
	            (novoNome.isEmpty() ? null : novoNome),
	            (novoTipo.isEmpty() ? null : novoTipo),
	            (novaCategoria.isEmpty() ? null : novaCategoria),
	            (novaDescricao.isEmpty() ? null : novaDescricao),
	            (novoEndereco.isEmpty() ? null : novoEndereco),
	            (novoTema.isEmpty() ? null : novoTema)
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
	        eventController.deleteEvent(nomeEvento);
	        System.out.println("Evento deletado com sucesso!");
	    } else {
	        System.out.println("Evento não encontrado.");
	    }
	}

	
	public void createActivityView() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o as informações necessárias para criar a atividade:");
		System.out.println("ID da atividade: ");
		String id = scanner.nextLine();
		System.out.println("nome da atividade: ");
		String name = scanner.nextLine();
		System.out.println("tema da atividade: ");
		String theme = scanner.nextLine();
		System.out.println("tipo da atividade: ");
		String type = scanner.nextLine();
		System.out.println("decrição e da atividade: ");
		String description = scanner.nextLine();
		System.out.println("localização da atividade: ");
		String Localization = scanner.nextLine();
		System.out.println("palestrante/facilitador da atividade: ");
		String speaker = scanner.nextLine();
		System.out.print("Data da atividade (yyyy-MM-dd HH:mm): ");
		String dateString = scanner.nextLine();
	    LocalDateTime date = LocalDateTime.parse(dateString, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
		System.out.println("duração da atividade: ");
		long durationInMinutes = scanner.nextLong();
	    LocalDateTime duration = date.plusMinutes(durationInMinutes);
		
		Activity activity = new Activity(id, name, theme, type, description, Localization, speaker, date, duration);
		event.addActivity(activity);
		user.addMyActivity(activity);
		System.out.println("Atividade criada com sucesso!");
	}
	
	public void upDateActivity() {
		
	}
	
	public void deleteActivity() {
		
	}
	
	
	
}




