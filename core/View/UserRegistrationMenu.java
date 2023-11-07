package core.View;

import core.Utils.Date;
import core.View.*;
import java.util.Scanner;

public class UserRegistrationMenu {
    Scanner scanner;
	public UserRegistrationMenu() {
		scanner = new Scanner(System.in);
	}
	
	public void menuCadastroUsuario() {
   	 String name;
   	 String email;
   	 String password;
   	 Date dateOfBirth;
   	 
   	 System.out.println("Cadastro de Usuário:");
        System.out.print("Nome: ");
        name = scanner.nextLine();

        System.out.print("Email: ");
        email = scanner.nextLine();

        System.out.print("Senha: ");
        password = scanner.nextLine();

        System.out.print("Data de Nascimento (DD/MM/AAAA): ");
        String dateOfBirthStr = scanner.nextLine();
        
        if (name != null || email != null || password != null || dateOfBirthStr != null) {
        	int firstSpaceIndex = name.indexOf(" ");
            if (firstSpaceIndex != -1) {
                String result = name.substring(0, firstSpaceIndex);
                System.out.println("Bem Vindo " + result);
                System.out.println();
            }
        	UserMenu menu = new UserMenu();
        	menu.userMenu();
        }
	}
}
