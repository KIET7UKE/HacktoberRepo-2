import java.util.Arrays;
import java.util.Scanner;

public class multidimensionarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
            1 2 3
            4 5 6
            7 8 9

         */

//        int[][] arr = new int[3][];
//
//        int[][] arr1 = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//
//        int[][] arr2D = {
//                {1, 2, 3}, // 0th index
//                {2, 4}, // 1st index
//                {8, 6, 9, 8} // 2nd index -> arr2D[0] = {8, 6, 9, 8}
//        };

        int[][] arr = new int[3][3];

        //input
        for (int rows = 0; rows < 3; rows++) {
            for (int cols = 0; cols < arr[rows].length; cols++) {
                arr[rows][cols] = 0;
            }
        }

        for (int rows = 0; rows < 3; rows++) {
//            // for each col in every row
//            for (int cols = 0; cols < arr[rows].length; cols++) {
//                System.out.print(arr[rows][cols] + " ");
//            }
//            System.out.println();
            System.out.println(Arrays.toString(arr[rows]));
        }

        //enhanced
//        for(int[] a: arr){
//            System.out.println(Arrays.toString(a));
//        }

    }
}
