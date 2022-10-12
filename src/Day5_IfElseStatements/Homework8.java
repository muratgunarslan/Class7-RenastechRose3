package Day5_IfElseStatements;

public class Homework8 {
    public static void main(String[] args) {

        String firstName = "Murat";
        String lastName = "Gunarslan";
        int credit = 755;

        if(credit<500){
            System.out.println("Murat Gunarslan has BAD Credit Score"+credit);
        }

         else if(credit>500 && credit<700){
                System.out.println("Murat Gunarslan has AVERAGE Credit Score"+credit);
        }

             else if (credit>700 && credit<750) {
                System.out.println("Murat Gunarslan has GOOD Credit Score"+credit);

    }
             else if (credit>750) {
            System.out.println( firstName + lastName +  "has GREAT Credit Score "+credit);
        }

        }
    }
