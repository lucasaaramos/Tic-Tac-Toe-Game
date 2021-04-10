/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTacToe;

/**
 *
 * @author Ken Healy
 */
public class GameClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        TicTacToe myGame = new TicTacToe();
        do{
            myGame.printHeader();
            myGame.turnCounter();
            myGame.printBoard();
            myGame.getUserSquare();
                        
        }while((!myGame.gameOver()) && (!myGame.isWon()));

        myGame.printBoard(); //print the board at the end of the game
        
        if (myGame.isWon()){
            
            if(myGame.getTurn()%2==0) {
                
                System.out.println("X is the winner");
            }
            else{
                System.out.println("O is the winner");
            }
        }
    }
    
}
