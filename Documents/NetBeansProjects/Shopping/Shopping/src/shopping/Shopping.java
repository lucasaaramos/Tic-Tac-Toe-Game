/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopping;


import menu.MenuItems;
import java.util.Scanner;
import product.Items;
import product.item1;
import product.item2;
import product.item3;
import product.item4;


/**
 *
 * @author Lucas
 * Call the Shopping Bag
 * call the prices
 * call the menu
 * generate the total of the bill
 * ask the user (product and quantity)
 * get the conditions
 * output all the informations 
 * 
 */
public class Shopping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ShoppingBag myBag = new ShoppingBag(); //this is myBag. I can buy things to put in it
        MenuItems myMenu = new MenuItems(); //this is the munu of items

        Scanner myKb = new Scanner(System.in); //scanner to read the imput from the user
        int input = 0;
        int total = 0;
        
        do { //loop to run the program until the user type to Exit

            myMenu.MenuItems(); //generate the menu
            
            
            System.out.println("\nType the number of the item you want to buy or type 5 to exit! ");
            input = myKb.nextInt();

            switch (input) { //conditions to get the items and qtd the user want

                case 1:

                    System.out.println("How many do you want? ");
                    int qtd = myKb.nextInt();
                    
                    Items notebook = new item1();//setting the item  
                    total = total + (qtd * notebook.getPrice());//calc of the bill             
                    myBag.buyItem(qtd + " " + notebook.getItem());//adding to the bag
                    break;

                case 2:
                    System.out.println("How many do you want? ");
                    qtd = myKb.nextInt();
                    
                    Items phone = new item2();  
                    total = total + (qtd * phone.getPrice());                    
                    myBag.buyItem(qtd + " " + phone.getItem());
                    break;

                case 3:
                    System.out.println("How many do you want? ");
                    qtd = myKb.nextInt();
                    
                    Items mouse = new item3("Mouse");  
                    total = total + (qtd * mouse.getPrice());                    
                    myBag.buyItem(qtd + " " + mouse.getItem());
                    break;

                case 4:
                    System.out.println("How many do you want? ");
                    qtd = myKb.nextInt();
                    
                    Items keyboard = new item4("Keyboard");  
                    total = total + (qtd * keyboard.getPrice());                    
                    myBag.buyItem(qtd + " " + keyboard.getItem());
                    break;

                case 5:

                    break;

                default://defaulf in case the user type an invalid number

                    System.out.println("\nPLEASE TYPE A VALID NUMBER ITEM! ");

                    break;
            }

        } while (input != 5); //run the program until the user type to Exit


        
        System.out.println("\n*********Thanks for Buying at Lucas Shop!********\n");
        
        System.out.println("\nThe total price of the bill is: $" + total); //output the total of the bill

        System.out.println("\nYour Shopping bag contains:");

        System.out.println(myBag.emptyBag());//generate the list of items bought
     
    }

}
