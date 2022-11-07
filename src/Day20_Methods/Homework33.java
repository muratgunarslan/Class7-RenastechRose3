package Day20_Methods;

import java.util.Scanner;

public class Homework33 {
    public static void main(String[] args) {
        //Write a code where user is asked to enter for 5 employee salaries and store those salaries
        //Then find the average salary of those 5 employees

        Scanner scan = new Scanner(System.in);

        int [] salary = new int[5];
        int sum = 0;
        for (int i = 0; i < salary.length; i++) {
            System.out.println("Please enter the salaries");
            salary[i]= scan.nextInt();
            sum=sum+salary[i];
        }
        System.out.println("The average of the salaries is : "+(sum/5));
    }
}
