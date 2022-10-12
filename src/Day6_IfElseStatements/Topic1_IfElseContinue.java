package Day6_IfElseStatements;

public class Topic1_IfElseContinue {
    public static void main(String[] args) {

        //write a code where determines if students grade based on the points they receive
        // 90  -- 100 is A
        // 80 - 90 is B
        // 70 - 80 is C
        // 60 - 70 is D
        // rest is F
        // also if the given point is greater than 100 or less than 0 print "not valid point"

        double points = 23;
        if(points<0 || points>100){
            System.out.println("Not Valid Points");
        } else if (points>=90) {
            System.out.println("the Grade is A");
        } else if (points>=80) {
            System.out.println("the Grade is B");
        } else if (points>=70) {
            System.out.println("the Grade is C");
        } else if (points>=60) {
            System.out.println("the Grade is D");
        }else {
            System.out.println("the Grade is F");
        }

    }
}
