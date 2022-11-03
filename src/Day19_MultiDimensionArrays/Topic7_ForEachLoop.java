package Day19_MultiDimensionArrays;

public class Topic7_ForEachLoop {
    public static void main(String[] args) {

        String [] names = {"Ziya", "Ali", "Nureddin", "Amer"};

        for (int i = 0; i < names.length; i++) {

            System.out.println("The name is : "+names[i]);

        }

        System.out.println("-----------------------------");

        for (String name : names){
            System.out.println("The name is : "+name);
        }

    }
}
