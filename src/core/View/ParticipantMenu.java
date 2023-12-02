package core.View;

import core.Model.*;
import java.util.Scanner;

public class ParticipantMenu {
	private Users user;
	private Events event;
	public ParticipantMenu() {
		
	}
	
	public ParticipantMenu(Users user, Events event) {
		
	}
	
	public void participantMenu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Menu do participante: ");
		System.out.println("1 - listar atividades disponíveis");
		System.out.println("2 - se inscrever em uma atividade");
		System.out.println("0 - retornar");
		int op = scanner.nextInt();
		boolean state;;
		do {
			state = false;
		switch (op) {
			case 1:
				listActivities();
				break;
			case 2:
				participantRegistrationActivity();
				break;
			case 0:
				break;
			default:
				System.out.println("opção inválida! tente novamente");
				state = true;
				break;
		}
		
		
		}while(state);
	}
	
	
	public void listActivities() {
		
		if(event.getActivities() != null) {
			for (Activity activity: event.getActivities()) {
				System.out.println(activity.toString());
			}			
		}else {
			System.out.println("Nenhuma atividade cadastrada!");
		}
	}
	public void participantRegistrationActivity() {
		event.addParticipant(user);
	}

}

