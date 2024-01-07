package lesson13Comparing.comparable;

public class Player  implements Comparable<Player>{
    private int rating;
    private String name;
    private int age;

    public Player(int rating, String name, int age) {
        this.rating = rating;
        this.name = name;
        this.age = age;
    }

    public int getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override // переопределяем из интерфейса из которого она наследовалась
    public int compareTo(Player o) {
        return 0;
    }

}
