package Day20_Methods;

public class Topic5_FirstMethod {

    public static void PrintName (){
        System.out.println("My name is Ziya");

    }

    public static void main(String[] args) {

        System.out.println("This is the main method execution");

        PrintName();
        PrintLastName();

        System.out.println("This is in the main");

    }

    public static void PrintLastName (){

        System.out.println("My last name is Yilmaz"); // code block

    }
}
