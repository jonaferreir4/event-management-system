package core.Controller;

import core.Model.*;
public class ActivityController {
	
private Users participant;
	
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
