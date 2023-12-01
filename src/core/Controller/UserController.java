package core.Controller;

import java.util.ArrayList;

import core.Model.*;
import core.Utils.Date;

public class UserController {
	 private ArrayList<Users> userList; // L

	public UserController() {
		 userList = new ArrayList<Users>(); // Inicialize a lista de usuários, se necessário
		
	}
	
	public Users authenticateUser(String username, String password) {
        for (Users user : userList) {
            if (user.getName().equals(username) && user.getPassword().equals(password)) {
                return user; // Retorna o usuário autenticado.
            }
        }
        return null; // Retorna null se as credenciais estiverem incorretas ou o usuário não for encontrado.
    }
	
	/// Esse método vai criar os usuários e adicionar ao arrayList na classe userManager
    public Users registrationUser(String userID, String name, String email, String password, String dateOfBirth) {
  
    	Users newUser = new Users(userID, name, email, password,dateOfBirth);
        userList.add(newUser);  
        return newUser;
        }   
    
   // Esse método queando terminado servirá para pesquisar usuários pelo nome 
    public Users searchUser(String name) {
    	for (Users user : userList) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null; // Retorna null se o usuário não for encontrado
    }    
   
   
 //Esse método servirá para listar os usuários
   public ArrayList<Users>  listUsers() {
   	 return userList;
   }
  // Esse servirá pra atualizar dados usuário
   public void upDateUser(String nome, String password) {
   	// atualizar usuário
   }
   
   // Esse servirá para deletar usuários
   public void deleteEvent(String nome,String email ,String password) {
   	// deletar usuário 
   }
   
}
