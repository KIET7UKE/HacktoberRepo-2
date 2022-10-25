public class EvenNum {
    public static void main(String[] args) {

        int[] nums = {12,345,2,6,7896};

        System.out.println(digits2(136546));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num: nums) {
            if (Even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean Even(int num) {
        int noOfDigits = digits(num);
        /*
        if(noOfDigits % 2 == 0) {
            return true;
        }
        return false;
         */
        return noOfDigits % 2 == 0;
    }

    static int digits(int num) {

        if(num < 0) {
            num = num*-1;
        }
            int count = 0;

            while(num > 0) {
                num = num/10;
                count++;
            }
            return count;
    }

    static int digits2(int num) {
        if(num < 0) {
            num = num*-1;
        }
        return (int)(Math.log10(num)) +1;
    }
}
