public class Main {
    public static void main(String[] args) {
        /*
        // call the method sum
        sum(10, 20);
        sum(20, 30);
        sum(30, 40);
         */

        /*
        int start = 10;
        int end = 20;
        int total = 0;
        for (int i = start; i <= end; i++) {
            total = total + i;
        }
        System.out.println("The sum from " + start + " to " + end + " is " + total);

        // now sum from 20 to 30
        start = 20;
        end = 30;
        total = 0;
        for (int i = start; i <= end; i++) {
            total = total + i;
        }
        System.out.println("The sum from " + start + " to " + end + " is " + total);

        // now sum from 30 to 40
        start = 30;
        end = 40;
        total = 0;
        for (int i = start; i <= end; i++) {
            total = total + i;
        }
        System.out.println("The sum from " + start + " to " + end + " is " + total);
        
         */

    }

    // declaring and defining our method
    public static void sum(int start, int end){
        int total = 0;
        for (int i = start; i <= end; i++) {
            total = total + i;
        }
        System.out.println("The sum from " + start + " to " + end + " is " + total);
    }

}