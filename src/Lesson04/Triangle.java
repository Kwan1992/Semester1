package Lesson04;

public class Triangle {
    //attributes
    double sideA;
    double sideB;
    double sideC;

    // Constructor
        public Triangle (double a, double b, double c) {
            this.sideA = a;
            this.sideB = b;
            this.sideC = c;
        }

        static int numberOfSides(){
            return 3;
        }

    // method: calculate perimeter of the right Angle Triangle
        public double getPerimeter(){
            return sideA + sideB + sideC;
        }
    // method: calculate area (areal) using Heron's formula
        public double getArea (){
            double s = getPerimeter()/2;
            return Math.sqrt (s*(s-sideA)*(s-sideB)*(s-sideC)) ;
        }
    // method: show info
        public void showInfo () {
            System.out.println ("Triangle : sideA = " + sideA+
                    ", sideB = " + sideB +
                    ", sideC = " + sideC);
            System.out.println ("Perimeter  = " + getPerimeter());
            System.out.println ("Area = " + getPerimeter()/2);

    }
}

