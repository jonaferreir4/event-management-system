package core;

import core.Controller.Controller;
import core.Controller.EventController;
import core.Controller.UserController;
import core.View.MainMenu;

public class Main {
    public static void main(String[] args) {
    	UserController userController;
    	EventController eventController;
    	
    	userController = new UserController();
    	eventController = new EventController();
    	
        try {
            MainMenu menu = new MainMenu(userController, eventController);
            
            Controller controller = new Controller(menu.mainMenu());


        } catch (IllegalArgumentException e) {

        }
    }
}
