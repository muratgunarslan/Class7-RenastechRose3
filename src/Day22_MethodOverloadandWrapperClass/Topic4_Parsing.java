package Day22_MethodOverloadandWrapperClass;

import java.util.ArrayList;

public class Topic4_Parsing {

    // parse method : converts string of text

    public static void main(String[] args) {

        String str = "1900";
        System.out.println(str+55);

        System.out.println("-----------");

        int number = Integer.parseInt(str);
        System.out.println(number+55);

        int primitive = 5;
        Integer wrapper = new Integer(5);
        Integer wrapper2 = 5;

        ArrayList<Integer> myNumber = new ArrayList<Integer>();


    }

}
