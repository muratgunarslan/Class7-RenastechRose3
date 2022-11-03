package Day17_ArraysCont;

import java.util.Arrays;

public class Topic4_ArraysSort {
    public static void main(String[] args) {

        int [] nums = {56, 32, 34, 90, -345, -12, -34};

        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));
        System.out.println(nums[0]);

        System.out.println("++++++++++++++++++++++++");

        String [] names = {"Zeliha", "Elo", "Hakar", "Amer"};
        System.out.println(Arrays.toString(names));


        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        System.out.println("*********************************");

        int [] nums3 = {90, 34, -123, -456, 23, 1234, 5673};

        int [] reverse = new int[nums.length];

        Arrays.sort(nums3);

        int j = 0;

        for (int i = nums3.length-1;  i >=0 ; i--) {

            reverse[j] = nums3[i];
            j++;


        }
        System.out.println(Arrays.toString(reverse));

    }
}
