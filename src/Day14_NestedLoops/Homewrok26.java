package Day14_NestedLoops;

import java.util.Scanner;

public class Homewrok26 {
    public static void main(String[] args) {

        // Write a code where it ask user to enter an integer number
        //- Reverse the given number and print the result
        //- Example input ( 5678 )
        //- Example output ( 8765 )

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number");
        int num = scan.nextInt();
        int reversed = 0;

        System.out.println("Original Number: " + num);

        // run loop until num becomes 0
        while(num != 0) {

            // get last digit from num
            int digit = num % 10;
            reversed = reversed * 10 + digit;

            // remove the last digit from num
            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);

    }//main
}//class
