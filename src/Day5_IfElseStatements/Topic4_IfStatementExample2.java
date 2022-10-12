package Day5_IfElseStatements;

public class Topic4_IfStatementExample2 {
    public static void main(String[] args) {

        //write a code where is checks when two numbers are subtracts if the result is negative
        //or positive or zero

        int num1 = 99;
        int num2 = 9;

        int ans = num1-num2;

        if(ans>0){
            System.out.println("the answer is positive and the answer  :"+ans);
        }

        if(ans<0){
            System.out.println("the answer is negative and the answer  :"+ans);
        }

        if(ans==0){
            System.out.println("the answer is  :"+ans);
        }
    }
}
