package Day8_Scanners;

import java.util.Scanner;

public class Topic2_NextvsNextLine {

    // Next () ==> only reads only 1 word on the console it will stop at the space
    // Java Class (just "Java" will be scanned
    // NextLine () ==> it reads whole line on the console, it will stop at the next line
    // Java Class (whole line "Java Class" will be scanned

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your first name and last name: ");

        String name = sc.nextLine();

        System.out.println("your first and last name is ; "+name);

        System.out.println("please enter your phone number: ");
        String phone = sc.nextLine();
        System.out.println("Your name is: "+name+" your phone number is: "+phone);


    }
}
