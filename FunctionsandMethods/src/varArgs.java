import java.util.Arrays;

public class varArgs {
    public static void main(String[] args) {
    //    fun(2,3,5,4,8,9,8,51,52);
        multiple(5,10,"sahil", "rahul", "anjali");
    }

    private static void multiple(int a, int b, String ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void fun(int...v) { // it can be string, int, char, etc
        System.out.println(Arrays.toString(v));
    }
}
