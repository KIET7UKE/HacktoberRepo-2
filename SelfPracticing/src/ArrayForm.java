import java.util.Arrays;

public class ArrayForm {
    public static void main(String[] args) {
            int[] arr = {1,2,0,0};
            int k = 34;
            int length = arr.length;
            int[] ans = new int[length];
            int sum = 0;
            for (int i = 0; i < length; i++) {
                ans[i] = arr[i];
            }
            System.out.println(Arrays.toString(ans));
        }
    }
