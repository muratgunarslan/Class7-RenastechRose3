package Day13_WhileLoop;

import java.util.Scanner;

public class Homework19 {
    public static void main(String[] args) {

        // Write a code where user is asked to enter a number
        // and check for every number between 0 to that number
        // to see how many numbers between 0 to that number
        // can be divided to 3 and 5 and sum all those numbers, Print the result

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number");
        int num1 = scan.nextInt();

        int sum = 0;

        for (int i = 0; i < num1; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                sum=sum+i;

                System.out.println(i);

            }

        }
        System.out.println("\"The count of the number can divided by 3 and 5: " +sum);
    }
}
