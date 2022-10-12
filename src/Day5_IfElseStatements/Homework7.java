package Day5_IfElseStatements;

public class Homework7 {
    public static void main(String[] args) {

        String Murat;
        double height = 6.3;
        double weight = 209;

        if (height>5.5)
            System.out.println("Murat is eligible to join military");

        if(weight>140 && weight<250 )
            System.out.println("Murat is eligible to join military");

        else {
            System.out.println("Murat is not eligible to join military");
        }
    }
}
