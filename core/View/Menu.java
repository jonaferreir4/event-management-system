package core.View;

import core.Model.*;
import java.util.Scanner;

public class Menu {
    public Menu() {
    }

    public void MainMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Bem vindo ao Events! \nDigite um número de acordo com o que deseja fazer:\n");
            System.out.println("1 - Criar Evento \n2 - Inscrever-se em um evento \n3 - Sair");

            String input = scanner.nextLine();

            try {
                int choice = Integer.parseInt(input);

                switch (choice) {
                    case 1:
                    	 ;
                        EventMenu(); 
                        break;
                    case 2:
                        // Implemente a lógica para se inscrever em um evento aqui
                        break;
                    case 3:
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
        
        Events E = new Events(eventName, type, category, description, address, theme);
        EventManager em  = new EventManager();
        em.addEvent(E);
        
    }
    
    public void searchEvent(String name) {
    	
    }
    
}
