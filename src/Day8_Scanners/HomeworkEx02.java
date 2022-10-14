package Day8_Scanners;

import java.util.Scanner;

public class HomeworkEx02 {

    public static void main(String[] args) {

        /* A shop will give discount of %10 if the cost of purchased quantity is more than 1000.
Ask user for quantity and print the total cost for user.
 */
        Scanner scan = new Scanner(System.in);

        System.out.println("How much is the product?");
        int num1 = scan.nextInt();

        System.out.println("How many products did you buy?");
        int num2 = scan.nextInt();

        if (num2 >= 1000){
        System.out.println("You had %10 discount and you will pay " +((num1*num2)*0.9));

        }else
            System.out.println("You do not have any discount!");

    }
}
