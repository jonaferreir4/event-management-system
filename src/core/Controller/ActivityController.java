package core.Controller;

import core.Model.*;

public class ActivityController {
    private Users participant;

    public void setParticipant(Users participant) {
        this.participant = participant;
    }

    private boolean hasParticipantPermission() {
        return participant != null && participant.getNivel().equals(Nivel.PARTICIPANT);
    }

    public void registerForActivity(Events event, Activity activity) {
        if (hasParticipantPermission()) {
            if (event.getActivities().contains(activity)) {
                activity.addParticipant(participant);
                participant.registerInActivity(activity);
            } else {
                System.out.println("Atividade não encontrada no evento.");
            }
        } else {
            System.out.println("Você não tem permissão para se inscrever em atividades.");
        }
    }



    public Activity searchActivityByName(String eventName, String activityName) {
        if (hasUserPermission() && this.user != null) {
            Events event = searchEventByName(eventName);
            if (event != null) {
                for (Activity activity : event.getActivities()) {
                    if (activity.getActivityName().equals(activityName)) {
                        return activity;
                    }
                }
            }
        }
        return null; 
    }

    public String listActivities(String eventName) {
        StringBuilder result = new StringBuilder();
    
        if (hasUserPermission() && this.user != null) {
            Events event = searchEventByName(eventName);
    
            if (event != null && event.getActivities() != null && !event.getActivities().isEmpty()) {
                for (Activity activity : event.getActivities()) {
                    result.append("\n----------------\n");
                    result.append("Nome da Atividade: ").append(activity.getActivityName()).append("\n");
                    result.append("Tema: ").append(activity.getTheme()).append("\n");
                    result.append("Tipo: ").append(activity.getType()).append("\n");
                    result.append("Descrição: ").append(activity.getDescription()).append("\n");
                    result.append("Localização: ").append(activity.getLocalization()).append("\n");
                    result.append("Palestrante/Facilitador: ").append(activity.getSpeaker()).append("\n");
                    result.append("Data e hora da atividade: ").append(activity.getDate()).append("\n");
                    result.append("Duração: ").append(activity.getDuration()).append(" minutos\n");
                }
            } else {
                result.append("Não há atividades cadastradas para o evento ").append(eventName).append(".\n");
            }
        } else {
            result.append("Você não tem permissão para visualizar as atividades.\n");
        }
    
        return result.toString();
    }



public void updateActivity(Events event, String activityName, String novoNome, String novoTipo, String novaDescricao, String novaLocalizacao, String novoPalestrante, String newDate, long durationInMinutes) {
    if (hasOrganizerPermission(event)) {
        Activity activity = event.searchActivityByName(activityName);
        if (activity != null) {
            if (novoNome != null) {
                activity.setActivityName(novoNome);
            }
            if (novoTipo != null) {
                activity.setType(novoTipo);
            }
            if (novaDescricao != null) {
                activity.setDescription(novaDescricao);
            }
            if (novaLocalizacao != null) {
                activity.setLocalization(novaLocalizacao);
            }
            if (novoPalestrante != null) {
                activity.setSpeaker(novoPalestrante);
            }
            if (newDate != null) {
                LocalDateTime date = LocalDateTime.parse(newDate, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
                activity.setDate(date);
            }
            if (durationInMinutes > 0) {
                LocalDateTime duration = activity.getDate().plusMinutes(durationInMinutes);
                activity.setDuration(duration);
            }
        }
    } else {
        System.out.println("Você não tem permissão para atualizar atividades.");
    }
}


public void deleteActivity(Events event, String activityName) {
    if (hasOrganizerPermission(event)) {
        Activity activity = event.searchActivityByName(activityName);
        if (activity != null) {
            event.removeActivity(activity);
        }
    } else {
        System.out.println("Você não tem permissão para remover atividades.");
    }
}

}
