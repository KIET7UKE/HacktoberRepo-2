import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int count = 0;
        double ans = NoOfDigits(n,count);
        System.out.println(isArmstrong(n,ans));
    }


    static double NoOfDigits(int n, int count) {
        int dup = n;
        double ans = 0;
        while(n != 0) {
            n = n/10;
            count++;
        }

        while(dup > 0) {
         int rem = dup % 10;
         ans = ans + Math.pow(rem,count);
         dup = dup/10;
        }
        return ans;
    }

    static boolean isArmstrong(int n, double ans) {
        if(n == ans) {
            return true;
        }
        else {
            return false;
        }
    }
}
