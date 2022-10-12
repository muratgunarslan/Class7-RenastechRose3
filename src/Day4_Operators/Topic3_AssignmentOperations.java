package Day4_Operators;

public class Topic3_AssignmentOperations {
    public static void main(String[] args) {
        int a = 80;
        System.out.println("a value is :"+a);

        a=90;
        System.out.println("the value is : "+a);

        a = a + 40; // get a value add 40 and assign back to a:
        System.out.println("the a value is : "+a);

        a = a + 40; // get a value add 40 and assign back to a:
        System.out.println("the a value is : "+a);

        a = a + 40; // get a value add 40 and assign back to a:
        System.out.println("the a value is : "+a);

        a=50000000;
        System.out.println(a);

        // a = a+40

        a+=40; // a = a + 40;
        System.out.println("the new value of a : "+a);

        int b = 100;

        b = b-30;
        System.out.println("b value : "+b);

        b-=10;
        System.out.println("the new value : "+b);

        int theanswer = b-a;
        System.out.println("the theanswer : "+theanswer);
    }
}
