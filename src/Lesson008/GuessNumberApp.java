package Lesson008;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberApp {
    // Starting the program YES
    //Creating objects game and player YES
    // Running the game by using loop

    public static void main(String[] args) {
        Player player = new Player();
        Game game = new Game();
        game.generateRandomNumber();

        int playerGuessNumber;
        do {
            playerGuessNumber = player.readInUserNumber();
        } while (!game.checkWeatherGuessCorrect(playerGuessNumber));
    }
}

