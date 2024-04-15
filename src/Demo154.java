import java.util.Scanner;

public class Demo154 {
    public static void main(String[] args) {
        // datatype varName = value;  -- primitive type
        int i = 10;
        float f = 5;
        boolean b =true;
        ///////////////////////////////
        // Reference Type (new)
        // Any Class , String , Scanner ,.....
        // Arrays
        // Enum
        Scanner scanner = new Scanner(System.in) ; // Define object from class Scanner

        String name  = "Hello"; // reference type
        String message = new String("Good Mornign"); // not recomended

        Doaa my = new Doaa();
        Mai m = new Mai();

        System.out.println(name);
        System.out.println(message);

        String msg ="Hello";

        msg += " Mohamed";  // Hello Mohamed
        name = null;

        char []  c = new char [3];

        char [] game ={'A','G','R' ,'E' ,'T'};

        String  ss = new String(game); // to define String from char array

        char arr [] = ss.toCharArray(); // to get the char Array from String

        for (char ccc : arr)
            System.out.println(ccc);
        System.out.println(ss);

    }
}
class  Mai{

}

class Doaa{

}