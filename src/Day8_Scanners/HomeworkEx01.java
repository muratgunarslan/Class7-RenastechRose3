package Day8_Scanners;

import java.util.Scanner;

public class HomeworkEx01 {
    public static void main(String[] args) {
        /*
         Let's create a new Lottery system
         1- Ask the user's year of birth and create the user's age as variable
         2- Create a new int variable name it as myLuckyNumber and assign any number you want
         3-Ask user to enter his/her lucky number(new int variable with any value you would like to add)
         4- if the User is 18 years old or older, and the user's luckyNumber and your lucky number is matching Print "Congrats You won $1 million"
         5- if the user is younger than 18 don't ask the user's lucky number and print "You can not join lottery because of your age , Sorry"
         6- if the user is 18 years old or older, and the user's lucky number and your lucky number are not matching Print "Please try again"
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("How old are you?");
        int num1 = scan.nextInt();

        int myLuckyNumber = 48;

        System.out.println("What is your lucky number?");
        int num2 = scan.nextInt();

        if (num1 > 18  && myLuckyNumber == num2) {
            System.out.println("Congrats! You won $1 Million");

        } else if (num1 < 18) {
            System.out.println("Sorry, you can not buy a lottery ticket!");

        } else if (num1 > 18 && myLuckyNumber != num2) {
            System.out.println("Please try again!");

        } else
            System.out.println("Invalid data entry!");
    }
}