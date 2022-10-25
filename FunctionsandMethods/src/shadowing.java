public class shadowing {
    static int x = 90; // this will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x); // 90
        int x; // the class variable at line 4 is shadowed by this
    //    System.out.println(x); // scope will begin when the value is initialized
        x = 50;
        System.out.println(x); // 50
        fun();
    }

    private static void fun() {
        System.out.println(x);
    }
}
