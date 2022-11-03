package Day16_Arrays;

public class Topic4_ArrayExamples {
    public static void main(String[] args) {

        int [] arr = {9,3,4,5,2,10,34};

        System.out.println("The size - length arr is : "+arr.length);
        int leng = arr.length; // lenght method returns to an integer value which is the size
                                // or length of an array
        System.out.println("The variable is the lenght of array is : "+leng);
        // System.out.println("All the values in array is : "+arr.toString());
        System.out.println("The value in index 0 : "+arr[0]);
        System.out.println("The value in index 1 : "+arr[1]);
        System.out.println("The value in index 2 : "+arr[2]);
        System.out.println("The value in index 3 : "+arr[3]);
        System.out.println("The value in index 4 : "+arr[4]);
        System.out.println("The value in index 5 : "+arr[5]);
        System.out.println("The value in index 6 : "+arr[6]);

        System.out.println("*****************************************************");

        for (int i = 0; i <arr.length; i++) {
            System.out.println("The value in index "+i+" : "+arr[i]);
            System.out.println(" ");

        }



    }
}
