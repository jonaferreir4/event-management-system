package core.View;

import java.util.Scanner;
import core.Model.*;
import core.Controller.*;

public class UserSignUpMenu {
	private Users user;
	private EventController eventController;
	public UserSignUpMenu() {
		
	}
	
	public UserSignUpMenu(Users user, EventController eventController) {
		this.user = user;
		this.eventController = eventController;
	}
	
	public void userSignUpMenu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Qual o nome do evento em que você deseja se increver?");
		String eventName = scanner.nextLine();
		Events event = eventController.searchEventByName(eventName);
		
    	if (event != null) {
    		eventController.registerParticipantForEvent(user, event);
    	}
		
		
	}
}
