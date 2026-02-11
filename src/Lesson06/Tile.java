package Lesson06;

public class Tile {
    char letter;
    int value;

    Tile(char letter, int value) {
        this.letter = letter;
        this.value = value;
    }

    char getLetter() {
        return this.letter;
    }

    int getValue() {
        return this.value;
    }

    void setValue(int value) {
        this.value = value;
    }

    void setLetter(char letter) {
        this.letter = letter;
    }

    public String toString() {
        return "The letter : " + " " + getLetter() + " "
                + "with value" + " " + getValue();
    }

    public static void printTile(Tile tile) {
        System.out.println(tile);
    }

    @Override
    public boolean equals(Object object) {
        Tile tile = (Tile)object;
        return this.letter == tile.letter && this.value == tile.value;
    }
}

