package core.View;

import core.Model.*;
import core.Controller.*;

import java.util.Scanner;

public class MainMenu {
	  private Scanner scanner;
	  private UserController userController;
	  private EventController eventController;
	  private UserMenu userMenu;

    public MainMenu() {
        scanner = new Scanner(System.in);
        
    }
    
    public MainMenu(UserController userController, EventController eventController) {
        this.userController = userController;
        this.eventController = eventController;
        this.scanner = new Scanner(System.in);
        this.userMenu = new UserMenu(userController, eventController, null);
    }


    public MainMenu mainMenu() {
    	
    	
        while (true) {
            System.out.println("Bem vindo ao Events! Escolha uma opção:");
            System.out.println("1 - Cadastro de Usuário");
            System.out.println("2 - login de Usuário");
            System.out.println("3 - Ver Eventos");
            System.out.println("4 - Sair");

            String input = scanner.nextLine();

            try {
                int choice = Integer.parseInt(input);

                switch (choice) {
                    case 1:
                    	UserRegistrationMenu menu = new UserRegistrationMenu(userController, eventController); 
                        menu.menuCadastroUsuario();
                        break;
                    case 2:
                    	 LoginMenu loginMenu = new LoginMenu(userController, userMenu);
                         loginMenu.loginMenu();
                    	
                    	break;
                    case 3:
                    	System.out.println(eventController.listEvents());
                    	break;
                    case 4:
                        System.out.println("Saindo do programa...");
                        scanner.close();
                        System.exit(0);
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número válido.");
            }
        }
    } 
}


