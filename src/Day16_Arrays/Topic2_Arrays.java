package Day16_Arrays;

public class Topic2_Arrays {
    public static void main(String[] args) {
        // we can define an array with a size but not add any values

        // DataType [] name = new DataType [size/length]

        int [] intArray = new int[4]; // {0, 0, 0,0} // this will populate intArray with 0
                                        // because the default value for int is 0
        // 0 is also default value for byte, short and long data types

        System.out.println("The index 0 value in intArrya is " +intArray[0]);
        System.out.println("The index 1 value in intArrya is " +intArray[1]);
        System.out.println("The index 2 value in intArrya is " +intArray[2]);
        System.out.println("The index 3 value in intArrya is " +intArray[3]);
        //System.out.println("The index 4 value in intArrya is " +intArray[4]); ERROR
        // System.out.println("The index 3 value in intArrya is " +intArray); hashcode

        System.out.println("*********************************************************");

        double [] doubArray = new double[3];
        System.out.println("The value of index 1 in doubArray :"+doubArray[1]);

        System.out.println("*********************************************************");

        char [] charArray = new char[4]; // { , , , } // space
        System.out.println("The default value of char = "+charArray[1]);

        System.out.println("*********************************************************");

        String [] stringArray = new String[3]; // {null, null, null}
        System.out.println("The default value for String is :"+stringArray[0]);

        System.out.println("*********************************************************");

        // once array size or length is defined it can not be changed what you can create
        // array and put all the values in the array



    }//main
}//class
