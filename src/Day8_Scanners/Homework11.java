package Day8_Scanners;

import java.util.Scanner;

public class Homework11 {

    public static void main(String[] args) {

        //Write a Revenue program, Where user enters the quantity of the products sold and
        // the price for each product. Then Calculate he revenue based on giving information
        // (hint: Revenue = quantity x price)

        Scanner scan = new Scanner(System.in);

        System.out.println("How many products sold?");
        int num1=scan.nextInt();

        System.out.println("How much is the product?");
        int num2= scan.nextInt();

        int rev = num1*num2;
        System.out.println("The revenue is :" +rev);

    }
}


