/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopping;

import java.util.ArrayList;

/**
 * A simple ShoppingBag
 * 
 * Stores items in an ArrayList
 * 
 * Possible to add  items
 * Also can "empty" the bag
 * 
 * You should NOT need to amend this code at all!
 * 
 * @author Ken
 */
public class ShoppingBag {
    
    private ArrayList<String> items;
    private String item;
    
    /**
     * Create a shopping bag by initialising the items to an empty arraylist
     */
    public ShoppingBag(){
        
        items = new ArrayList<String>();

       
    }

    public ArrayList<String> getItems() {
        
        return items;
    }

    public void setItems(ArrayList<String> items) {
        this.items = items;
    }
    
    /**
     * Add an item to the shopping bag
     * @param someItem the item that has been bought
     */
    public void buyItem(String someItem){
        
        this.items.add(someItem);

  
    }

    
    
    
         public String itemList() { //outputing the list in list format
  
        for (String item : items) {
            
            System.out.println(item);
               
        }
        
        return "\nSee you Soon. Have a nice week!";
   
     }


 
    /**
     * create a formatted String containing all the items in the ShoppingBag
     * @return the formatted String
     * Also clears the items list
     */
    public String emptyBag(){
        
        String itemList = "";
        
        for(Object item: this.items){
            
            itemList = itemList + item.toString() + "\n";
        }
        
        this.items.clear();
        
        return itemList;
        
    
    }
    
    

    
}
