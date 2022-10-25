import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the celcius: ");
        int celc = in.nextInt();
        int ans = temperature(celc);
        System.out.println("The conversion of celcius in fahrenheit is " + ans);

    }
    static int temperature(int cel) {
        int farh = (cel * 9/5) + 32;
        return farh;
    }
}
