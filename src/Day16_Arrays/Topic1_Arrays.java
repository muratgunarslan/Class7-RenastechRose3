package Day16_Arrays;

public class Topic1_Arrays {
    public static void main(String[] args) {
        // Arrays contains multiple values and you
        // You define the value

        //Variable:
        //DataType name = value

        //Arrays: are the containers where they hold multiple same data types
        //DataType [] name = {value1, value2, value3}

        // byte[] anArrayOfBytes;
        // short[] anArrayOfShorts;
        // long[] anArrayOfLongs;
        // float[] anArrayOfFloats;
        // double[] anArrayOfDoubles;
        // boolean[] anArrayOfBooleans;
        // char[] anArrayOfChars;
        // String[] anArrayOfStrings;

        /* int num1 = 78;
           int num2 = 23;
           int num3 = 91;
           int num4 = 34; */

        int [] array1 = {78, 23, 91, 34};

        // In arrays index starts from 0

        int [] array2 = { 67,        90,         28,         10};
        // the index     index0     index1      index2      index3

        // if I want to get the number in index 0,  ==> array2 [0]

        System.out.println("The first number in array is : "+array2[0]);
        System.out.println("The second number in array is : "+array2[1]);
        System.out.println("The third  number in array is : "+array2[2]);
        System.out.println("The fourth  number in array is : "+array2[3]);

        int var3 = array2[2];
        System.out.println("The var3 value is "+var3);

        System.out.println("***********************************************");

        // Boolean data type arrays

        boolean [] BoolArray = {true, false, true, true};
        System.out.println("The value in index 3 in BoolArray is :"+BoolArray[3]);

        boolean var = BoolArray [1];
        System.out.println("The var value is : "+var);

        System.out.println("***************************************************");

        // double data type arrays

        double [] DobArray = {90, 65.23, 23};
        System.out.println("The value in index 0 ; "+DobArray[0]);

        System.out.println("*****************************************************");

        // String Arrays

        String [] stringArraynames = {"Cheesus", "Hrakar", "Ziya", "Nelly", null};
        System.out.println("Tne name is : "+stringArraynames[3]);
        System.out.println("The value of index 4 : "+stringArraynames[4]);




    }//main
}//class
