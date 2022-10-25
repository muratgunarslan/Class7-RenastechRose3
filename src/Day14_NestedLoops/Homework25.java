package Day14_NestedLoops;

import java.util.Scanner;

public class Homework25 {
    public static void main(String[] args) {

        //Write a code where the user is asked to enter an integer number
        //- sum of all the odd numbers between 1 to given number (included)
        // but exclude the 9,11,23,35 from the total sum if those numbers
        // happen to be in the range of 1 to the given number.

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number");
        int num = scan.nextInt();

        int sum = 0;

        for (int i = 1; i <= num ; i++) {
            if (i % 2 == 1) {

                if ((i == 9) || (i == 11) || (i == 23) || (i == 35)) {
                    i++;
                    continue;
                }
                sum = sum + i;
            }
        }
        System.out.println("sum = " + sum);
    }//main
}//class
