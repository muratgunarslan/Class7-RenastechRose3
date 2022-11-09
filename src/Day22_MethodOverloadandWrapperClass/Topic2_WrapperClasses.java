package Day22_MethodOverloadandWrapperClass;

import java.util.ArrayList;

public class Topic2_WrapperClasses {

    public static void main(String[] args) {

        // Primitive Data Types
        // >> int, short, long, float, byte, double, boolean, char

        // Non Primitive Data Types objects are getting created by classes

        // Primitive Classes

        // byte     // Byte
        // int      // Integer
        // short    // Short
        // long     // Long
        // float    // Float
        // double   // Double
        // boolean  // Boolean
        // char     // Character

        int number = 5;

        System.out.println(number);

        Integer numbers = 5;

        System.out.println(numbers);

        numbers.toString();

        // Example
        // ArrayList<int> myNumber = new ArrayList<int>(); // invalid
        // ArrayList<Integer> myNumber = new ArrayList<int>(); // valid
        // [1,2,3,4]

        String name = "";

        Character myChar = 'A';

        Byte b1 = 11; // wrapper
        byte b2 = 12; // primitive
        Byte b3 = b2; // wrapper


        System.out.println("--------------------");

        // toString
        Integer myInt = 5;
        System.out.println(myInt);
        String myString = myInt.toString();
        System.out.println(myString.length());


    }
}
