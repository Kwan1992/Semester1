package Lesson06;

public class TileTest {
    public static void main(String[] args) {

        Tile game1 = new Tile('z', 10);
        Tile game2 =new Tile('z', 10);

        System.out.println(game1.toString());
        System.out.println(game2.toString());

        if (game1.equals(game2)){
            System.out.println("They are equals");
        } else {
            System.out.println("They are not equals");
        }



    }
}
