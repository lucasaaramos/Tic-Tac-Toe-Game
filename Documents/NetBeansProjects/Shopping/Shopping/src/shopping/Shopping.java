/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopping;

import products.MenuItems;
import products.Prices;
import products.Bill;
import java.util.ArrayList;
import java.util.Scanner;
import javafx.scene.control.Menu;

/**
 *
 * @author Lucas
 * Call the Shopping Bag
 * call the prices
 * call the menu
 * generate the total of the bill
 * ask the user (product and quantity)
 * get the conditions
 * output all the informations * 
 * 
 */
public class Shopping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ShoppingBag myBag = new ShoppingBag(); //this is myBag. I can buy things to put in it
        Bill myBill = new Bill(); //this is the bill. I can put the prices here to get the sum of the bill
        Prices myDados = new Prices(); //this is the pries of my items
        MenuItems myMenu = new MenuItems(); //this is the munu of items

        Scanner myKb = new Scanner(System.in); 
        int id = 0;
        
        do { //loop to run the program until the user type to Exit

            myMenu.MenuItems(); //generate the menu

            System.out.println("\nType the number of the item you want to buy or type 5 to exit! ");
            id = myKb.nextInt();

            switch (id) { //conditions to get the info/prices from clients input

                case 1:
                    System.out.println("How many Notebook do you want? ");
                    int qtd = myKb.nextInt();

                    myBill.totalValue(qtd * myDados.getNotebookPrice());
                    myBag.buyItem(qtd + " Notebook");
                    break;

                case 2:
                    System.out.println("How many Phone do you want? ");
                    qtd = myKb.nextInt();

                    myBill.totalValue(qtd * myDados.getPhonePrice());
                    myBag.buyItem(qtd + " Phone");
                    break;

                case 3:
                    System.out.println("How many Mouse do you want? ");
                    qtd = myKb.nextInt();

                    myBill.totalValue(qtd * myDados.getMousePrice());
                    myBag.buyItem(qtd + " Mouse");
                    break;

                case 4:
                    System.out.println("How many Keyboard do you want? ");
                    qtd = myKb.nextInt();

                    myBill.totalValue(qtd * myDados.getKeyboardPrice());
                    myBag.buyItem(qtd + " Keyboard");
                    break;

                case 5:

                    break;

                default:

                    System.out.println("\nPLEASE TYPE A VALID NUMBER ITEM! ");

                    break;
            }

        } while (id != 5); 

        System.out.println("\n*********Thanks for Buying at Lucas Shop!********");
        System.out.println("\nThe total price of the bill is: $" + myBill.sumValue()); //output the total of the bill

        System.out.println("\nYour Shopping bag contains:");

        System.out.println(myBag.itemList());//generate the list of items bought

    }

}
