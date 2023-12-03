package lesson2.homework.animal;

public class Dog extends Animal {

    public boolean inUnkind;



    public Dog(String nick, double weight, boolean inUnkind) {
        super(nick, weight);
        this.inUnkind = inUnkind;
    }

    public String bark()
    {
        return "gav gav gav";
    }
}
