package Lesson04;
        // Update the test class so it creates at least three different triangles
public class TriangleTest {
    public static void main (String [] args){
        Triangle t1 = new Triangle(6, 12, 10);
        t1.showInfo();

        System.out.println();

        Triangle t2 = new Triangle (6,8,10);
        t2.showInfo();

        System.out.println();

        Triangle t3 = new Triangle (6,6,8);
        t3.showInfo();

        int numberOfSides = Triangle.numberOfSides();
    }
}
