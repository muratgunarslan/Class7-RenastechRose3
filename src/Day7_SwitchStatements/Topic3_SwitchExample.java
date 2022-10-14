package Day7_SwitchStatements;

public class Topic3_SwitchExample {
    public static void main(String[] args) {

        // it will decide what day it is?
        // write a code where it prints the name of the day based on the weeks day

        int day =2;

        switch (day){
            case 1:
                System.out.println("the first day of the week is Monday");
                break;
                case 2:
                System.out.println("the second day of week is Tuesday");
                break;
                case 3:
                System.out.println("the third day of the week is Wednesday");
                break;
            case 4:
                System.out.println("the 4th day of the week is Thursday");
                break;
            case 5:
                System.out.println("the 5th day of week is Friday");
                break;
            case  6:
                System.out.println("the 6th day of week is Saturday");
                break;
            case 7:
                System.out.println("the 7th day of week is Sunday");
                break;
            default:
                System.out.println("invalid day of the week");



        }
    }
}
