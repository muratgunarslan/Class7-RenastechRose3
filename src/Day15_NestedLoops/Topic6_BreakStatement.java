package Day15_NestedLoops;

public class Topic6_BreakStatement {
    public static void main(String[] args) {


        lbl: // label
        for (int i = 0; i < 10; i++) {

            System.out.println("From Outer Loop i value is : "+i);

            for (int j = 1; j <10 ; j++) {
                if (i==5){
                    break lbl; // label breaks the outer loop to the label level
                }

                System.out.println("\t From Inner Loop i value is : "+i+" j value"+j);
            }
        }



    }//man
}//class
