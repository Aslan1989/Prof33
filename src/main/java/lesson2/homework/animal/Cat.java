package lesson2.homework.animal;

public class Cat extends Animal{
    private boolean isLazy;

    public Cat(String nick, double weight, boolean isLazy) {
        super(nick, weight);
        this.isLazy = isLazy;
    }

    public String meow()
    {
        return "Meow prrr";
    }
}
