import java.util.Scanner;

public class Nested {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int empID = in.nextInt();
        String department = in.next();

        switch (empID) {
            case 1 -> System.out.println("Sahil Sharma");
            case 2 -> System.out.println("Anjali Sharma");
            case 3 -> {
                System.out.println("Soumendu Behera");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("Please enter a correct department");
                }
            }
            default -> System.out.println("Please enter a correct EmpID");
        }
    }
}
