import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //syntax
        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(55);
//        list.add(56);
//        list.add(23);
//        list.add(14);
//        list.add(52);
//        list.add(65);

        //System.out.println(list.contains(69));
//        System.out.println(list);
//
//        list.set(1, 69);
//
//        list.remove(2);
//
//        System.out.println(list);

        //input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        //get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); //pass index here, list[index] syntax will not work here
        }

        System.out.println(list);
    }
}
