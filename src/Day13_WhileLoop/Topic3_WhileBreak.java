package Day13_WhileLoop;

public class Topic3_WhileBreak {
    public static void main(String[] args) {

        // print all the numbers between 1 to 10 but when the number is 5 break the loop

        int start = 1;
        while (start<10){

            if (start==5) {
                break;
            }
            System.out.println("the numbers are : "+start);
            start++;
        }
    }
}
