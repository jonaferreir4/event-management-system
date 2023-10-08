package com.eventManagementSystem.core;

public class Main {
    public static void main(String[] args) {
        try {
            Date data = new Date(8, 10, 2023);
            System.out.println("Data válida: " + data.toString());
        } catch (IllegalArgumentException e) {
            System.out.println("Data inválida: " + e.getMessage());
        }
    }
}
