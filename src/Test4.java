public class Test4 {
    public static void main(String[] args) {
        String [] names ={"ahmed" ,"mona" ,"sara"};

        for (int i = 0; i <names.length ; i++) {
            System.out.println(names[i]);
        }

        System.out.println("--------------");
        for (String s : names){
            System.out.println(s);
        }

        char [] dashes ={'-','e','-'};

        for (char c : dashes){
            System.out.println(c);
        }
    }
}
