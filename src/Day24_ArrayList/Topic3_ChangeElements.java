package Day24_ArrayList;

import java.util.ArrayList;

public class Topic3_ChangeElements {
    public static void main(String[] args) {

        ArrayList<String> RandomWords = new ArrayList<>(4);
        RandomWords.add("mud");
        RandomWords.add("rice");
        RandomWords.add("elastic");
        RandomWords.add("youth");
        RandomWords.add("cupboard");

        System.out.println(RandomWords);
        /*
        To change elements of the ArrayList, we use set method of the ArrayList class.
        For example;
         */

        RandomWords.set(1, "noddle");
        System.out.println(RandomWords);

        /*
        Here, the set() method changes them element at index 1 to noddle.
        ("rice" => "noddle")
         */

        int IndexOfElastic = RandomWords.indexOf("elastic");
        int IndexOfHayri = RandomWords.indexOf("elastic");
        if (IndexOfHayri > -1){
            System.out.println("We have Hayri in the ArrayList");
        }else {
            System.out.println("We dont have Hayri in the ArrayList");
        }

        boolean DoWeHaveBulgurInArrayList = RandomWords.contains("bulgur");
        System.out.println(DoWeHaveBulgurInArrayList);

        System.out.println("------------");
        RandomWords.set(RandomWords.indexOf("elastic"), "chocolate");
        System.out.println("Modified Array List : "+RandomWords);

    }
}
