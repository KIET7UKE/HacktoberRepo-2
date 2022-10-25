package BinarySearch;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {-21, -4, 0, 1, 3, 4, 6, 12, 23, 44, 76, 89, 99};
        int target = 3;

        int ans = binarySearching(arr, target);
        System.out.println(ans);
    }

    static int binarySearching(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;

        while(start <= end) {
            //    int mid = (start + end) / 2;
            int mid = start + (end-start) / 2;

            if(target > arr[mid]) {
                start = mid + 1;
            }
            else if(target < arr[mid]) {
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
