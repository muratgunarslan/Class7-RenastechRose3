package Day18_ArraysUtil;

import java.util.Arrays;

public class Topic2_toCharArray {
    public static void main(String[] args) {

        String name= "This is + * ? Ziya Yilmaz";
        char [] ch = name.toCharArray(); // It returns to a a char array with every single char
                                        // in the String
        System.out.println("This is char arrays : "+ Arrays.toString(ch));
        // "R" is a String
        // 'R' is a char

        String test = "This is a Test";
        String [] StrArray = test.split("");
        char [] ChArray = test.toCharArray();

        char a = ChArray[0];

    }
}
