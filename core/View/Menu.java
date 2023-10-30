package core.View;

import core.Model.*;
import java.util.Scanner;

public class Menu {
    private Scanner scanner;

    public Menu() {
        scanner = new Scanner(System.in);
    }

    public Menu MainMenu() {
        while (true) {
            System.out.println("Bem vindo ao Events! Escolha uma opção:");
            System.out.println("1 - Cadastro de Usuário");
            System.out.println("2 - Eventos");
            System.out.println("3 - Palestrantes");
            System.out.println("4 - Certificados");
            System.out.println("5 - Avaliações e Feedbacks");
            System.out.println("6 - QR Code");	
            System.out.println("7 - Sair");

            String input = scanner.nextLine();

            try {
                int choice = Integer.parseInt(input);

                switch (choice) {
                    case 1:
                        menuCadastroUsuario();
                        break;
                    case 2:
                        // Implemente a lógica para se inscrever em um evento aqui
                        break;
                    // case 2:
                    //     menuEventos();
                    //     break;
                    // case 3:
                    //     menuPalestrantes();
                    //     break;
                    // case 4:
                    //     menuCertificados();
                    //     break;
                    // case 5:
                    //     menuAvaliacoesFeedbacks();
                    //     break;
                    // case 6:
                    //     menuQRCode();
                    //     break;
                    case 7:
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

    private void menuCadastroUsuario() {
    	
    }

    private void menuEventos() {
        while (true) {
            System.out.println("Menu de Eventos:");
            System.out.println("1 - Criar Evento");
            System.out.println("2 - Criação de Atividades");
            System.out.println("3 - Inscrição no Evento");
            System.out.println("4 - Confirmação de Inscrição no Evento");
            System.out.println("5 - Inscrição em Atividades");
            System.out.println("6 - Confirmação de Inscrição em Atividades");
            System.out.println("7 - Busca de Eventos");
            System.out.println("8 - Voltar ao Menu Principal");

            String input = scanner.nextLine();

            try {
                int choice = Integer.parseInt(input);

                switch (choice) {
                    // case 1:
                    //     criarEvento();
                    //     break;
                    // case 2:
                    //     criarAtividade();
                    //     break;
                    // case 3:
                    //     inscreverNoEvento();
                    //     break;
                    // case 4:
                    //     confirmarInscricaoEvento();
                    //     break;
                    // case 5:
                    //     inscreverEmAtividade();
                    //     break;
                    // case 6:
                    //     confirmarInscricaoAtividade();
                    //     break;
                    // case 7:
                    //     buscarEventos();
                    //     break;
                    case 8:
                        return;
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
        
    }
    
    public void searchEvent(String name) {
    	
    }
    
}


