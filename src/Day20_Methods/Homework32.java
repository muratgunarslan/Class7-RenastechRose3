package Day20_Methods;

import java.util.Arrays;
import java.util.Scanner;

public class Homework32 {
    public static void main(String[] args) {
        ////Write   a     program   to   with following requirements
        //1) user should be prompted about how many numbers is going to be entered
        //2) User should be prompted for the values of the numbers
        //3) Reverse the all the given numbers and print it

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number for the array size: ");
        int size = scan.nextInt();

        int [] array = new int[size];

        for (int i=0; i< size; i++){
            System.out.println("Please enter the "+(i+1)+" number: ");
            array[i] = scan.nextInt();
        }

        int [] reversedArray = new int[size];
        int j = 0;
        for (int i=array.length-1; i>=0; i--){
            reversedArray[i] = array[j];
            j++;
        }

        System.out.println("Reversed Array: "+ Arrays.toString(reversedArray));

    }
}
