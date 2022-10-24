package Day13_WhileLoop;

public class Topic3_WhileBreak2 {
    public static void main(String[] args) {

        // Print all the characters in String value of Nawras but
        // break it when there is a char

        String name = "Nawras";
        int i =0;
        while (i<name.length()){
            if (name.charAt(i)=='a'){
                break;
            }
            System.out.println("The char at index "+i+" is: "+name.charAt(i));
            i++;

        }


    }
}
