package core.View;

import core.Model.*;
import java.util.Scanner;

public class OrganizerMenu {
	private Users user;
	private Events event;
	public OrganizerMenu() {
		
	}
	
	public OrganizerMenu(Users user, Events event) {
		
	}
	
	public void OrganizerMenu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Menu do participante: ");
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
	
	}
	
	public void upDateActivity() {
		
	}
	
	public void deleteActivity() {
		
	}
	
	
	
}




