package Day14_NestedLoops;

import java.util.Scanner;

public class Homework27 {
    public static void main(String[] args) {

        // Write a code which asks user to enter a String and removes all the duplicate characters
        // from the String and prints the result
        //ex. "AAAAAVVVCCDDAA" ==> "AVCD"

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a word");
        String word = scan.nextLine();

        String remove = "";

        for (int i = 0; i < word.length(); i++) {
            if (!remove.contains(String.valueOf(word.charAt(i)))) {
                remove += String.valueOf(word.charAt(i));

            }

        }
        System.out.println("New word is ; " + remove);
        }//main
}//class
