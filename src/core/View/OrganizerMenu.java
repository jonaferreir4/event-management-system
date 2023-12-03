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
		System.out.println("1 - criar atividades");
		System.out.println("2 - atualizar eventos");
		System.out.println("3 - atualizar atividades");
		System.out.println("4 - deletar evento");
		System.out.println("5 - deletar atividade");
		System.out.println("0 - retornar");
		int op = scanner.nextInt();
		boolean state;;
		do {
			state = false;
		switch (op) {
			
			case 1:
				createActivity();
				break;
				
			case 2:
				
				break;
				
			case 3:
			
				break;
			case 4:
				
				break;
			case 5:
				
				break;
				
			case 0:
				break;
			default:
				System.out.println("opção inválida! tente novamente");
				state = true;
		}
		
		
		}while(state);
	}
	
	public void upDateEvent() {
		
	}
	
	public void deleteEvent() {
		
	}
	
	public void createActivity() {
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




