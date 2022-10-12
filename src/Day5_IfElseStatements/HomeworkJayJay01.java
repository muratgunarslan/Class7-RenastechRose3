package Day5_IfElseStatements;

public class HomeworkJayJay01 {
    public static void main(String[] args) {
        //task  1: create a java program that will
        // check if number is divisible by 2 and 5 same time

        int number = 30;

        if((number%2 == 0) && (number%5 ==0)) {
            System.out.println(number + "is divisible by 2 and 5 same time");
        }
        else {
            System.out.println("INDIVISIBLE");
        }
    }
}
