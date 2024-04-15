import java.util.Arrays;
import java.util.Scanner;

public class HangManGame {

    public static void main(String[] args) {
//        System.out.println(Math.random() *10);

        Scanner scanner = new Scanner(System.in);
        System.out.println("It is Color");
        String [] colors = {"red" , "blue" ,"green" , "white" ,"black" ,"yellow" ,"pink" ,"purple" ,"cyan"}; // 6

        int random = (int) (Math.random() * colors.length) ; // 0=>1 0.01 ,0.2,0.278968  1.458,4.4898

        String color = colors[random]; // this the color
//        System.out.println(color); // red - - - , blue - - - - ,....
//        System.out.println(color.length());
        char [] dashes = new char[color.length()]; // [ '-','-' ,'-' ]
        Arrays.fill(dashes ,'-');
        int trys =0;
        do{
                System.out.println(dashes);
                System.out.print("Enter char : ");
                char c = scanner.next().charAt(0); // e ,a
                char [] colorArr =color.toCharArray(); // ['r' ,'e' ,'d']

                for (int i = 0; i <colorArr.length ; i++) {
                    if(c == colorArr[i]){
                        dashes[i] = c;
                    }
                }

        }while (true);
    }
}

/*
Math.random() => 0 , 0.999999999 * 5.9 => 5
0,1,2,3,4,5
 */

