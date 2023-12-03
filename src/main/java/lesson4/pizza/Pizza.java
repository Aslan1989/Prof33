package lesson4.pizza;

public class Pizza {
    // должен быть размер - маленькая, средняя, большая
    // топпинги - пеперони, ветчина, сыр, грибы
    enum PizzaSize {
        SMALL,MEDIUM,LARGE
    }

    private PizzaSize size;
    private int peperoni;
    private int ham;
    private int cheese;
    private int mushrooms;

    public int calcPrice()
    {
        int price = 0;
        if (size == PizzaSize.SMALL){
            price +=10;
        } else if (size == PizzaSize.MEDIUM) {
            price += 12;
        }else
            price +=14;
        price += (peperoni+ ham+ cheese+ mushrooms)*2;
        return price;
    }

    public Pizza(PizzaSize size, int peperoni, int ham, int cheese, int mushrooms) {
        this.size = size;
        this.peperoni = peperoni;
        this.ham = ham;
        this.cheese = cheese;
        this.mushrooms = mushrooms;
    }

    public PizzaSize getSize() {
        return size;
    }

    public void setSize(PizzaSize size) {
        this.size = size;
    }

    public int getPeperoni() {
        return peperoni;
    }

    public void setPeperoni(int peperoni) {
        this.peperoni = peperoni;
    }

    public int getHam() {
        return ham;
    }

    public void setHam(int ham) {
        this.ham = ham;
    }

    public int getCheese() {
        return cheese;
    }

    public void setCheese(int cheese) {
        this.cheese = cheese;
    }

    public int getMushrooms() {
        return mushrooms;
    }

    public void setMushrooms(int mushrooms) {
        this.mushrooms = mushrooms;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", peperoni=" + peperoni +
                ", ham=" + ham +
                ", cheese=" + cheese +
                ", mushrooms=" + mushrooms +
                '}';
    }
}
