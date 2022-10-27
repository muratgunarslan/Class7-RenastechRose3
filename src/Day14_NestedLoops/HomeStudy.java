package Day14_NestedLoops;

public class HomeStudy {
    public static void main(String[] args) {

        int weeks = 4;
        int days =  7;

        //outer loop
        for (int i = 0; i <= weeks; i++) {
            System.out.println("weeks" +i);

            //inner loop
            for (int j = 0; j <= days; j++) {
                System.out.println("Days" +j);
            }

        }

    }
}
