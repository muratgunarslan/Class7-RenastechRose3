package Day23_MethodsOverloadWrapperRecap;

import java.util.ArrayList;

public class Topic6_WrapperExample {
    public static void main(String[] args) {
        double d1 = 85.66;
        System.out.println(d1);

        Double wrapped_d1 = d1;
        // Double wrapped_d1 = new Double(d1);

        PrintParameter(wrapped_d1.toString());



    }


    public static void PrintParameter (String param1){
        System.out.println(param1);
    }
    public static int ReturnIntValue (double param1){
        Double wrapped_param1 = param1;
        int a = wrapped_param1.intValue();
        return a;
    }
}
