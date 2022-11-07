package Day20_Methods;

import java.util.Arrays;

public class Homework29 {
    public static void main(String[] args) {
        //write a code with following requirements
        //- define an array with following values {90,34,23,87,45,36,98}
        //- Print the values that can be divided by 2 or 3

        int [] murat = {90,34,23,87,45,36,98};
        System.out.println(Arrays.toString(murat));
        System.out.println("-----------------------------");
        

        for (int i = 0; i < murat.length; i++) {
            if (murat[i]%2==0 && murat[i]%3==0){
                System.out.println(murat[i] + " can be divided by 2 and 3");
            }
            else if (murat[i]%2==0){
                System.out.println(murat[i] + " can be divided by 2");
            } else if (murat[i]%3==0) {
                System.out.println(murat[i] + " can be divided by 3");

            }else
                System.out.println(murat[i]+ " cannot be divided by 2 or 3 ");

        }

    }
}
