package Day23_MethodsOverloadWrapperRecap;

import java.util.ArrayList;

public class Topic5_Wrapper_FerreroRocher {
    public static void main(String[] args) {

        int chocolate = 5;

        Integer WrappedChocolate = new Integer(chocolate);

        ArrayList<Integer> mybox= new ArrayList<Integer>();

        mybox.add(WrappedChocolate); // it will give error in version 2

        int unwrappedChocolate = WrappedChocolate.intValue();


    }
}
