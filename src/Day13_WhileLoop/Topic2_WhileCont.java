package Day13_WhileLoop;

import java.util.Scanner;

public class Topic2_WhileCont {
    public static void main(String[] args) {

        // write a code where user being asked enter two numbers
        // and sum all the numbers in between those two numbers
        // which can be divided by 5

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the first number");
        int num1 = scan.nextInt();

        System.out.println("Please enter tne second number");
        int num2 = scan.nextInt();

        int i;
        int j;

        if (num1>num2){
            i = num2;
            j = num1;

        }else {
            i = num1;
            j = num2;

        }

        int sum = 0;
        while (i<j){

            sum+=1; // sum = 0+13 ==> sum = 13+14 == 27+15
            i++;

        }

        System.out.println("the value of the sum is " +sum);







    }
}
