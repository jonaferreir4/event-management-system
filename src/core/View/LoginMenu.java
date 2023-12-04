package core.View;

import core.Controller.UserController;
import core.Model.Users;
import core.View.*;

import java.util.Scanner;

public class LoginMenu {
	private UserController userController;
	private UserMenu userMenu;
    
	public LoginMenu() {
		
	}
	
	 public LoginMenu(UserController userController, UserMenu userMenu) {
	        this.userController = userController;	   
	        this.userMenu = userMenu;
	 }
	
	public void loginMenu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite seu email: ");
		String email = scanner.nextLine();
		System.out.println("digite sua senha: ");
		String password = scanner.nextLine();
	
		login(email, password);
	}
	
	public void login(String email, String password) {	
			
		
		
		 if (email != null && password != null) {
	            Users logged = userController.authenticateUser(email, password);

	            if (logged != null) {
	                System.out.println("Bem vindo de volta, " + logged.getName());
	                System.out.println();
	                userMenu.setUser(logged);
	                userMenu.userMenu();
	            } else {
	                System.out.println("Usuário não encontrado! Verifique seu email e sua senha.");
	            }
		 }
	}
	
}
