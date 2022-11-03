package Day18_ArraysUtil;

import java.util.Arrays;

public class Topic1_Split {
    public static void main(String[] args) {

        // Split () meyhod in Arrays Util, it creates a string Array based on the given
        // string expression

        String names = "Ziya Hakan Nilufer Sena";
        System.out.println("The string name is : " +names);
        System.out.println("**************************************");
        String [] nm = names.split(" ");
        System.out.println("nm contains : "+ Arrays.toString(nm));
        System.out.println("**************************************");
        System.out.println("The length of nm array is : "+nm.length);
        System.out.println("**************************************");
        System.out.println("the first element is : "+nm[1]);

        System.out.println("**************************************");

        String nums = "1234512678912";
        String [] numbers = nums.split("1");
        System.out.println("The numbers arrays is ; "+Arrays.toString(numbers));

        System.out.println("**************************************");

        String var = "ThisisjustaString";
        String [] var1 = var.split("");
        System.out.println("The var1 values ; "+Arrays.toString(var1));

        System.out.println("**************************************");

        String forbid = "Thisisjust a TEST";
        String [] tst = forbid.split(""); // you can NOT use (*,?,+) IN THE split
        System.out.println(Arrays.toString(tst));

        System.out.println("**************************************");

        String var2 = "THISISATESTFORALI";
        String [] test = var2.split("",4);
        System.out.println("The test array is ; "+Arrays.toString(test));

        System.out.println("**************************************");

        String var3 = "This is just a test but I want to try again";
        String [] test1 = var3.split(" ", 20);
        System.out.println("The test1 values ; "+Arrays.toString(test1));



    }
}
