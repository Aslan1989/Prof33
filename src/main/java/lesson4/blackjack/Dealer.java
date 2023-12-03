package lesson4.blackjack;

import java.util.Random;

public class Dealer {

    private Random r = new Random();

    public Card getCard()
    {
        int rank = r.nextInt(13); // случайное число от 0 до 12
        int suit = r.nextInt(4);

        return new Card(
                Rank.values()[rank],
                Suite.values()[suit]
        );
    }
}
