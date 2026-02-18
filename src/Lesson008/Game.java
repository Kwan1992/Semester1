package Lesson008;

import java.util.Random;

public class Game {
    private int generatedRandomNumber;

    void generateRandomNumber() {
        // Generating a random number
        Random random = new Random();
        generatedRandomNumber = random.nextInt(10) + 1;
    }
    //Checking whether the guess is correct
    // Giving feedback (too high / too low / correct)

    boolean checkWeatherGuessCorrect(int playerGuessNumber) {
        if (playerGuessNumber == generatedRandomNumber) {
            System.out.println("It's correct. You won!");
            return true;
        } else if (playerGuessNumber > generatedRandomNumber) {
            System.out.println("The correct number is lower. Try Again!");
            return false;
        } else {
            System.out.println("The correct number is higher. Try Again!");
            return false;
        }
    }
}





