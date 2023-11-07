package core.View;

import java.util.Scanner;

public class EventRegistrationMenu {
	
	public EventRegistrationMenu() {
		
	}

	  public void EventMenu() {
	        Scanner scanner = new Scanner(System.in);
	        
	        
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
	        
	        System.out.println("Evento criado com sucesso: " + eventName);
	        
	        
	    }
}
