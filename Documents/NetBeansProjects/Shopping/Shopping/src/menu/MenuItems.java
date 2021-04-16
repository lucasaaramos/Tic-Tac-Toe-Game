/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import product.Items;
import product.item1;
import product.item2;
import product.item3;
import product.item4;



/**
 *
 * @author lucas
 */
public class MenuItems {
    
    
        public void MenuItems() { //menu of items to sent to the main class

        /*
          Trying 2 different ways to get the item
          item1 and item2 getting the item and price from the class item1 and item2  
          item3 and item4 setting the item in this class and getting only the price from the other class
            
        */    
            
            
        Items notebook = new item1();
        Items phone = new item2();
        Items mouse = new item3("Mouse");
        Items keyboard= new item4("Keyboard");
        
        
        System.out.println("\n>>>>>>>>>> Menu <<<<<<<<<<");
        System.out.println("1 " + notebook.getItem() + ".............. Price: $" + notebook.getPrice());
        System.out.println("2 " + phone.getItem() + "................. Price: $" + phone.getPrice());
        System.out.println("2 " + mouse.getItem() + "................. Price: $" + mouse.getPrice());
        System.out.println("2 " + keyboard.getItem() + ".............. Price: $" + keyboard.getPrice());
        System.out.println("\n5 EXIT");
        
        }
        
        
        

    
}
