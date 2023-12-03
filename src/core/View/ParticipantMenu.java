package core.View;

import core.Model.*;
import core.Controller.*;

import java.util.ArrayList;
import java.util.Scanner;

public class ParticipantMenu {
	private Users user;
	private Events event;
	public ParticipantMenu() {
		
	}
	
	public ParticipantMenu(Users user, Events event) {
		this.user = user;
		this.event = event;
	}
	
	public void participantMenu() {
	    Scanner scanner = new Scanner(System.in);
	    boolean state = true;

	    do {
	        System.out.println("Menu do participante: ");
	        System.out.println("1 - listar atividades disponíveis");
	        System.out.println("2 - se inscrever em uma atividade");
	        System.out.println("0 - retornar");
	        int op = scanner.nextInt();

	        switch (op) {
	            case 1:
	                listActivities();
	                break;
	            case 2:
	                participantRegistrationActivity();
	                break;
	            case 0:
	                state = false; 
	                break;
	            default:
	                System.out.println("Opção inválida! Tente novamente");
	                break;
	        }

	    } while (state);
	}
	
	
	public void listActivities() {
		ArrayList<Activity> activities = event.getActivities();
	        
	        if (activities != null && !activities.isEmpty()) {
	            for (Activity activity : activities) {
	                System.out.println(activity.toString());
	                System.out.println();
	            }
	        } else {
	            System.out.println("Nenhuma atividade cadastrada!");
	        }
	    }
	
	public void participantRegistrationActivity() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome da atividade para a qual deseja se inscrever: ");
        String activityName = scanner.nextLine();

        ActivityController activityController = new ActivityController();
        activityController.setParticipant(user);

        Events currentEvent = event; 
        Activity activity = currentEvent.getActivity(activityName);

        if (activity != null) {
            activityController.registerForActivity(currentEvent, activity);
            System.out.println("Inscrição na atividade realizada com sucesso!");
        } else {
            System.out.println("Atividade não encontrada. Verifique o nome e tente novamente.");
        }
    }

}

