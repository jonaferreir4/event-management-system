package core.View;


import core.Utils.Date;
import core.Controller.*;
import java.util.Scanner;
import core.Model.*;

public class UserRegistrationMenu {
    Scanner scanner;
    private UserController userController;
    private EventController eventController;
    
    public UserRegistrationMenu() {
    	scanner = new Scanner(System.in);
    }
  
    public UserRegistrationMenu(UserController userController, EventController eventController) {
    	scanner = new Scanner(System.in);
    	this.userController = userController;
    	this.eventController = eventController;
    }
	
	public void menuCadastroUsuario() {
   	 	String userID;
		String name;
		String email;
		String password;
		Date dateOfBirth;
   	 
		while (true) {
			
		System.out.println("\nCadastro de Usuário:");
   	 	System.out.println("id do usuário: ");
   	 	userID = scanner.nextLine();
   	 
        System.out.print("Nome: ");
        name = scanner.nextLine();

        System.out.print("Email: ");
        email = scanner.nextLine();

        System.out.print("Senha: ");
        password = scanner.nextLine();

        System.out.print("Data de Nascimento (DD/MM/AAAA): ");
        String dateOfBirthStr = scanner.nextLine();
        
        if (name != "" && email != "" && password != "" && dateOfBirthStr != "") {
        	Users newUser = userController.registrationUser(userID, name, email, password, dateOfBirthStr);
        	
        	int firstSpaceIndex = name.indexOf(" ");
            if (firstSpaceIndex != -1) {
                String result = name.substring(0, firstSpaceIndex);
                System.out.println("Bem Vindo " + result);
                System.out.println();
            }
            UserMenu menu = new UserMenu(userController, eventController, newUser);
            menu.userMenu();
        	break;
        }else {
        	System.out.println("Erro ao cadastrar usuário! tente novamente.");
        
        }
		}
	}
}
