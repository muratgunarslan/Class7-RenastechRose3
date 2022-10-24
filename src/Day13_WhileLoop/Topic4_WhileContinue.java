package Day13_WhileLoop;

public class Topic4_WhileContinue {
    public static void main(String[] args) {

        // print all the numbers between 1 to 10 except number 5, 8 and 2

        int i = 1;
        while (i<10){
            if (i==5 || i == 8 || i == 2){
                i++;
                continue;

            }
            System.out.println("All the numbers " +i);
            i++;
        }

    }
}
