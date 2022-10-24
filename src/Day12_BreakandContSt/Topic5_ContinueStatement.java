package Day12_BreakandContSt;

public class Topic5_ContinueStatement {
    public static void main(String[] args) {

        // we use continue key word to disregard that iteration when certain conditions are met

        for (int i = 0; i < 10; i++) {

            if (i == 5) {
                continue; //skips the value
            }

            System.out.println("The i value for each iteration" + i);


        }

    }
}
