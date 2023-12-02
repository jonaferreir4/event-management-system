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
}
