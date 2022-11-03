package Day18_ArraysUtil;

import java.util.Arrays;

public class Topic3_ArraysEqual {
    public static void main(String[] args) {

        int [] nums = {9,8,7,6,5,4};
        int [] nums1 = {9,8,7,6,5,4};

        System.out.println("nums and num1 equal : "+Arrays.equals(nums,nums1));

        int [] nums2 = {3,4,5};
        int [] nums3 = {5,4,3};
        System.out.println("nums2 and nums3 equal : "+Arrays.equals(nums2,nums3));

        char [] ch = {'K', 'T', 'E'};
        char [] ch1 = {'K', 'T', 'e' };
        System.out.println("ch and ch1 arrays equal : "+Arrays.equals(ch, ch1));

        int [] nums4 = {7,8,9,5,10}; // int a = 10;
        int [] nums5 = nums4;        // int b = a;
        System.out.println("num5 values ; "+Arrays.toString(nums5));

        System.out.println("nums4 and nums5 equal : "+Arrays.equals(nums4,nums5));

    }
}
