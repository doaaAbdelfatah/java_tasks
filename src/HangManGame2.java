import java.util.Arrays;
import java.util.Scanner;

public class HangManGame2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String [] colors = {"yellow" ,"red" ,"blue" ,"green" , "black" ,"white" ,"pink" ,"purple" ,"cyan" }; // 9
        //        colors.length // 9

        do {

            int r = (int) (Math.random() * colors.length);  // 0 => 0.999999999 0 => 8 5

            String color = colors[r]; // blue
            char[] colorArr = color.toCharArray(); // [b ,l , u , e] convert string to char array
            System.out.println(" ** It's Color ! **");
//        System.out.println(color); // BLUE ---- , red --- , green ----- ,white -----

            char[] dashes = new char[color.length()]; // create array of dashes with same length of the color string
            Arrays.fill(dashes, '-');

            int trys =0;

            do {
                System.out.println(dashes);
                System.out.print("Enter your char : ");
                char c = scanner.next().charAt(0); // e
                // search char into colorArr and replace it in dashes

                boolean found =false;
                for (int i = 0; i < colorArr.length; i++) {
                    if (c == colorArr[i]) {
                        dashes[i] = c; // found the char in to color array
                        found = true;
                    }
                }

                if (! found){ // found == false
                  trys++;
                  System.out.println("your char is not in the color - wrong trys " + trys);
                  if (trys == 5){
                      System.out.println("******** G A M E ** O V E R ********");
                      break;
                  }
                }

                if (checkWin(dashes)) {
                    System.out.println(dashes);
                    System.out.println("*** Congratulation you are the winner ***");
                    break;
                }

            } while (true);

            System.out.println("if you want to continue press y to exit press any key");
            String input =scanner.next();
            if( ! input.equals("y")) break;
        }while (true);
    }
    static  boolean checkWin(char xx []){
        for (char c : xx ){
            if (c =='-') return  false;
        }
        return  true;
    }
}
