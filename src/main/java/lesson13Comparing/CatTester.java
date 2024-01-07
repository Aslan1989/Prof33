package lesson13Comparing;

import lesson13Comparing.comparable.Cat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CatTester {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>(
                Arrays.asList(
                        new Cat(Cat.Breed.BURMESE, 12,"Max"),
                        new Cat(Cat.Breed.BURMESE, 5,"Tikhon"),
                        new Cat(Cat.Breed.SIAMESE, 9,"Pushok"),
                        new Cat(Cat.Breed.SIBERIAN, 3,"Small"),
                        new Cat(Cat.Breed.ANGORA, 5,"Bird"),
                        new Cat(Cat.Breed.SPHINX, 11,"Ball")
                )
        );

        cats.sort(
                Cat.ageComparator
        );
        System.out.println("Sort of Age: " +
              cats
        );
        cats.sort(
                Cat.nickComparator
        );
        System.out.println("Sort of Nick: " +
                cats
        );
        cats.sort(
                Cat.breedComparator
        );
        System.out.println("Sort of Breed: " +
                cats
        );
    }
}
