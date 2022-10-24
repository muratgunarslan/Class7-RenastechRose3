package Day12_BreakandContSt;

import java.util.Scanner;

public class Topic4_BreakExample2 {

    public static void main(String[] args) {

        // user is being asked to enter a name and restructure the name
        // but as soon as it sees the "l" you should
        // stop restructure
        // Kyle ==> Ky

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a name");
        String name = sc.next();

        String rename = "";

        for (int i = 0; i < name.length(); i++) {

            if (name.charAt(i)=='l'){
                break;
            }
            rename=rename+name.charAt(i);

        }

        System.out.println("The rename value is ; "+rename);




    }
}
