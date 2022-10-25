import java.util.Scanner;

public class stringExample {

    public static void main(String[] args) {
//        String greet1 = "Sahil Sharma";
//        System.out.println(greet1);
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String naam = in.next();
        String sahil = myGreet(naam);
        System.out.println(sahil);
    }

    private static String myGreet(String name) {
        String sharma = "Hey " + name;
        return sharma;
    }

    static String greet( String greeting){
        String greet1 = "";
        return greet1;
    }
}
