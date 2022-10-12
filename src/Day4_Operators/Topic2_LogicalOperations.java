package Day4_Operators;

public class Topic2_LogicalOperations {
    public static void main(String[] args) {

        // AND ===> "&&" In order for the operation to result true all the operation should be true
        //

        boolean checklogic = true&&true;
        System.out.println("the logic is ; "+checklogic);

        boolean logic1 = (78==90)&&(876 !=8907)&&(98>23); //False && True && True
        System.out.println("the logic1 ; "+logic1);

        boolean logic2 = false&&false&false;
        System.out.println("the logic2 : "+logic2);

        //OR ==> "||" in order for have a true logical operation , it is enough to have only 1 true

        boolean logic3 = false||false||false||true;
        System.out.println("the logic3 ; "+logic3);

        boolean logic4 = !(!(90==90)||(90!=80)||(79>90)); // !(false||true||false) == !(true)
        System.out.println("the result is logic4 : "+logic4);

        boolean logic5 = ((89==89)&&(45>=23)||((67<=90)&&(true))); // (true)||(true)
        System.out.println("logic5 : "+logic5);

    }
}
