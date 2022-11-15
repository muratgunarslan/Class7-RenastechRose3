package Day22_MethodOverloadandWrapperClass;

public class Homework37 {
    public static void main(String[] args) {

        //write a method where it takes 2 double values and 1 integer value.
        // When the integer value is 1 it returns to sum of the 2 double numbers,
        // when integer is 2 it returns the subtraction of those 2 double number,
        // when integer value is 3 it returns to the multiplication of those 2 double numbers,
        // and when the integer value is 4 it returns the division of those 2 double numbers

        double [] nums = {10.5, 20.5, 3};

        if (nums[2]==1) {
            System.out.println(nums[0]+nums[1]);

        } else if (nums[2]==2) {
            System.out.println(nums[0]-nums[1]);

        } else if (nums[2]==3) {
            System.out.println(nums[0]*nums[1]);

        } else if (nums[2]==4) {
            System.out.println(nums[0]/nums[1]);
        }else
            System.out.println("INVALID");


    }//main
}//class
