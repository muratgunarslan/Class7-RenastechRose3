package Day14_NestedLoops;

import java.util.Scanner;

public class Topic1_DoWhileLoop {
    // do {
    // Code Block
    // } while (condition)

    // print all the number from 1 to 10

    public static void main(String[] args) {

        int i = 1;
        do{
            System.out.println("The number is : " + i); // This code block will executed
                                                        // even if the condition in the while
                                                        // condition is
            i++;

        } while (i<0);

        // write a code where use being asked to enter a one letter string but even if the string has more
// than 1 char print only the first char

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 1 char String : ");
        String st = scan.nextLine();

        int j = 0;
        do {
            System.out.println("Ther first char of the spring is " +st.charAt(j));
            j++;
        }while (j<2);
    }

}



