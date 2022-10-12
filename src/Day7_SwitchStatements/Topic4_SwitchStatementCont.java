package Day7_SwitchStatements;

public class Topic4_SwitchStatementCont {
    public static void main(String[] args) {

        // it will decide what day it is?
        // write a code where it prints the name of the day based on the weeks day

        int day =2;

        switch (day){
            case 1:
                System.out.println("the first day of the week is Monday");

            case 2:
                System.out.println("the second day of week is Tuesday");

            case 3:
                System.out.println("the third day of the week is Wednesday");

            case 4:
                System.out.println("the 4th day of the week is Thursday");

            case 5:
                System.out.println("the 5th day of week is Friday");

            case  6:
                System.out.println("the 6th day of week is Saturday");

            case 7:
                System.out.println("the 7th day of week is Sunday");

            default:
                System.out.println("invalid day of the week");

        }
    }
}
