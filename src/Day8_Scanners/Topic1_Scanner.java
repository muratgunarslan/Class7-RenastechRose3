package Day8_Scanners;

import java.util.Scanner;

public class Topic1_Scanner {
    public static void main(String[] args) {
        // Next () ==> only reads only 1 word on the console
        // Java Class
        // NextLine () ==> it reads whole line on the console
        // Java Class

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String firstName = scan.next();
        System.out.println("your firstname is: "+firstName);
        System.out.println("please enter your age: ");
        String age = scan.next();
        System.out.println("your age is: "+age);
        System.out.println("please enter your zipcode: ");
        String zipcode = scan.next();
        String zipcodeage = age+zipcode;
        System.out.println("the age + zipcode: "+zipcodeage);

    }
}
