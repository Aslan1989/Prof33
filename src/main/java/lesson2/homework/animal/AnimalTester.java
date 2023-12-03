package lesson2.homework.animal;

import lesson2.homework.Date;

public class AnimalTester {
    public static void main(String[] args) {
        Dog dog = new Dog("Barbos",40,true);
        dog.bark();

        System.out.println(dog.bark());

        Cat cat = new Cat("Murzik", 5, true);
        System.out.println(cat.meow());

        Animal animal = new Animal("Butch",50);
        System.out.println(animal);
    }
}
