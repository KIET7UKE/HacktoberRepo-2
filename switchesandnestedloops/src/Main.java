import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String fruit = in.next();
//
//        switch (fruit) {
//            case "apple" -> System.out.println("A red fruit");
//            case "banana" -> System.out.println("Monkeys love");
//            case "mango" -> System.out.println("King of fruits");
//            case "grapes" -> System.out.println("A green bubbles fruit");
//            default -> System.out.println("Please enter a valid fruit");
//        }

        int day = in.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Please enter a valid day");
                break;
        }
    }
}