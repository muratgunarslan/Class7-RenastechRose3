package Day20_Methods;

public class Topic1_ForEachLoop {
    public static void main(String[] args) {

        // Write a code where user is given an array of Strings that contains given animal's name
        // find which one of those animals has "0" in the name

        String [] Animals = {"Cat", "Dog", "Monkey", "Rabbit"};

        for (String animal:Animals){ // animal = "Cat" // first iteration
                                    // animal = "Dog" // second iteration
                                    // animal = "Monkey" // third iteration
                                    // animal = "Rabbit" // fourth iteration

            if (animal.contains("0") || animal.contains("o")){

                System.out.println("The animal "+animal+" has 0 or o in the name");
            }

        }
    }
}
