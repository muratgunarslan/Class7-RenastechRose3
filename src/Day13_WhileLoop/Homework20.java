package Day13_WhileLoop;

import java.util.Scanner;

public class Homework20 {
    public static void main(String[] args) {

        // Write a code where user is asked to enter a number.
        //Find the sum of all the even numbers between 0 to that number (included)
        //Find the sum of all the odd numbers between 0 to that number (included)

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number");
        int num1 = scan.nextInt();

        int sum1 =0;
        int sum2 =0;

        for (int i = 0; i <=num1 ; i++) {

            if (i % 2 == 0)
            {
                sum1= sum1+i;
                System.out.println(i);
            } else if (i % 2 !=0) {
                sum2 = sum2+i;
                System.out.println(i);

            }

        }
        System.out.println("*****");
        System.out.println(sum1);
        System.out.println("*******");
        System.out.println(sum2);
    }
}
