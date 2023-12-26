package lesson10HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lesson10 {
    public static void main(String[] args) {
        Set<Points> pointsSet = new HashSet<>();
        Points p1 = new Points(10,20);
        pointsSet.add(p1);
        System.out.println(pointsSet.size());

        Points p2 = new Points(10,20);
        pointsSet.add(p2);
        System.out.println(pointsSet.size());
        System.out.println(
                p1.equals(p2)
        );



        Point1 pp1 = new Point1(10,20);
        Point1 pp2 = new Point1(10,20);
        System.out.println(
                pp1.equals(pp2)
        );

        Set<Point1> pPoints = new HashSet<>();
        pPoints.add(pp1);
        pPoints.add(pp2);
        System.out.println(pPoints.size());

        Set<Player> players = new HashSet<>();
        Player player1 = new Player(1,"Alex");
        Player player2 = new Player(1,"Dime");
        Player player3 = new Player(2,"Anna");
        players.add(player1);
        players.add(player2);
        players.add(player3);
        System.out.println(players.size());
        System.out.println(players);

        for (Player player : players) System.out.println("from iterator: " + player);

        ArrayList<Player> playerArrayList = new ArrayList<>(players);
        System.out.println(playerArrayList);

        players.add(new Player(15,"Alexander"));
        players.add(new Player(10,"Natalia"));
        players.add(new Player(101,"Alexander"));
        System.out.println();
        System.out.println(players);

        Iterator<Player> playerIterator = players.iterator();
        while (playerIterator.hasNext())
        {
            Player p = playerIterator.next();
            if (p.getName().equals("Alexander"))
                playerIterator.remove();
        }
        System.out.println(players);
    }
}
