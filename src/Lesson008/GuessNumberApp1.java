package Lesson008;

public class GuessNumberApp1 {

    public static void main(String[] args) {
        //Starting the program
        //Reading user input
        Player1 player = new Player1();
        Game1 game = new Game1();

        int randomNumber = game.generateRandomNumber();

        //Running the game loop
        int playerGuessNumber;
        do {
            playerGuessNumber = player.readInUserNumber();
            game.checkWetherGuessCorrect(randomNumber, playerGuessNumber);
        } while (playerGuessNumber != randomNumber);
        System.out.println( "You won");
        
    }

    // count how many times the user type number until it correct
    // It has to come from playerGuessNumber

}

