package Day15_NestedLoops;

public class Topic3_ForandWhileNestedLoop {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("This is from outer loop "+i);
            int j =1;
            while (j<10){
                System.out.println("This is from inner loop "+j);
                j++;
            }

            System.out.println("This is from outer : i : "+i);

        }
    }
}
