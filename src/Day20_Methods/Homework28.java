package Day20_Methods;

import java.util.Arrays;

public class Homework28 {
    public static void main(String[] args) {
        //Write a code with following requirements:
        //- Define an array with values of {6,7,2,3,90,-2,-90,-122,96,35}
        //- Print the minimum number in the given array

        int [] murat = {6,7,2,3,90,-2,-90,-122,96,35};
        System.out.println(Arrays.toString(murat));
        int min = murat[0];

        for (int i = 0; i < murat.length; i++) {
            if (min > murat[i]) {
                min = murat[i];
            }

        }
        System.out.println("The minimum number is : "+min);
    }

}
