package lesson4.blackjack;

import java.util.Scanner;

public class Casino {
    public static void main(String[] args) {
        Dealer dealer = new Dealer();
        Scanner scanner = new Scanner(System.in);
        int score = 0; // наш счет
        do {
            Card card = dealer.getCard();
            score += card.getScore();
            System.out.println("Card: "+ card);
            System.out.println(" Count: "+score);
            System.out.println("Type N for game over");
        } while (!scanner.next().equals("N"));
    }
}
