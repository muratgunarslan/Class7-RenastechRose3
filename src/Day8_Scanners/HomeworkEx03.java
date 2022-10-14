package Day8_Scanners;

import java.util.Scanner;

public class HomeworkEx03 {
    public static void main(String[] args) {

        //A company decided to give bonus of 5% to employee if he/she year of service
        //is more than 5 years. Ask user for their salary and year service and
        // print the net bonus amount.

        Scanner scan = new Scanner(System.in);

        System.out.println("How long have you been working in the company?");
        int num1 = scan.nextInt();

        System.out.println("What is your annual salary?");
        int num2 = scan.nextInt();

        if (num1 >= 5){
            System.out.println("You will have bonus :" +num2*0.05);
        }else
            System.out.println("Sorry, you will not have bonus :(");

    }
}
