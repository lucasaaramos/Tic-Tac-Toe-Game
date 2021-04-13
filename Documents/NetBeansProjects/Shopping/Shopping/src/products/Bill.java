/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package products;

import java.util.ArrayList;

/**
 * Determine the products Put them in a ArrayList set the prices return the
 * results
 *
 * @author lucas
 */
public class Bill {

    private ArrayList<Integer> totalPrice;
    
    
    

    public Bill() {

        totalPrice = new ArrayList<Integer>();


    }



    public void totalValue(int someValue) {

        this.totalPrice.add(someValue);


    }
    
    
     public int sumValue() {
         
         
        int sum = 0;

        for (int i = 0; i < totalPrice.size(); i++) {

            sum += totalPrice.get(i);
        }

        return sum;
         
     }
    
    
    
    

}
