package Day12_BreakandContSt;

import java.util.Scanner;

public class Topic1_ForLoopCont {
    public static void main(String[] args) {

        // write a code where it asks user to enter two different numbers and sum all the even numbers
        // in between those two numbers
        // numbers 10 and 20 (20 not included) ==> 10,12,14,16,18

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter first number");
        int num1 = scan.nextInt();

        System.out.println("Please enter second number");
        int num2 = scan.nextInt();

        int start = 0; // to hold the smaller number
        int end = 0; // to hold the higher number

        if (num1>num2){
            start = num2;
            end = num1;
        }
        else if(num1==num2){
            System.out.println("Invalid entry");
        }
        else{
            start = num1;
            end = num2;       
        }
        int sum = 0;
        
        for (int i = start; i < end; i++) {
            if (i%2==0){
                sum = sum+i; // this will add the even number to sum
            }
        }
        System.out.println("The sum of all the even numbers in between "+start+" and "+end+" is : "+sum);

    }//main
}//class
