package Day16_Arrays;

public class Topic6_ArrayExample {
    public static void main(String[] args) {
        // write a code where you find maximum number in the given array below
        // arr = {56,23,1,90,31,54,67,81,100,24}

        int [] arr = {56,23,1,90,31,54,67,81,100,24};

        int max = arr[0];  // or Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (max < arr[i]){
                max = arr[i];

            }

        }
        System.out.println("The max value is : " +max);
    }
}
