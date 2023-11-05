package core.Controller;

import core.Model.Activity;
import core.Model.Events;
import core.Model.Nivel;
import core.Model.Participant;

public class ActivityController {
	
private Participant participant;
	
	private boolean hasParticipantPermission() {
        return participant.getNivel().equals(Nivel.PARTICIPANT);
    }
    
	public void registerForActivity(Events event, Activity activity) {
		if (hasParticipantPermission()) {
				if (event.getActivities().contains(activity)) {
					activity.addParticipant(participant);
				}
			}
		}
}
