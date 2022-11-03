package Day19_MultiDimensionArrays;

public class Topic2_MultiDimensionArrays {
    public static void main(String[] args) {

        String [][] names = {{"Ziya", "Seda"}, {"Sena", "Anil", "Hakan"}, {"Ferah", "Onder", "Fahrettin", "Amer"}};
        // Index                names [0]           names[1]           names[2]

        // String [] regular = names [0] == {"Ziya" , "Seda"}

        // regular[1] == "Seda" === > names [0][1] ==> "Seda"

        String [] regular = names[0];
        System.out.println("The value in index 1 is : "+regular[1]);
        System.out.println("The value in index 1 is : "+names[0][1]);

        // Getting the length (Size) of multidimensional arrays

        int namesLen = names.length;
        System.out.println("The length of names array : "+namesLen);
        System.out.println("The length of names array : "+names.length);

        // names[0], names[1], names[2] ==> names[index].length == to find inner array's length

        System.out.println("The length of names [0] array is : "+names[0].length);
        System.out.println("The length of names [1] array is : "+names[1].length);
        System.out.println("The length of names [2] array is : "+names[2].length);

        int [][] nums = {{1,2,3,4,5,6}, {9,8,7,}};
        System.out.println("The length of nums array is : "+nums.length);
        System.out.println("The length of nums[0] array is : "+nums[0].length);


    }
}
