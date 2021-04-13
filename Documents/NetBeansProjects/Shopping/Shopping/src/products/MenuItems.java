/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package products;

import products.Prices;

/**
 *
 * @author lucas
 */
public class MenuItems {
    
    
        public void MenuItems() { //menu of items to sent to the main class

        Prices myDados = new Prices();

        System.out.println("\n>>>>>>>>>> Menu <<<<<<<<<<");

        System.out.println("1 Notebbok.............. Price: $" + myDados.getNotebookPrice());
        System.out.println("2 Phone................. Price: $" + myDados.getPhonePrice());
        System.out.println("3 Mouse................. Price: $" + myDados.getMousePrice());
        System.out.println("4 Keyboard.............. Price: $" + myDados.getKeyboardPrice());
        System.out.println("\n5 EXIT");


    }
    
}
