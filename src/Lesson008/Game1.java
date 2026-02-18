package Lesson008;

import java.util.Random;

public class Game1 {

    // Generating a random number
    int generateRandomNumber() {
        // Generating a random number
        Random random = new Random();
        int rand = random.nextInt(100) + 1;
        return rand;
    }

    //Checking whether the guess is correct
    //Giving feedback (too high / too low / correct)
    void checkWetherGuessCorrect(int randomNumber, int playerGuessNumber) {
        if (playerGuessNumber == randomNumber) {
            System.out.println("It's correct!");
        } else if (playerGuessNumber > randomNumber) {
            System.out.println("The correct number is lower. Try Again!");
        } else {
            System.out.println("The correct number is higher. Try Again!");
        }

    }
}
