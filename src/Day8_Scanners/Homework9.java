package Day8_Scanners;

import java.util.Scanner;

public class Homework9 {
    public static void main(String[] args) {


        //Write a code where User is being asked
        // for the first number, second number and third number.
        // Then Compare those number print the maximum number.


        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the first number");
        int num1=scan.nextInt();

        System.out.println("Please enter the second number");
        int num2=scan.nextInt();

        System.out.println("Please enter the third number");
        int num3=scan.nextInt();

        int maxNum=0;

        if(num1>num2 && num1>num3){
            maxNum=num1;
        } else if (num2>num1 && num2>num3) {
            maxNum=num2;
        }else {
            maxNum=num3;}

        System.out.println("Maximum number is :"+maxNum);

    }
    }

