package Day11_ForLoopCont;

public class StudyHall_StringMethods {
    public static void main(String[] args) {

        String name1 = "Murat";
        String name2 = "murat";

        boolean names = name1.equals(name2);
        System.out.println(names);

        if (names == true){
            System.out.println("They are identical");
        }else {
            System.out.println("They are not identical");
        }




    }//main
}//class
