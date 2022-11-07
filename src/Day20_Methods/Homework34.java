package Day20_Methods;

import java.util.Arrays;

public class Homework34 {
    public static void main(String[] args) {
        //Write code where it shifts all the elements in array by one index and put  the first index at the end of the array
        //example array = {2,3,4,5,6,7,8,9} ===> shifted array = {3,4,5,6,7,8,9,2}

        /*int [] arr = {2,3,4,5,6,7,8,9};
        int [] arr2 = {};
        int [] arr3 = new int[5];
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(arr[5]);*/

        int [] arr = {2,3,4,5,6,7,8,9};

        int[] shiftedArray = new int[arr.length];
        for (int i = 0; i < arr.length-1; i++) {
            shiftedArray[i] = arr[i+1];

        }
        shiftedArray[arr.length-1]=arr[0];
        System.out.println("Array after reversing: "+Arrays.toString(shiftedArray));
    }
}
