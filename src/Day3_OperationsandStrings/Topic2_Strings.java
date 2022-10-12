package Day3_OperationsandStrings;

public class Topic2_Strings {
    public static void main(String[] args) {

        // Strings are non-primitive data type
        // Datatype name = a value;

        String name = "Ziya";
        System.out.println(name);

        String prag = "This is a paragraph";
        System.out.println(prag);

        String prag2 = "99/*-+88";
        System.out.println(prag2);

        String numbers = "5678"; //This is not a number anymore. it is a text
        System.out.println(numbers);

        //combine 2 text

        String text1 = "This is text 1 ";
        String text2 = "This is the text 2";
        String text3 = text1+text2;
        System.out.println(text3);

        String number2 = "98";
        String number3 = "80";
        String number4 = number2+number3;
        System.out.println(number4);

        System.out.println("This is Hello World "+"This is the second Hello World\t"+"This is third\t");

        int num = 89;
        System.out.println("This is the number from int: "+num);

        String Name1 = "Murat";
        System.out.println("My First Name is : "+Name1);

        String Name2 = "Gunarslan";
        System.out.println("My Last Name is : "+Name2);

    }
}
