package core.Model;

import core.Utils.Date;

import java.util.ArrayList;

public class Organizer extends Users {
    private Nivel nivel;
    private ArrayList<Events> events;

    public Organizer() {

    }

    public Organizer(String organizerID, String name, String email, String password, String dateOfBirth) {
        super(organizerID, name, email, password, dateOfBirth);
        this.nivel = Nivel.ORGANIZER;
        this.events = new ArrayList<>();
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public void addEvent(Events event) {
        events.add(event);
    }

    public ArrayList<Events> getEvents() {
        return events;
    }
}
