package Day20_Methods;

public class Topic2_ForEachLoopCont {
    public static void main(String[] args) {
        // write a code where you are given an array of String as shown below
        // to check how many character 'c' and 'C' are in the value;

        String [] animals = {"Cow", "Fish", "Horse", "Lion", "Crocodile", "Eagle"};

        for (String var:animals){
            System.out.println("The value of var variable : "+var);
            int count = 0;

            char [] letters = var.toCharArray(); // {'C', 'o' , 'w'}
                                                    // {'F', 'i', 's', 'h'}

            for (char letter:letters){
                if (letter=='c' || letter=='C'){
                    count++;
                }
            }
            System.out.println("The animal : "+var+ " has " +count+" char o in the name");
            System.out.println("-------------------------------------------------------");
        }

    }
}
