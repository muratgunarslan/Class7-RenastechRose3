package Day20_Methods;

import java.util.Arrays;

public class Homework30 {
    public static void main(String[] args) {
        //Write  a code   string   array    with   the   following   strings:
        //"Sunday",   "Monday",   "Tuesday",   "Wednesday",   "Thursday",   "Friday"   and   "Saturday".
        //Write   a   loop   that   displays   the   contents   of   each   element   in   the   array   that   you   declared.

        String day [] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println(Arrays.toString(day));

        for (int i = 0; i < day.length; i++) {
            System.out.println("Today is : " + day[i]);
        }

    }
}
