package Day15_NestedLoops;

public class Topic1_WhileNestedLoops {
    public static void main(String[] args) {
        /*
        while (condition){
            //code block
            while (condition2){
                // second code block
            }
        }
        */

        int i =0;
        //int j =1;
        while (i<10){
            System.out.println("The value of i "+i);
            int j =1;
            while (j<10){
                //int j =1;
                System.out.println("\t for each i value " +i+" the j value "+j);
                j++;
            }
            //System.out.println("this");
            i++;
        }

    }//main
}//class
