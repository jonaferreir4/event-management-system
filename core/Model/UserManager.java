package core.Model;


import java.util.ArrayList;

public class UserManager {

	private ArrayList<Users> usersList;

    public UserManager() {
        usersList = new ArrayList<Users>();
    }

    public void addUser(Users user) {
        usersList.add(user);
    }

    public ArrayList<Users> getAllUsers() {
        return usersList;
    }
}
