package Day12_BreakandContSt;

public class Topic2_BreakStatement {
    public static void main(String[] args) {

        // break statement
        // break; we use the break statement in for loop to get out of the loop when
        // the certain conditions are met

        for (int i = 0; i < 10; i++) {
            System.out.println("this is a code line");
            break;

        }
        System.out.println("This is outside of the for loop");
        for (int i = 0; i < 10; i++) {
            break;



        }


    }//main
}//class