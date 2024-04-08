import java.util.Arrays;
import java.util.Scanner;

public class Connect4 {
    /*
        1- Define scanner
        2- Define array
        3- fill Array by spaces
        4- Define the player char (yellow , Red)
        5- print Game Area
        6- Read input from user to choose the column he needs to play in
        7- check the winner then end game if there is winner
        8- check game over then end game if it is completed.
        9- change the player
        10- repeat the game
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char [][] game = new char[6][7];

        for (int i = 0; i <6 ; i++) {
            Arrays.fill(game[i] ,' ');
        }

        char player = 'R' ; // 'Y'

        do {
            try {
                printGame(game);
                System.out.print("Player " + player + " enter column number : ");
//                int col = scanner.nextInt() -1 ; // line exp. if you want to start from 1 not 0
                int col = scanner.nextInt() ; // line exp. // start from 0 to 6

                for (int row = 5; row >= 0; row--) {
                    if ( game[row][col] == ' '){
                        game[row][col] = player;
                        break;
                    }
                }
                // check winner
                if (checkWinner(game , player)){
                    printGame(game);
                    System.out.println("Player " + player + " The Winner :) ");
                    break;
                }

                // check game over
                if (gameOver(game)){
                    printGame(game);
                    System.out.println("***** G A M E ** O V E R ****");
                    break;
                }
                // change player
                if(player == 'R') player ='Y' ; else player ='R';

            }catch (Exception e){
                System.out.println("please Enter correct column number and try again");
            }
        }while (true);

    }

    static  void printGame(char [][] game){
//        System.out.println("    1   2   3   4   5   6  7 "); // if you want to start from 1 not 0
        System.out.println("    0  1   2   3   4   5   6  ");
        for (char row [] : game){
            System.out.print(" | ");
            for (char v : row){
                System.out.print( v + " | ");
            }
            System.out.println();
        }
    }


    static  boolean gameOver(char [][] g){
        for (char [] r : g){
            for (char v : r){
                if (v == ' ') return  false;
            }
        }
        return  true;
    }

    static  boolean checkWinner(char [][] game  , char player){
        for (char [] row : game){
            //  inside the row
            int counter =0;
            for (char c : row){
                if (c == player ){
                    if (++counter == 4) return  true;
                }else{
                    counter =0;
                }
            }
        }
        return  false;
    }
}
