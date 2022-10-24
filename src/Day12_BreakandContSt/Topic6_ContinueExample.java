package Day12_BreakandContSt;

import java.util.Scanner;

public class Topic6_ContinueExample {
    public static void main(String[] args) {

        // write a code where user is being asked to enter an name restructure the name
        // to not contain 'l' or 'L'

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a name");
        String name = scan.nextLine();
        String rename = "";

        for (int i = 0; i < name.length(); i++) {

            if (name.charAt(i)=='l' || name.charAt(i)=='L'){
                continue; // continue means skip this point
            }
            rename = rename+name.charAt(i);
        }
        System.out.println("the rename is ; "+rename);







    }
}
