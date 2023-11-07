package core.View;

import core.Controller.UserController;
import core.Model.Users;
import core.View.*;

import java.util.Scanner;

public class LoginMenu {
	
	public LoginMenu() {
		
	}
	
	public void loginMenu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String name = scanner.nextLine();
		System.out.println("digite sua senha: ");
		String password = scanner.nextLine();
	
		login(name, password);
	}
	
	
	public void login(String name, String password) {	
		
		UserController user  = new UserController();
		UserMenu menu = new UserMenu();
		
		if (name != null && password != null) {
			Users logged = user.authenticateUser(name, password);
			
			if (logged != null) {
				System.out.println("Bem vindo de volta, " + logged.getName());
				System.out.println();
				menu.userMenu();
				
			}else {
				System.out.println("Usuário não encontrado! verique nome e senha.");
			}
		}
	}
	
}
