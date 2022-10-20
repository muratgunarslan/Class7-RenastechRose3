package Day11_ForLoopCont;

import java.util.Scanner;

public class Homework14 {
    public static void main(String[] args) {

        //Write a code where user is being asked to enter a name:
        //if Name Starts with "A" and ends with "L" replace "A" with "B" and print the result

        /*
        //replace()	Searches a string for a specified value, and returns
        //          a new string where the specified values are replaced > String

        String name = "ZiyaZZZ";
        String Rename = name.replace('Z', 'Y');
        System.out.println("replace // the new value Z is : "+Rename);
        // name = name.replace('y', 'x'); // this will reassign the name variable to Zixa
        System.out.println("the value of name: "+name);

        String name1 = "Andrew";
        String Rename1 = name1.replace("An", "EX");
        System.out.println("replace // the new value if Rename1 : "+Rename1);
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a name");
        String name = scan.nextLine();

        String Rename = name.replace('A', 'B');

        if (name.startsWith("A") && (name.endsWith("L"))){
            System.out.println("New name is ; "+Rename);
        }else
        {
            System.out.println("Invalid name");
        }


    } //main
} //class
