package Day15_NestedLoops;

public class Topic4_BreakandContinue {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            if (i==5){

                continue;
            }

            System.out.println("the i value is "+i);
        }

        int j = 0;

        while (j<10){

            if (j==7 || j == 8){
                j++;
                continue;

            }
            System.out.println("The j value : "+j);
            j++;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("From Outer Loop the i value is ; "+i);

            for (int k = 1; k < 10; k++) {

                if (k==5 || k==8){
                    continue;
                }
                System.out.println("The outer loop k value"+k);
            }
        }

    }//main
}//class
