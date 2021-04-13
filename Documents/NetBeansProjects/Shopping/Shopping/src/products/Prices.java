/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package products;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author lucas
 * set the price of the items
 * using getter and setter to get the information and send to the main class
 * if you get more products you need to include in the menu and include the prices here
 * 
 * 
 * 
 */
public class Prices { //setting the prices of the items
    
    private int notebookPrice;//private mean they can not be accessed outside the class
    private int phonePrice;
    private int mousePrice;
    private int keyboardPrice;

    
 public Prices(){
    
    this.notebookPrice = 1200;
    this.phonePrice = 800;
    this.mousePrice = 40;
    this.keyboardPrice = 80;
} 
    

    public Prices(int notebook, int phone, int mouse, int keyboard) {//create a default retangle
        this.notebookPrice = notebook;
        this.phonePrice = phone;
        this.mousePrice = mouse;
        this.keyboardPrice = keyboard;
    }
    
    

    public int getNotebookPrice() {
        return notebookPrice;
    }

    public void setNotebookPrice(int notebookPrice) {
        this.notebookPrice = notebookPrice;
    }

    public int getPhonePrice() {
        return phonePrice;
    }

    public void setPhonePrice(int phonePrice) {
        this.phonePrice = phonePrice;
    }

    public int getMousePrice() {
        return mousePrice;
    }

    public void setMousePrice(int mousePrice) {
        this.mousePrice = mousePrice;
    }

    public int getKeyboardPrice() {
        return keyboardPrice;
    }

    public void setKeyboardPrice(int keyboardPrice) {
        this.keyboardPrice = keyboardPrice;
    }
    
        
    

    

    
}
