package pl.pitera.homework;


import java.util.Random;
import java.util.Scanner;

class GuessGame {

    private int score = 0;
    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();
    private static GuessGame instance;


    private GuessGame() {

    }


    public void play() {
        while (true) {
            System.out.println("Podaj liczbę od 0 do 9");
            int input = scanner.nextInt();
            if (input == random.nextInt(10)) {
                score++;
                System.out.println("Dobrze zgaduj dalej ! (" + score + "/10)");
            }

            if (score == 10) {
                score = 0;
                break;
            }
        }
    }

    public int getScore() {
        return score;
    }

    public static GuessGame getInstance() {
        if (instance == null) {
            synchronized (GuessGame.class) {
                if (instance == null) {
                    instance = new GuessGame();
                }
            }
        }
        return instance;
    }

}
