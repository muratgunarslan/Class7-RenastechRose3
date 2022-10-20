package Day10_StringMethods;

import java.util.Scanner;

public class Topic2_Examples {
    public static void main(String[] args) {

        String name = "Baran Cevrim"; // BarCev
        String newName = name.substring(0,3) + name.substring(6,9);
        System.out.println("The new name value is ; "+newName);
        System.out.println("NEW EXAMPE ***********");

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter first name : ");
        String FirstName = scan.next();

        System.out.println("Please enter last name : ");
        String LastName = scan.next();

        String Changed = (FirstName.replace('a' , 'b') + LastName.replace('a' , 'c')).toUpperCase();
        System.out.println("The value of Changes now is ; "+Changed);

        /*String name2 = "Andrew";
        System.out.println(name2.replace('z' , 'a'));*/




    }
}
