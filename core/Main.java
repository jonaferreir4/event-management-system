package core;

import core.Model.Users;
import core.Utils.Date;
import core.Utils.Time;
import core.View.Menu;

public class Main {
    public static void main(String[] args) {
        try {
            Date data = new Date(28, 3, 2001);
            Time time = new Time(00, 59);

            Menu menu = new Menu();
            menu.MainMenu();

            // Date dateOfBirth = new Date(8, 10, 1990); 
            // Users user = new Users("Nome", "email@example.com", "senha123", dateOfBirth);

            System.out.println("Data válida: " + data.toString());
            System.out.println("Hora válida: " + time.toString());

            System.out.println("hello wordl!");
        } catch (IllegalArgumentException e) {
            System.out.println("Data inválida: " + e.getMessage());
            System.out.println("Hora inválida: " + e.getMessage());

        }
    }
}
