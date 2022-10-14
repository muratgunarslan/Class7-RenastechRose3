package Day9_Strings;

public class Topic2_StringMethods {

    /*

Method	              Description                                                     	Return Type
charAt()	          Returns the character at the specified index (position)	        char
concat()	          Appends a string to the end of another string	                    String
contains()	          Checks whether a string contains a sequence of characters	        boolean
endsWith()	          Checks whether a string ends with the specified character(s)	    boolean
equals()	          Compares two strings. Returns true if the strings are equal,
                      and false if not	                                                boolean
equalsIgnoreCase()	  Compares two strings, ignoring case considerations	            boolean
indexOf()	          Returns the position of the first found occurrence
                      of specified characters in a string	                            int
isEmpty()	          Checks whether a string is empty or not	                        boolean
lastIndexOf()	      Returns the position of the last found occurrence of
                      specified characters in a string	                                int
length()	          Returns the length of a specified string	                        int
replace()	          Searches a string for a specified value, and returns
                      a new string where the specified values are replaced	            String
replaceFirst()	      Replaces the first occurrence of a substring that matches the
                      given regular expression with the given replacement	            String

startsWith()	      Checks whether a string starts with specified characters	        boolean
substring()	          Extracts the characters from a string,
                      beginning at a specified start position,
                      and through the specified number of character	                    String
toLowerCase()	      Converts a string to lower case letters	                        String
toUpperCase()	      Converts a string to upper case letters	                        String
trim()	              Removes whitespace from both ends of a string	                    String

     */
    public static void main(String[] args) {
        String str = "Something";

        // charAt()  Returns the character at the specified index (position) > char

        String str1 = "Tanya"; // Index or Position; T ==> 0 ' a ==> 1, n==> 2, y ==> 3, a==> 4
        char ch = str1.charAt(0);
        System.out.println("The char at the position 0 (or Index 0); "+ch);
        System.out.println("The char at the position 2 (or Index 2); "+str1.charAt(2));

        // concat()	 Appends (birlestirmek) a string to the end of another string > String

        String FirstName = "Ziya";
        String LastName = "Yilmaz";
        String FullName = FirstName.concat(LastName);
        System.out.println("The full name is; "+FullName);

        // contains()  Checks whether a string contains a sequence of characters > boolean

        String str3 = "This is a test";
        boolean con = str3.contains("t");
        System.out.println("Contains the test :"+con);

        // endsWith()  Checks whether a string ends with the specified character(s) >  boolean

        String str4 = "This is the String";
        boolean ends = str4.endsWith("ing");
        System.out.println("Does the String end with ing? "+ends);

        // equals()	 Compares two strings. Returns true if the strings are equal,
        // and false if not > boolen

        String str5 = "Hello";
        String str6 = "Hello";
        boolean eq = str5.equals(str6);
        System.out.println("Are they equal?: "+eq);
        String str7 = new String("Hello");
        boolean eq1 = str5.equals(str7);
        System.out.println("Are they Equal in the new keyword as well?: "+eq1);

        //equalsIgnoreCase()  Compares two strings, ignoring case considerations > boolean

        String str8 = "Andy";
        String str9 = "andy";
        boolean eq3 = str8.equals(str9);
        System.out.println("Are they Equal?: "+eq3);
        boolean eq4 = str8.equalsIgnoreCase(str9);
        System.out.println("Are they Equal when we ignore case "+eq4);

        // indexOf()	 Returns the position of the first found occurrence
        //               of specified characters in a string > int

        String str10 = "eloise";
        int pos = str10.indexOf("i");
        System.out.println("The index of i on the string is: "+pos);

        // lastIndexOf() Returns the position of the last found occurrence of
        //               specified characters in a string > int

        String str11 = "eloise";
        int pos1 = str10.indexOf("s");
        System.out.println("The index of i on the string is: "+pos1);

        // isEmpty() Checks whether a string is empty or not > boolean

        String str12 = "";
        System.out.println("is String Empty; "+(str12.isEmpty()));


        // length()	 Returns the length of a specified string > int

        String str13 = "qwertyasdfgzxcvb";
        System.out.println("The length of the String is; "+str13.length());






    }
}
