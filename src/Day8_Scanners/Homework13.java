package Day8_Scanners;

import java.util.Scanner;

public class Homework13 {
    public static void main(String[] args) {

        /*
        Write a calculator program by following instructions:
1) Ask the user to enter 1st number
2) Ask the user to enter second number
3) Ask the user to select the operation ( ask user to enter 1 for Summation, 2 for Subtraction,
                                           3 for Multiplication, and 4 for division.)
4) based on the selection perform operation and print the result of the operation
(Ex. enter 1st number : 20
	enter 2nd number: 25
	Select operation  enter 1 for Summation, 2 for Subtraction, 3 for Multiplication, and 4 for division.: 1
	The result is : 45.)
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the first number?");
        int num1=scan.nextInt();

        System.out.println("Please enter the second number?");
        int num2= scan.nextInt();

        System.out.println("Please enter 1 for Summation, 2 for Subtraction, 3 for Multiplication and 4 for division");
        int num3= scan.nextInt();

        if (num3 == 1)
        {
            System.out.println("The result is : "+(num1+num2));

        } else if (num3 == 2)
        {System.out.println("The result is : "+(num1-num2));

        }  else if (num3 == 3) {
            System.out.println("The result is : "+(num1*num2));

        }  else if (num3 == 4) {
            System.out.println("The result is : "+(num1/num2));

        } else
        System.out.println("In valid operation!");

    }
}
