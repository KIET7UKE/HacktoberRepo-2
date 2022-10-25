import java.util.Scanner;

public class searchInRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = "sahil";
        char target ='i';
        System.out.println(SearchinRange(str, target, 2, 4));
    }

    static boolean SearchinRange(String str, char target, int start, int end) {
        for(int i = start; i< end; i++) {
            if(target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
    }
