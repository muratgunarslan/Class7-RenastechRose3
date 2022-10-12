package Day7_SwitchStatements;

public class Topic1_IfElseExample {
    public static void main(String[] args) {

        // write a code where students are placed in the classes based on individuals preference and knowledge
        // Our school allows student to have only one preference

        String FirstName = "Eloise";
        String Pre = "QA";
        int level =3;

        if (Pre == "QA"){
            if (level ==1){
                System.out.println(FirstName+ " is places in beginner Level Class for QA");
            } else if (level ==2) {
                System.out.println(FirstName+ " is placed in Mid Level Class for QA");

            }else {
                System.out.println(FirstName+ " is placed in Advance Level Class for QA");
            }

        } else if (Pre == "SE") {
            if (level == 1){
                System.out.println(FirstName+ " is places in beginner Level Class for SE");

            }else if (level ==2){
                System.out.println(FirstName+ " is placed in Mid Level Class for SE");
            }else {
                System.out.println(FirstName+ " is placed in Advance Level Class for QA");
            }

        }else {
            if (level ==1){
                System.out.println(FirstName+ " is places in beginner Level Class for DA");
            } else if (level ==2) {
                System.out.println(FirstName+ " is places in Mid  Level Class for DA");
            }else {
                System.out.println(FirstName+ " is places in advance  Level Class for DA");
            }


        }

    }
}