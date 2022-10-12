package Day6_IfElseStatements;

public class Topic6_NestIfElseStatementContinue {
    public static void main(String[] args) {

        // Last Names = Doe, Yilmaz, Ekinci
        // if last name is Yilmaz and the age is over 20 print the last name and the age
        // if not just print the name
        // if last name is Doe and the age is over 10 print just the last name
        // if not print just the age
        // if it is Ekinci print last name and age

        String lastname = "Ekinci";
        int age = 10;

        if(lastname=="Yilmaz"){
            if (age>20){
                System.out.println("The last name is: "+lastname+"the age is :"+age);
            }else {
                System.out.println("Just lastname; "+lastname);
            }
        } else if (lastname == "Doe") {
            if (age>10){
                System.out.println("Just the Lastname: "+lastname);
            }else {
                System.out.println("Just the Age"+age);
            }
        }else {
            System.out.println("Lastname and age"+lastname+ "Age:"+age);
        }
    }
}
