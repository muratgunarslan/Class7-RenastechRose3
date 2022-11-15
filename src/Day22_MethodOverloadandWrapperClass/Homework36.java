package Day22_MethodOverloadandWrapperClass;

import java.util.Arrays;

public class Homework36 {
    public static void main(String[] args) {

        //Write a method where it takes array of integers and returns the sorted version of that array

        int [] nums = {2008, 1981, 1979};

        System.out.println("The numbers are : "+Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println("The sorted numbers are : "+Arrays.toString(nums));

    }//main
}//class
