package Day10_StringMethods;

public class Topic3_ForLoop {
    public static void main(String[] args) {

        /*

        for (starting point; end point; increase or decrease){
        Code Blocs

        }
         */

        for (int i = 0; i < 20; i++) {
            System.out.println("the i value: " + i);
        }

        System.out.println("******************");

        for (int i = 10; i <= 90; i += 2) { // i=i+2
            System.out.println("the i values " + i);
        }

        System.out.println("******************");

        for (int fiko = 20; fiko > 0; fiko--) {
            System.out.println("The value is of fiko ; " + fiko);

        }

        System.out.println("******************");

        // write a code where you calculate the sum of all the numbers between 0 to 20;

        int result = 0;
        for (int j = 0; j < 20; j++) {

             result = result+j; // result = 0 + 0 = 0
                                // result = 0+1 = 1
                                // result = 1+2 = 3
                                // result = 3++ = 6

            System.out.println("the result for each iteration : "+result);

        }
        System.out.println("The END result is : "+result);

    }
}

