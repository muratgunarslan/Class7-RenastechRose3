package Day8_Scanners;

import java.util.Scanner;

public class Homework12 {

    public static void main(String[] args) {

        /*
        -Write a code where a teacher is entering student's first name, last name and the point they received from the exam.
- based on the point the code should automatically determine the grade of Student with the full name of the student
- This should be done for each student
- Assuming we do not know how many student are there but your code should still handle this situation
-  example input (first name = From the teacher, Last name=  from the teacher Point= from the teacher (90.5)
- When the point is between 90 to 100 the grade should be A
- When the point is between 80 to 90(excluded) the grade should be B
- When the point is between 70 to 80(excluded) the grade should be C
- When the point is between 60 to 70 (excluded) the grade should be D
- When the point is less than 60 the grade should be F
- Example output (First Name = Ziya Last Name = Yilmaz Grade: A )
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Whats is your first name?");
        String firstname=scan.nextLine();

        System.out.println("What is your last name?");
        String lastname=scan.nextLine();

        System.out.println("What is you point?");
        int point=scan.nextInt();

         if (point>90 && point<100)
        {
            System.out.println("Your grade is A " );
        } else if (point>80 && point<90) {
            System.out.println("Your grade is B " );

        } else if (point>70 && point<80) {
         System.out.println("Your grade is C " );
        } else if (point>60 && point<70) {
         System.out.println("Your grade is D ");
         }else
         System.out.println("Your point is F");
    }

}

/*
 if(points<0 || points>100){
            System.out.println("Not Valid Points");
        } else if (points>=90) {
            System.out.println("the Grade is A");
        } else if (points>=80) {
            System.out.println("the Grade is B");
        } else if (points>=70) {
            System.out.println("the Grade is C");
        } else if (points>=60) {
            System.out.println("the Grade is D");
        }else {
            System.out.println("the Grade is F");
        }
 */
