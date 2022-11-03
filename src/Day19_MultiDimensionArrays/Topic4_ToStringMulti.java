package Day19_MultiDimensionArrays;

import java.util.Arrays;

public class Topic4_ToStringMulti {
    public static void main(String[] args) {

        int[] nums = {9,4,5,6,3,2,4,5,6,73,23,2,3,2};
        System.out.println("The nums arrays is : "+Arrays.toString(nums));

        int[][] multiD = {{3,4,5,6,1,2,} , {87,90,322,56}, {34,2,3,4,5,6}};

        for (int i = 0; i < multiD.length; i++) {

            System.out.println("The values : "+Arrays.toString(multiD[i]));

        }

        int[][] multi = {{3,4,5,6,1,2,} , {87,90,322,56}, {34,2,3,4,5,6}};
        System.out.println("The multi array values : "+Arrays.deepToString(multi));
        // used to convert the multi arrays to string
    }
}
