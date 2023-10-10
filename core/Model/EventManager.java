package core.Model;

import java.util.ArrayList;

public class EventManager {
    private ArrayList<Events> eventsList;

    public EventManager() {
        eventsList = new ArrayList<Events>();
    }

    public void addEvent(Events event) {
        eventsList.add(event);
    }

    public ArrayList<Events> getAllEvents() {
        return eventsList;
    }
}
