package core.View;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import core.Controller.EventController;
import core.Controller.UserController;
import core.Controller.ActivityController; 
import core.Model.*;

public class ActivityMenu {
    private Users user;
    private Events event;
    private UserController userController;
    private EventController eventController;
    private ActivityController activityController; 

    public ActivityMenu() {

    }

    public ActivityMenu(Users user, Events event, UserController userController, EventController eventController,
            ActivityController activityController) { 
        this.user = user;
        this.event = event;
        this.userController = userController;
        this.eventController = eventController;
        this.activityController = activityController;
    }

    public void activityMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu de Atividades: ");
        System.out.println("1 - Criar Atividades");
        System.out.println("2 - Atualizar Atividades");
        System.out.println("3 - Deletar Atividade");
        System.out.println("4 - Listar Atividades do Evento.");
        System.out.println("5 - Buscar Atividade do Evento");
        System.out.println("0 - Retornar");
        int op = scanner.nextInt();
        boolean state;
        do {
            state = false;
            switch (op) {

                case 1:
                    createActivityView();
                    break;

                case 2:
                    updateActivityView();
                    break;

                case 3:
                    deleteActivityView();
                    break;

				case 4:
					activityController.listActivities();
                    break;

				case 5:
					activityController.searchActivityByName();
                    break;

                case 0:
                    break;

                default:
                    System.out.println("opção inválida! tente novamente");
                    state = true;
            }

        } while (state);
    }

    public void createActivityView() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o as informações necessárias para criar a atividade:");
		System.out.println("nome da atividade: ");
		String name = scanner.nextLine();
		System.out.println("tema da atividade: ");
		String theme = scanner.nextLine();
		System.out.println("tipo da atividade: ");
		String type = scanner.nextLine();
		System.out.println("decrição e da atividade: ");
		String description = scanner.nextLine();
		System.out.println("localização da atividade: ");
		String Localization = scanner.nextLine();
		System.out.println("palestrante/facilitador da atividade: ");
		String speaker = scanner.nextLine();
		System.out.print("Data e hora da atividade (yyyy-MM-dd HH:mm): ");
		String dateString = scanner.nextLine();
	    LocalDateTime date = LocalDateTime.parse(dateString, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
		System.out.println("Duração em minutos da atividade: ");
		long durationInMinutes = scanner.nextLong();
	    LocalDateTime duration = date.plusMinutes(durationInMinutes);
		
		Activity activity = new Activity( name, theme, type, description, Localization, speaker, date, duration);
		event.addActivity(activity);
		user.addMyActivity(activity);
		System.out.println("Atividade criada com sucesso!");
	}

    public void updateActivityView() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da atividade que deseja atualizar:");
        String nomeAtividade = scanner.nextLine();

        System.out.println("Digite o nome do evento que contém a atividade:");
        String nomeEvento = scanner.nextLine();
        Events evento = eventController.searchEventByName(nomeEvento);

        if (evento != null) {
            System.out.println("Digite as novas informações da atividade (ou pressione Enter para manter as informações existentes):");

            System.out.print("Novo nome: ");
            String novoNome = scanner.nextLine();

            System.out.print("Novo tipo: ");
            String novoTipo = scanner.nextLine();

            System.out.print("Nova descrição: ");
            String novaDescricao = scanner.nextLine();

            System.out.print("Nova localização: ");
            String novaLocalizacao = scanner.nextLine();

            System.out.print("Novo palestrante: ");
            String novoPalestrante = scanner.nextLine();

            System.out.print("Nova data e hora (yyyy-MM-dd HH:mm): ");
            String newDate = scanner.nextLine();

            System.out.print("Nova duração em minutos: ");
            long durationInMinutes = scanner.nextLong();

            activityController.updateActivity(
                evento,
                nomeAtividade,
                (novoNome.isEmpty() ? null : novoNome),
                (novoTipo.isEmpty() ? null : novoTipo),
                (novaDescricao.isEmpty() ? null : novaDescricao),
                (novaLocalizacao.isEmpty() ? null : novaLocalizacao),
                (novoPalestrante.isEmpty() ? null : novoPalestrante),
                (newDate.isEmpty() ? null : newDate),
                durationInMinutes
            );

            System.out.println("Atividade atualizada com sucesso!");
        } else {
            System.out.println("Evento não encontrado.");
        }
    }

    public void deleteActivityView() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da atividade que deseja deletar:");
        String nomeAtividade = scanner.nextLine();

        System.out.println("Digite o nome do evento que contém a atividade:");
        String nomeEvento = scanner.nextLine();
        Events evento = eventController.searchEventByName(nomeEvento);

        if (evento != null) {
            activityController.deleteActivity(evento, nomeAtividade);
            user.removeMyActivity(evento, nomeAtividade);
            System.out.println("Atividade deletada com sucesso!");
        } else {
            System.out.println("Evento não encontrado.");
        }
    }
}
