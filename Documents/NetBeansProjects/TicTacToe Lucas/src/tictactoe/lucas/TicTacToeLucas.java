/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe.lucas;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class TicTacToeLucas {

    /**
     * @param args the command line arguments
     */
    
    private int turn;
    private int [][] board; 
    
    public TicTacToeLucas(){
        
        turn = 1;
        SetUpBoard();
        
    }
    
    public void SetUpBoard(){
        
        int i;
        int j;
        
        board = new int [3][3];

        for (i=0; i < board.length; i++){ //rows
            
            for (j=0; j < board[i].length; j++){ //colouns
                
                board [i][j] = -1;
               
            }
        
        } 
        
    }


    public void printHeader(){
        
        System.out.println("GAMEBOARD LUCAS: \n");
        
    }
    
    
    public void turnCounter(){
        
        System.out.println("This is the turn: " + this.turn + "\n");
        
        turn++;       
 
    }
    
    
    public void printBoard(){
        
        int i;
        int j;
        
        for (i=0; i < board.length; i++){
            
            System.out.print("|");
                  
            for (j=0; j < board[i].length; j++){
                
                if(board[i][j] == -1){
                    
                    System.out.print("_|");
                
                }else if (board[i][j] == 0){
                    
                    System.out.print("O|");
                
                }else{
                    
                    System.out.print("X|");
                }
                
            }
            System.out.println("");
        }
        
        
    }
    
    
    public boolean gameOver(){
        
        return !(turn < 10);
     
    }
    
    public boolean isWon(){
  
        
        for (int i=0; i < board.length; i++){
        
            if(((board[i][0] == board[i][1]) && (board[i][0] == board[i][2])) && (board[i][0] != -1)){
            
                return true;
            }
            
        }for (int j=0; j < board.length; j++){
            
            
            if(((board[0][j] == board[1][j]) && (board[0][j] == board[2][j])) && (board[0][j] != -1)){
                
                return true;
            }
            
        }if (  (board[0][0] == board [1][1]) && (board[0][0] == board [2][2]) && (board[0][0] !=-1)){ 
            
            return true;
        
        }else if ( (board[0][2] == board [1][1]) && (board[0][2] == board [2][0]) && (board[0][2] !=-1)){ 
            
            
            return true;
        
        }else{
            
            return false;
        }

    }
    
    
    public void getUserSquare(){
        
        int userRow, userColumn;
        
        do{
            Scanner myScanner = new Scanner (System.in);
            System.out.println("Please enter the row: ");
            userRow = myScanner.nextInt() -1;
            
            System.out.println("Please enter the column: ");
            userColumn = myScanner.nextInt() -1;
            
            if(board[userRow][userColumn] != -1){
                
                System.out.println("This slot has been used, please choose another one: ");
     
            }
       
        }while (board[userRow][userColumn] != -1);
        
            if ((turn % 2) == 1){
            board[userRow][userColumn] = 0;
            
            }else{
            board[userRow][userColumn] = 1;
            }
        
    }
    
    
    public int getTurn(){
        
        return turn;
        
    }
               
}


