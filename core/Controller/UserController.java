package core.Controller;

import java.util.ArrayList;

import core.Model.*;
import core.Utils.Date;

public class UserController {
	private UserManager userManager;

	public UserController(UserManager userManager) {
		this.userManager = userManager;
		
	}
	
    public void registrationUser(String name, String email, String password, Date dateOfBirth) {
    	Users newUser = new Users(name, email, password,dateOfBirth );
        userManager.addUser(newUser);   
        }   
    
    
    public void searchUser(String name) {
    	UserManager foundUser = userManager;

   	    if (foundUser != null) {
   	    	// mandar evento para a view
   	    } else {
   	       // mandar mensagem de nao encontrado para a view
   	   
   	    }
   }

   public void listUsers() {
   	 ArrayList<Users> users = userManager.getAllUsers();

   	    if (!users.isEmpty()) {
   	        // Exiba a lista de usuarios
   	    } else {
   	       //Nenhum usuario disponível no momento.
   	    }
   }
   
   public void upDateUser(String nome, String password) {
   	// atualizar evento
   }
   
   public void deleteEvent(String nome,String email ,String password) {
   	// deletar evento 
   }
   
}
