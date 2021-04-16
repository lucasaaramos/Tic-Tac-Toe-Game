/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product;

/**
 *
 * @author lucas
 * set the item
 * set the price
 * include property
 * include methods to get the item/price
 * 
 * there are 2 ways here to get the value from this class
 * I used 1 way to get the item 1 and item 2
 * and another way to get the item3 and item 4
 * 
 * 
 */
public abstract class Items {

    private final String item;//setting item
    private final int price;//setting price

    public Items() {//default product

        this.item = "product";
        this.price = 1000;

    }

    public Items(String item, int price) {//create an item with given prices
        this.item = item;
        this.price = price;
    }
    
    
    /*
    
    Methods to return the values
    using getter to do it

    */

    public String getItem() {
        return item;
    }

    public int getPrice() {
        return price;
    }

}
