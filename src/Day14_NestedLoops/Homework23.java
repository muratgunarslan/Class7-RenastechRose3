package Day14_NestedLoops;

import java.util.Scanner;

public class Homework23 {
    public static void main(String[] args) {
        //Write a program where the user is being asked to enter a String and that
        // will   count   how   many   times   "a" or 'A'   is   found   in that entered String

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your name");
        String name = scan.nextLine();

        int a = 0;
        int A = 0;

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i)=='a'){
                a++;

            } else if (name.charAt(i)=='A') {

            }

        }
        System.out.println("a  " +a);
        System.out.println("A  " +A);


    } //main
} //class
