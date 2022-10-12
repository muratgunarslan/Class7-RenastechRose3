package Day6_IfElseStatements;

public class Topic4_MultipleTernary {
    public static void main(String[] args) {

        /* (condition)?first:(condition)?:second:(condition)?third:fourth;

         */

        // write a code where it checks if number is even or odd or zero
        // (a%2==0)?"The number is even":(a%2!=0)"The number is odd":"The number is ZERO";

        int number1 = 11;
        String result = (number1%2==0)?"The number1 is EVEN":(number1%2!=0)?"The number1 is ODD":"The number1 is ZERO";
        System.out.println(result);
    }
}
