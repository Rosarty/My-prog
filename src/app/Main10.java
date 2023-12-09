package app;

import java.util.Scanner;

public class Main10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter rate:");
        double rate = scanner.nextDouble();
        System.out.println("Enter num:");
        int number = scanner.nextInt();

        Game game;
        if (number < 3) {
            game = new BasicWinning(rate);
        } else if (number <= 7) {
            game = new MiddleWinning(rate);
        } else {
            game = new MegaWinning(rate);
        }

        System.out.println("Winning : " + Rounder.roundRate(game.getWinning()));
    }
}
