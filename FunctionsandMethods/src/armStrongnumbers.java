import java.util.Scanner;

public class armStrongnumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //int arm = in.nextInt();
//        boolean ans = isArmstrong(arm);
//        System.out.println(ans);

        for(int i = 100; i<1000; i++){
            if(isArmstrong(i)){
                System.out.println(i + " ");
            }
        }
    }

    static boolean isArmstrong(int n) {
        int orignal = n;
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            int cube = rem*rem*rem;
            sum = sum + cube;
            n = n/10;
        }
        if(orignal == sum){
            return true;
        }
        return false;
    }
}
