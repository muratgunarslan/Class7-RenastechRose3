package Day5_IfElseStatements;

public class Homework5 {
    public static void main(String[] args) {

        double temp = 55;

        if(temp<10)
        {
            System.out.println("The Weather is So Cold");
        }

        else if (temp>10 && temp<40)
        {
            System.out.println("The Weather is Cold");
        }

        else if (temp>40 && temp<70) {
            System.out.println("The Weather is Good");

                    } else if (temp>70 && temp<90) {
            System.out.println("The Weather is Hot");

        } else if (temp>90) {
            System.out.println("The Weather is So Hot");

        }
    }
}
