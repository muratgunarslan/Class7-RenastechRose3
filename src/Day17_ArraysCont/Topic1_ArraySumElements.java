package Day17_ArraysCont;

import java.util.Scanner;

public class Topic1_ArraySumElements {
    public static void main(String[] args) {
        // write a code with following requirements
        // user should be asked about how many numbers that is going to add to array
        // user should be asked for each element for the array
        // find the sum of all the elements in array

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number of elements");
        int size = sc.nextInt();

        double [] numbers = new double[size];

        for (int i = 0; i < size; i++) {// or I could put numbers.length

            System.out.println("Please enter the "+(i+1)+". number");
            double num = sc.nextDouble();
            numbers[i] = num;

        }

        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {

            sum = sum + numbers[i];

        }

        System.out.println("the sum of all the number in the array is ; "+sum);




    }//main
}//class
