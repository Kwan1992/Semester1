package Lesson06;

public class CarTest {
    static void main(String[] args) {
        //Crete a car object
        // Change the rental price
        // print details
        //set its availability

        Car car1 = new Car("Toyota", "Corolla", 2020, 250, true );
        Car car2 = new Car("Toyota", "Corolla");

                car1.setRentalPricePerDay(500);
                car1.setIsAvailable(false);

        System.out.println (car1.toString());
        System.out.println();
        System.out.println(car2.toString());

    }
}
