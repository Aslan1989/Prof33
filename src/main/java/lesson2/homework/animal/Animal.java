package lesson2.homework.animal;

public class Animal {
    private String nick;
    private double weight;

    public Animal(String nick, double weight) {
        this.nick = nick;
        this.weight = weight;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nick='" + nick + '\'' +
                ", weight=" + weight +
                '}';
    }
}
