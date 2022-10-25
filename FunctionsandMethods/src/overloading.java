import java.util.Arrays;

public class overloading {
    public static void main(String[] args) {
    //    fun(99);
    //    fun("Sharma");
//        int ans = sum(3,4,8);
//        System.out.println(ans);

        demo("Sahil", "Kunal", "Rahul");
    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static void fun(int a){
        System.out.println("first one");
        System.out.println(a);
    }

    static void fun(String sahil){
        System.out.println("second one");
        System.out.println(sahil);
    }
}
