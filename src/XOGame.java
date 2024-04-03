import java.util.Arrays;
public class XOGame {
    public static void main(String[] args) {
        char [][] xo = new char[3][3];
        for (int i = 0; i < 3; i++) {
            Arrays.fill(xo[i] , ' ');
        }

        xo[0][1] = 'X';
        xo[1][1] = 'O';
        xo[0][0] = 'X';
        for (char [] row : xo){
            System.out.print("| ");
            for (char c : row){
                System.out.print( c + " | ");
            }
            System.out.println();
        }

    }
}
