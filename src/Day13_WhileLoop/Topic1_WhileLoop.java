package Day13_WhileLoop;

import java.util.Scanner;

public class Topic1_WhileLoop {
    public static void main(String[] args) {

     // write a code where user is being asked ti enter 2 numbers and
        // find how many even numbers are between in those 2 numbers

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the first number");
        int num1 = scan.nextInt();

        System.out.println("Please enter the second number");
        int num2 = scan.nextInt();

        int count=0;

        while(num1<num2){ // this will be true

            if (num1%2==0){
                count++;
            }
            num1++; // if we do not increase the num1 this loop infinite
            System.out.println("the num1 value for each iteration : "+num1);
        }

        System.out.println("The count of number is ; "+count);



    }
}
