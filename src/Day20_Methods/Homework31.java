package Day20_Methods;

import java.util.Scanner;

public class Homework31 {
    public static void main(String[] args) {
        //Write   a   program   that   creates   an   array   of   10   elements   size.
        // Your   program   should   prompt   the   user   to   input   numbers   in   array   and   then   display   the   sum   of   all
        //array   elements. ( we already did this in the class but try to do it again)

        Scanner scan = new Scanner(System.in);

        int [] murat = new int[10];
        int sum = 0;

        for (int i = 0; i < murat.length ; i++) {
            System.out.println("please enter the" + (i+1)+"th number");
            murat[i] = scan.nextInt();
            sum= sum+murat[i];
        }
        System.out.println("The sum is : "+sum);

    }
}
