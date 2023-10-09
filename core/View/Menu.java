package core.View;

import java.util.Scanner;

public class Menu {
    public Menu () {
    }

    public void MainMenu (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao Events! \nDigite um número de acordo com o que deseja fazer:\n");
        
        System.out.println("1 - Criar Evento \n2 - Se increver em um evento \n3 - Sair");
        String input = scanner.nextLine();
        
        // switch (input) {
        //     case value :
                
        //         break;
        
        //     default:
        //         break;
        // }
        System.out.println(input);
        scanner.close();
    }
}