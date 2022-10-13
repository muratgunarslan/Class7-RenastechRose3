package Day8_Scanners;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

        Scanner mg = new Scanner(System.in);
        System.out.println("What is your name");
        String name1 = mg.nextLine();

        System.out.println("Your age is : ");
        int age1 = mg.nextInt();
        mg.nextLine();
        System.out.println("Your name is :" + name1 + "Your age is :" + age1);

        System.out.println("What is your name");
        String name2 = mg.nextLine();

        System.out.println("Your age is : ");
        int age2 = mg.nextInt();
        mg.nextLine();
        System.out.println("Your name is :" + name2 + "Your age is :" + age2);

        System.out.println("What is your name");
        String name3 = mg.nextLine();

        System.out.println("Your age is : ");
        int age3 = mg.nextInt();
        mg.nextLine();
        System.out.println("Your name is :" + name3 + "Your age is :" + age3);

        if(age1>age2 && age1>age3){

            System.out.println("the older person is :" +name1+  " and the age is : "+age1);

        }else if(age2>age1 && age2>age3){
            System.out.println("the oldest person is : "+name2+ " and the age is : " + age2);
        }else if (age3>age1 && age3>age2){
            System.out.println("the oldest person is : "+name3+ "and the age is : "+age3 );

        }else{
            System.out.println("there is no oldest one 1 person in group");
        }

    }
}
