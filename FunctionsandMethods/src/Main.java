package FunctionsandMethods.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            int ans = sum3(2,3);
        System.out.println(ans);
    }

    // pass the value of numbers when you are calling the method in main()
        static int sum3(int a, int b){
            int sum = a+b;
            return sum;
        }

    //return the value
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = in.nextInt();
        System.out.print("Enter the second number: ");
        int b = in.nextInt();
        int sum = a + b;
        return sum;
    //  System.out.println("This line will never be executed");
    }
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = in.nextInt();
        System.out.print("Enter the second number: ");
        int b = in.nextInt();
        int sum = a + b;
        System.out.println("The sum = " + sum);
    }
}