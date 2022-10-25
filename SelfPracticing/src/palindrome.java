import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            String str = in.next();

            int i = 0;
            int j = str.length() - 1;

            while(i <= j) {
                if(str.charAt(i) == str.charAt(j)) {
                    i++;
                    j--;
                }
                else {
                    break;
                }
            }
            if(j < i)
                System.out.println("Palindrome");
            else
                System.out.println("Not palindrome");
    }
}