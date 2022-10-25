package BinarySearch;

public class orderAlgnosticBinarySearch {
    public static void main(String[] args) {
        //ascending
    //    int[] arr = {-21, -4, 0, 1, 3, 4, 6, 12, 23, 44, 76, 89, 99};
        //descending
        int[] arr = {99, 78, 66, 45, 33, 24, 21, 18, 3, 0, -9, -12};
        int target = 66;


        int ans = orderAlgonostic(arr, target);
        System.out.println(ans);
    }

    static int orderAlgonostic(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

//        boolean isAsc;
//        if(arr[start] < arr[end]) {
//            isAsc = true;
//        }
//        else {
//            isAsc = false;
//        }

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            //    int mid = (start + end) / 2;
            int mid = start + (end - start) / 2;

            if(arr[mid] == target) {
                return mid;
            }


            if(isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                }
            }
            else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
