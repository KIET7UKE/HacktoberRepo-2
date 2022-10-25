public class scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        String name = "Sahil";
        //System.out.println(num);
        {
        //  int a = 10; // Already initialized outside the block in the same method, hence you cannot initialise it again.
            a = 100; // reassign the origin reff variable to other value
            System.out.println(a);
            int c = 77;
            name = "Rahul";
            System.out.println(name);
            // values initialized in the block, will remain in block
        }
        System.out.println(a);
        System.out.println(name);
        //System.out.println(c); //cannot use outside the block

        //scoping in for loops
            for(int i = 10; i<5; i++){
                System.out.println(i);
                 a = 10;
            }
        //System.out.println(i); // cant be accessible
    }

    static void random() {
        //System.out.println(a);
        int num = 67;
        System.out.println(num);
    }
}
