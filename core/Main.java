package core;

import core.Controller.Controller;
import core.View.MainMenu;

public class Main {
    public static void main(String[] args) {
        try {
            MainMenu menu = new MainMenu();
            
            Controller controller = new Controller(menu.MainMenu());


        } catch (IllegalArgumentException e) {

        }
    }
}
