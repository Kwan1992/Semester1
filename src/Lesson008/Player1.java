package Lesson008;

import java.util.Scanner;

public class Player1  {

    //  Reading user input
    // Returning the player's guess

    int readInUserNumber () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your guess between number 1-100 ");
        int userNumber = scanner.nextInt();
        return userNumber;

    }

}

