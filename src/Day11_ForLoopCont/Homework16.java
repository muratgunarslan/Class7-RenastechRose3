package Day11_ForLoopCont;

import java.util.Scanner;

public class Homework16 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your first name madam?");
        String nameWoman1 = scan.nextLine();

        System.out.println("What is your last name madam?");
        String nameWoman2 = scan.nextLine();

        System.out.println("What is your first name sir?");
        String nameMan1 = scan.nextLine();

        System.out.println("What is your last name sir?");
        String nameMan2 = scan.nextLine();

        System.out.println("If you want to keep your last name please type 1 or if you want to change your last name type 2");
        int num = scan.nextInt();

        if (num == 1){
            System.out.println("Madam's name is : "+nameWoman1+nameWoman2);
            System.out.println("Sir's name is : "+nameMan1+nameMan2);

        } else if (num == 2) {
            System.out.println("Madam's new name is ; "+nameWoman1+nameMan2);
            System.out.println("Sir's new name is ; "+nameMan1+nameWoman2);

        }else{
            System.out.println("Enter a valid number");
        }

    } //main
} //class
