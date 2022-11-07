package Day19_MultiDimensionArrays;

import java.util.Arrays;

public class StudyHall03 {
    public static void main(String[] args) {

        int myArray [] = new int[4];

        myArray[0] = 123;
        myArray[1] = 123123;
        myArray[2] = 13454;
        myArray[3] = 56563;
        //System.out.println(myArray);

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

        System.out.println("----------------------------");

        for (int element : myArray) {
            System.out.println(element);
        }

        System.out.println("----------------------------");

        String [] names = {"jack", "john", "july"};
            System.out.println(Arrays.toString(names));
        //System.out.println(names);

        System.out.println("----------------------------");

        String gfg [][]
                = {{ "Article Writing "},
                {"Google" , "Search Engine"},
                {"Facebook" , "Social Media" }};
        System.out.println(Arrays.deepToString(gfg));

        System.out.println("----------------------------");

        int [] numbers = {2,4,6,8,10};
        for (int index = numbers.length-1; index >=0 ; index--) {
            System.out.println(numbers[index]);
        }
        System.out.println("----------------------------");

        int[] testArray = new int[50];
        for (int i = 0; i < testArray.length; i++) {
            testArray[i]=i;
        }

        int [] numbers2 = {2, -9, 0, 5, 12, -25, 22, 9,8, 12};
        int sum = 0;
        double avarage;

        for (int number : numbers2){
            sum+=number;
        }
        int arrayLength = numbers2.length;

        avarage = (double) sum / (double) arrayLength;
        System.out.println("sum = " + sum);
        System.out.println("Avarage =+" +avarage);

        }

    }

