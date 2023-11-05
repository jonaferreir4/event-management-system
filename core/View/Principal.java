package core.View;

import core.Controller.*;
import core.Model.*;

public class Principal {
	
    public static void main(String[] args) {
        Users U1 = new Users("1111","jona Ferreira de Sousa", "jona@gmail", "12345", "22/04/2001");
        Participant P1 = new Participant(U1.getUserID(), U1.getName(), U1.getEmail(), U1.getPassword(), U1.getDateOfBirth());
        Organizer O1 = new Organizer(U1.getUserID(), U1.getName(), U1.getEmail(), U1.getPassword(), U1.getDateOfBirth());

        System.out.println(U1.getName());
        
        
        EventController e = new EventController(U1);
        EventController a = new EventController(O1);
        EventController c = new EventController(P1);
        
        e.createEvent("2222","a", "b", "c", "d", "e", "f");
        a.createEvent("2222", "a", "b", "c", "d", "e", "f");
        c.createEvent("2222","a", "b", "c", "d", "e", "f");
        
        
       
       
        
        
    }
}
