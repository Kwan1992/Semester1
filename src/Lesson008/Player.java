package Lesson008;

import java.util.Scanner;

public class Player {

   //  Reading user input
 int readInUserNumber () {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter your guess between number 1-10 ");
       int playerGuessNum = scanner.nextInt();
       return playerGuessNum;
   }
    // Returning the player's guess
}
