/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTacToe;

import java.util.Scanner;

/**
 *
 * @author Ken Healy
 */
public class TicTacToe {

    // a value of 1 means an X
    //a value of 0 means an O
    // a value of -1 is a blank slot
    
    	// 2 D array for the board
    private int turn;
    private int[][] board;
    
    public TicTacToe() {
         
        turn = 1;	//start at turn 1
        //this is just going to print an empty board until we actually start playing!
        setUpBoard(); //set up board
        
    }

    public void setUpBoard() {

        int i;
        int j;

        board = new int[3][3];	// standard 3 x 3 board - rem: array index starts at 0

        for (i = 0; i< board.length; i++) {
            //rows
            for (j = 0; j < board[i].length; j++) {
                //columns
                board[i][j] = -1;
            }
        }
    }

    public void printHeader() {

        System.out.println("GAMEBOARD \n");
    }

    public void turnCounter() {

        System.out.println("This is turn: " + this.turn + "\n");
        //move to next turn
        this.turn++;
    }

    public void printBoard() {

        //go through the rows and columns
        int i;
        int j;
        //same count loop as board set up!

        for (i = 0; i < board.length; i++) {
            //rows
            System.out.print("|");
            for (j = 0; j < board[i].length; j++) {
                //columns

                //check what is in this "box"
                //the first time this is run, it will be -1 in all spaces
                //as game progresses, this will change
                if (board[i][j] == -1) {
                    //empty slot 
                    System.out.print("_|");
                    
                } else if (board[i][j] == 0) {
                    //should be an  O here

                    System.out.print("O|");

                } else {
                    //must be a 1 --- so X

                    System.out.print("X|");

                }

               
            }
            System.out.println("");
        }
    }

    public boolean gameOver(){
        //are there any more turns remaining?
        return !(turn<10);
        /* this hard-codes the number -- there is a better way*/
    }
    
    public boolean isWon(){
        //return true if someone has won the game
        
        for(int row=0; row<board.length; row++){
           
            //check all the rows
            if (((board[row][0] == board[row][1]) && (board[row][0]==board[row][2])) && (board[row][0] != -1)) {
			
		return true;
            }
	}
        
        for(int col=0; col<board.length; col++){
            //check all the columns
            if (((board[0][col] == board[1][col]) && (board[0][col]==board[2][col])) && (board[0][col] != -1)) {
			
		return true;
            }
	}
        
        if( (board[0][0] == board[1][1]) && (board[0][0] == board[2][2]) && (board[0][0] != -1)){
            //diagonal winner 1
            return true;
        }
        else if ((board[0][2] == board[1][1]) && (board[0][2] == board[2][0]) && (board[0][2] != -1)){
            //diagonal winner 2
            return true;
        }
        else{
            //no winner
            return false;
        }
        
    }
    
    public void getUserSquare(){
        
        int userRow, userColumn;
        
        do{
            Scanner myScanner = new Scanner(System.in);
            System.out.println("Please enter row: ");
            userRow = myScanner.nextInt() - 1;
            System.out.println("Please enter column: ");
            userColumn = myScanner.nextInt() - 1;
            
            if(board[userRow][userColumn] != -1){
                System.out.println("That square has been used. Pick again");
            }
            
        }while (board[userRow][userColumn] != -1);
        
        if ((turn % 2) == 1){
            board[userRow][userColumn] = 0;
        }
        else{
            board[userRow][userColumn] = 1;
        }
            
    }
    
    public int getTurn(){
            
        return turn;
        
    }
}
