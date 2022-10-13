package Day8_Scanners;

import java.util.Scanner;

public class Homework10 {

    // Write a code where user is being asked to
    // enter a number and based on the entered number
    // print the number is positive, negative or zero


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number");
        int number=sc.nextInt();

        if(number>0){
            System.out.println(number+ " is a positive number");
        } else if (number<0) {
            System.out.println(number+ " is a  negative number");
        }else System.out.println(number+ " is zero");



    }
}
