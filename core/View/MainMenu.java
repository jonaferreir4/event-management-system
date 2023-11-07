package core.View;

import core.Model.*;
import core.Controller.*;
import core.View.UserRegistrationMenu;

import java.util.Scanner;

public class MainMenu {
    private Scanner scanner;

    public MainMenu() {
        scanner = new Scanner(System.in);
    }

    public MainMenu MainMenu() {
        while (true) {
            System.out.println("Bem vindo ao Events! Escolha uma opção:");
            System.out.println("1 - Cadastro de Usuário");
            System.out.println("2 - login de Usuário");
            System.out.println("3 - Eventos");
            System.out.println("4 - Sair");

            String input = scanner.nextLine();

            try {
                int choice = Integer.parseInt(input);

                switch (choice) {
                    case 1:
                    	UserRegistrationMenu menu = new UserRegistrationMenu(); 
                        menu.menuCadastroUsuario();
                        break;
                    case 2:
                    	// implementar
                    	break;
                    case 3:
                    	EventController events = new EventController();
                    	events.listEvents();
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


