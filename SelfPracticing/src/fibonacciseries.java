import java.util.Scanner;

public class fibonacciseries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int curr = 0;
        int prev = 0;
         int n = in.nextInt();
        int nextValue = 0;
         int count = 2;
         while(count != n ) {
             nextValue = curr + prev;
         }
        System.out.println(nextValue);
    }
}
