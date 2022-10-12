package Day5_IfElseStatements;

public class Topic3_IfStatementExample {
    public static void main(String[] args) {
        int a = 29;
        int b = 39;
        int c = 49;

        if(a>b && a>c) {
            System.out.println("the highest number is " +a);
        }
        if(b>a && b>c)
        {
            System.out.println("the highest number is : "+b);
        }

        if(c>b && c>a){
            System.out.println("the highest number is : "+c);
        }

        if(a==b && b==c){
            System.out.println("all the numbers are equal");
        }
    }
}
