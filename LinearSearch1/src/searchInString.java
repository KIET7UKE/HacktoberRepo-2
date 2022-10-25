import java.util.Scanner;

public class searchInString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = "sahil";
        char target ='d';
        System.out.println(Search(str, target));
    }

    static boolean Search(String str, char target) {

        for(int i = 0; i< str.length(); i++) {
            if(target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
