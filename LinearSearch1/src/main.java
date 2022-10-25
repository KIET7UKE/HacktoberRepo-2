import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = {2, 5, -6, 3, 4, 7};
        int target = 6;
        int ans = linearSearch(arr, target);
        System.out.println(ans);

    }

    static int linearSearch(int[] arr, int target) {

        if(arr.length == 0) {
            return -1;
        }

        for(int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if(element == target) {
                return i;
            }
        }
        return -1;
    }

//    static int nummbersrange(int[] arr, int target, int start, int end) {
//
//        if(arr.length == 0) {
//            return -1;
//        }
//
//        for(int i = start; i < end; i++) {
//            int element = arr[i];
//            if(element == target) {
//                return i;
//            }
//        }
//        return -1;
//    }
}