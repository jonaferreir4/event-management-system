package core;

import core.Utils.Date;
import core.Utils.Time;

public class Main {
    public static void main(String[] args) {
        try {
            Date data = new Date(28, 3, 2001);
            Time time = new Time(00, 59);
            System.out.println("Data válida: " + data.toString());
            System.out.println("Hora válida: " + time.toString());

            System.out.println("hello wordl!");
        } catch (IllegalArgumentException e) {
            System.out.println("Data inválida: " + e.getMessage());
            System.out.println("Hora inválida: " + e.getMessage());

        }
    }
}
