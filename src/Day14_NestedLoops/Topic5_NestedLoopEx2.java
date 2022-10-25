package Day14_NestedLoops;

public class Topic5_NestedLoopEx2 {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {

            System.out.println("This is the first outer loop");
            for (int j = 0; j < 3; j++) {
                System.out.println(" \t his is the second outer/ first inner");
                for (int k = 0; k < 3; k++) {
                    System.out.println(" \t \t his is the second Inner loop");
                }

            }
        }
    }
}
