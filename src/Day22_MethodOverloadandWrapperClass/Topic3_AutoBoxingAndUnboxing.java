package Day22_MethodOverloadandWrapperClass;

public class Topic3_AutoBoxingAndUnboxing {

    public static void main(String[] args) {

        Integer i = new Integer(10);
        // unboxing the object
        int i1 = i;
        System.out.println("unboxing the object : " +i1);

        System.out.println("---------");

        // boxing the object
        int i2 = 5;
        Integer i3 = 12;
        System.out.println("unboxing the object : " +i3);

    }
}
