import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("How many players are in this Easter egg hunt? Enter a positive whole number:?");

    int count;
    int userNum;
    Random r = new Random();

    userNum = s.nextInt();

    int arrayPlayer[] = new int[userNum];
    double min = Double.MAX_VALUE;
    double max = Double.MIN_VALUE;

    for (int i = 0; i < arrayPlayer.length; i++) {
      arrayPlayer[i] = 0;
      arrayPlayer[i] = new Random().nextInt(10);
    }
      for (int i = 0; i < arrayPlayer.length; i++) {
        if (arrayPlayer[i] < min)
          min = arrayPlayer[i];
        if (arrayPlayer[i] > max)
          max = arrayPlayer[i];
        System.out.println(arrayPlayer[0]);
      }
    

    System.out.println("We have added " + userNum + " players to this hunt. Let’s find some eggs!");

  }
}

/*
 * Egg egg1 = new Egg(); System.out.println(egg1.eggColor);
 * System.out.println(egg1.eggContents);
 */

// System.out.println(Player.getBasket);