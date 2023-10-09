package core;

import core.Utils.Date;

public class Main {
    public static void main(String[] args) {
        try {
            Date data = new Date(31, 10, 23);
            System.out.println("Data válida: " + data.toString());
            System.out.println("hello wordl!");
        } catch (IllegalArgumentException e) {
            System.out.println("Data inválida: " + e.getMessage());
        }
    }
}
