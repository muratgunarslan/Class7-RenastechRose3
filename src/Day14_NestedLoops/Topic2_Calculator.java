package Day14_NestedLoops;

import java.util.Scanner;

public class Topic2_Calculator {
    public static void main(String[] args) {

        /*
        Write a calculator program where it will do following

        1) User will be asker to make the decision 1 for Sum, 2 for Sub, 3 for Div, 4 Mult,
        any other numbers to exit
        2) After user make the selection user should be asked to enter the first number
        3) After that user should be asked to enter second number
        4) Perform the calculation and print the result
        5) Perform the calculation for different entries unless user select
         */

        System.out.println("***Welcome to Calculator***");
        Scanner scan = new Scanner(System.in);
        System.out.println(" 1 for Sum, 2 for Sub, 3 for Div, 4 Mult");



        int selection = scan.nextInt();
        while (selection==1 || selection==2 || selection==3 || selection==4){

            System.out.println("Please enter the first number : ");
            double num1 = scan.nextDouble();

            System.out.println("Please enter the second number :");
            double num2 = scan.nextDouble();

            double result = 0;

            if (selection==1){
                result=num1+num2;
            }
            else if (selection==2) {
                result=num1-num2;
            }
            else if (selection==3) {
                result=num1/num2;
            }
            else {
                result=num1*num2;
            }

            System.out.println("The result of the operation is : "+result);
            System.out.println("Please make the selection; 1 for SUM, 2 for SUB, 3 for DIV, 4 for MULT " +
                    "any others for to EXIT");
            selection = scan.nextInt();


        }
        System.out.println("Thank you for using calculator, your are exited now");





    }
}
