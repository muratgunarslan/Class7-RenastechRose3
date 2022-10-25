package Day14_NestedLoops;

public class Topic3_NestedLoops {
    public static void main(String[] args) {

        // Nested Loops
        // Assume that you have 3 different fruits each have 10
        // You want to give 10 people equally each one of the

        for (int i = 0; i < 3; i++) { // outer loop

            System.out.println("the distribution : "+i);
            for (int j = 1; j <=10; j++) { // inner loop
                System.out.println("Fruit "+i+" for the kid : "+j);

            }
        }

        System.out.println("Fruits are distributed");
    }
}
