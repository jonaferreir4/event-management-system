package core.View;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import core.Controller.EventController;
import core.Controller.UserController;
import core.Model.*;
import java.util.Scanner;

public class ActivityMenu {
	private Users user;
	private Events event;
	private UserController userController;
	private EventController eventController;

	public ActivityMenu() {
		
	}
	
	public ActivityMenu(Users user, Events event,UserController userController ,EventController eventController) {
		this.user = user;
		this.event = event;
		this.userController = userController;
		this.eventController = eventController;
		
	}
	
	public void activityMenu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Menu de Atividades: ");
		System.out.println("1 - Criar Atividades");
		System.out.println("2 - Atualizar Atividades");
		System.out.println("3 - Deletar Atividade");
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
			case 0:
				break;
			default:
				System.out.println("opção inválida! tente novamente");
				state = true;
		}
		
		
		}while(state);
	}

	
	public void createActivityView() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o as informações necessárias para criar a atividade:");
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
		System.out.print("Data e hora da atividade (yyyy-MM-dd HH:mm): ");
		String dateString = scanner.nextLine();
	    LocalDateTime date = LocalDateTime.parse(dateString, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
		System.out.println("Duração em minutos da atividade: ");
		long durationInMinutes = scanner.nextLong();
	    LocalDateTime duration = date.plusMinutes(durationInMinutes);
		
		Activity activity = new Activity( name, theme, type, description, Localization, speaker, date, duration);
		event.addActivity(activity);
		user.addMyActivity(activity);
		System.out.println("Atividade criada com sucesso!");
	}
	
	public void updateActivity() {
		
	}
	
	public void deleteActivity() {
		
	}
	
	
	
}




