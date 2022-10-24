package Day13_WhileLoop;

import java.util.Scanner;

public class Homework18 {
    public static void main(String[] args) {

        //Write a code where user is asked to enter an integer number:
        //Using the given number find the factorial of that number and Print the result.
        //example: 5 ==> 5! = 5*4*3*2*1 = 120

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number");
        int num1 = scan.nextInt();

        int fac = 1;

        for (int i = 1; i <=num1 ; i++) {
            fac=fac*i;
        }
        System.out.println("The factorial is ; "+fac);
            
        }




    }

