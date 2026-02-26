package Lesson11;
import java.util.Scanner;

public class ItemTest {

    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);

        int count = askForCount(sc);

        Item[] itemArray = createItemArray(sc, count);

        printItem(itemArray);

        sortByTitle(itemArray);

        System.out.println("\n--- Sorted by Title ---");
        printItem(itemArray);

        sc.close();
    }

    // Ask user for number of items
    public static int askForCount(Scanner sc) {

        int count = 0;

        while (true) {
            System.out.print("How many items do you want to borrow? ");

            if (sc.hasNextInt()) {
                count = sc.nextInt();
                sc.nextLine();

                if (count > 0) break;
                else System.out.println("Enter a positive number!");
            } else {
                System.out.println("Invalid number!");
                sc.nextLine();
            }
        }

        return count;
    }

    // Create item objects
    public static Item[] createItemArray(Scanner sc, int count) {

        Item[] arr = new Item[count]; //(polymorphism!)

        for (int i = 0; i < count; i++) {

            System.out.println("\nType (type either 'book', 'video' or 'electronics') ");
            String type = sc.nextLine();

            if (type.equalsIgnoreCase("book")) {

                System.out.print("Title: ");
                String title = sc.nextLine();

                System.out.println("Author: ");
                String author = sc.nextLine();

                int loanDays;
            while (true) {
                System.out.print("Loan days: ");
                 loanDays= sc.nextInt();
                if (loanDays <0){
                    System.out.println("invalid number");
                } else {
                    break;
                }
            }
                sc.nextLine();

                arr[i] = new Book(title, loanDays, author);

            } else if (type.equalsIgnoreCase("video")) {

                System.out.print("Title: ");
                String title = sc.nextLine();

                int durationTime;
                while(true) {
                    System.out.println("Duration time: ");
                    durationTime = sc.nextInt();
                    if (durationTime < 0) {
                        System.out.println("Invalid Duration time. Try again!!");
                    } else {
                        break;
                    }
                }
                sc.nextLine();

                int loanDays;
                while (true) {
                    System.out.print("Loan days: ");
                    loanDays= sc.nextInt();
                    if (loanDays <0){
                        System.out.println("invalid number");
                    } else {
                        break;
                    }
                }
                sc.nextLine();

                arr[i] = new Video(title, loanDays, durationTime);

            } else if (type.equalsIgnoreCase("electronics")) {

                System.out.print("Title: ");
                String title = sc.nextLine();
                int baseValue;
                while(true) {
                    System.out.println("Base value: ");
                    baseValue = sc.nextInt();
                    if (baseValue < 0) {
                        System.out.println("Invalid base value. Try again!!");
                    } else {
                        break;
                    }
                }
                sc.nextLine();

                int loanDays;
                while (true) {
                    System.out.print("Loan days: ");
                    loanDays= sc.nextInt();
                    if (loanDays <0){
                        System.out.println("invalid number. Try again!");
                    } else {
                        break;
                    }
                }
                sc.nextLine();


                arr[i] = new Electronics(title, loanDays);

            } else {
                System.out.println("Unknown type. Try again.");
                i--;  // redo this iteration
            }
        }

        return arr;
    }

    // Print array
    public static void printItem(Item[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    // Manual bubble sort by title
    public static void sortByTitle(Item[] array) {

        for (int i = 0; i < array.length - 1; i++) {

            for (int j = 0; j < array.length - 1 - i; j++) {

                if (array[j].getTitle()
                        .compareTo(array[j + 1].getTitle()) > 0) {

                    // Swap object
                    Item temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}