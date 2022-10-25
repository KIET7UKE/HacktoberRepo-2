package FunctionsandMethods.src;

public class swap1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //swap numbers code
//        int temp = a;
//        a = b;
//        b = temp;

        swap(a, b);
        System.out.println(a + " " + b);

        String name = "Sahil Sharma";
        changeName(name);
        System.out.println(name);
    }

    static void changeName(String naam) {
        naam = "Anjali Sharma"; // creating a new object
    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
