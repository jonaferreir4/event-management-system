package core;

import core.Controller.Controller;
import core.View.Menu;

public class Principal {
    public static void main(String[] args) {
        try {
            Menu menu = new Menu();
            
            Controller controller = new Controller(menu.MainMenu());


        } catch (IllegalArgumentException e) {

        }
    }
}
