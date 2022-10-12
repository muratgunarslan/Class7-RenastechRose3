package Day5_IfElseStatements;

public class HomeworkJayJay03 {
    public static void main(String[] args)  {
        //task 3: create Program to check
        // whether the given number is positive or negative

        int number= 7;
        String result= "";

        if(number>0){
            result= number + " is a positive number";
        } else if (number<0) {
            result= number + " is a negative number";
        }else {result= number + " is neither negative nor positive.";}

        System.out.println(result);

    }
}

