package lesson13Comparing.comparable;

import java.util.Comparator;

public class Cat {
    public enum Breed {
        ANGORA, BURMESE, SIBERIAN, SIAMESE, SPHINX
    }

    private Breed breed;
    private int age;
    private String nick;

    public Cat(Breed breed, int age, String nick) {
        this.breed = breed;
        this.age = age;
        this.nick = nick;
    }

    public Breed getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public String getNick() {
        return nick;
    }

    public static Comparator<Cat> ageComparator = Comparator.comparingInt(Cat::getAge);
    public static Comparator<Cat> breedComparator = Comparator.comparing(Cat::getBreed);
    public static Comparator<Cat> nickComparator = Comparator.comparing(Cat::getNick);

    @Override
    public String toString() {
        return "Cat{" +
                "breed=" + breed +
                ", age=" + age +
                ", nick='" + nick + '\'' +
                '}';
    }
}
