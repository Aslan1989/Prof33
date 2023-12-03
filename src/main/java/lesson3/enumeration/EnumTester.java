package lesson3.enumeration;

import java.util.Arrays;

public class EnumTester {
    public static void main(String[] args) {
        clcFruits(Fruits.KIWI);
        System.out.println(Fruits.APPLE.ordinal());
        clcFruits(Fruits.BANANA);
        System.out.println(
                Arrays.toString(Fruits.values())
        );
    }

    //public static int DEBUG =1;

    public static void clcFruits(Fruits f)
    {
        System.out.print(f.getCalories()+" ");
        switch (f)
        {
            case KIWI -> System.out.println("Kiwi");
            case GRAPES -> System.out.println("I like Oranges");
            case APPLE -> System.out.println("Apples are good");
            case BANANA -> System.out.println("Bananas are very delicious");
            case ORANGE -> System.out.println("I like oranges");
        }
    }
}
