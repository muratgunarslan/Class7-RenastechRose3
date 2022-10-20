package Day11_ForLoopCont;

public class Topic3_ForLoopEx2 {
    public static void main(String[] args) {

        // write a code where you find the even numbers between 10 to 120 (not included)

        int count = 0;
        for (int i = 10; i<120; i+=2){
            count++; // count = count+1
        }
        System.out.println("The count of even numbers ; "+count);


    } // main
} // class
