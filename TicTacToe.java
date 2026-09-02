import java.util.Scanner;

public class TicTacToe{

    public static void printBoard(char [][] board){
         //print the board
        System.out.println("---------");
        for (char [] row : board){
            System.out.print('|');
            for(char element : row ) {
                System.out.print(element + "|");
            }
            System.out.println("\n ---------");
        }
    }

    public static boolean makeMove(char[][] board, int row, int col, char player){
        //1. chack if row and colm are out of bound(0-2)
        if( row < 0 || row > 2 ){
            System.out.println("Invalid row" + row );
            return false;
        }
        if( col < 0 || col > 2 ){
            System.out.println("Invalid col" + col );
            return false;
        }
        //2. check if the chosen spot is already occupied 
        if (board[row][col] != ' '){
            System.out.println("Spot is already occupied by " + board[row][col]);
            return false;
        }


        //3. Asign the player piece and return true
        board[row][col] = player; 
        return true;
    }

    public static boolean isBoardFull (char[][] board){
        for(char [] row : board){
            for(char cell : row ){
                if (cell == ' '){ 
                    return false;
                }
            }
        }
        return true;
    }

    public static void  main (String [] args){
    // This is a array from the board 
        char [][] board = {
                        {' ', ' ', ' '},
                        {' ', ' ', ' '},
                        {' ', ' ', ' '}
        };

        char player = 'X';

        boolean result = false;
        while(!isBoardFull(board)){
            System.out.println(player + " is making a move.");

            do {
            Scanner scnr = new Scanner(System.in);
            System.out.println("Enter row # (1-3) :");
            int row = scnr.nextInt()-1;
            System.out.println("Enter col # (1-3) :");
            int col = scnr.nextInt()-1;
            result = makeMove(board, row, col, player);
            
            } while (!result);
             // swap player's character
                if(player == 'X') {
                    player = 'O';
                }
                else {
                    player = 'X';
                }

            printBoard(board);
        }

       
    }
}