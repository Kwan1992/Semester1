package Lesson06;

public class Car {

    //attributes of car
    String brand;
    private String model;
    private int year;
    int rentalPricePerDay;
    boolean isAvailable;


        Car (String brand, String model, int year, int rentalPricePerDay, boolean isAvailable) {
            this.brand = brand;
            this.model = model;
            this.year = year;
            this.rentalPricePerDay = rentalPricePerDay;
            this.isAvailable = isAvailable;
        }
        Car (String brand, String model){
        this.brand = brand;
        this.model = model;
        this.year = 0;
        this.rentalPricePerDay = 0;
        this.isAvailable = false;

        }
        // They help protect object data and rules for accessing or modifying them.
            //Getters = Methods that make field READABLE
            // SETTERS = Methods that make field WRITEABLE
        String getBrand (){
            return this.brand;
        }
        String getModel (){
            return this.model;
            }
        int getYear (){
            return this.year;
            }
        String getRentalPricePerDay (){
            return "$" + this.rentalPricePerDay;
            }
        boolean getIsAvailable () {
            return this.isAvailable;
            }

            void setIsAvailable (boolean isAvailable){
            this.isAvailable = isAvailable;
            }

            void setModel (String model){
            this.model = model;
            }
            void setYear (int year){
            this.year = year;
            }

            void setRentalPricePerDay (int rentalPricePerDay){
             this.rentalPricePerDay = rentalPricePerDay;
        }

        public String toString(){
            return  "Brand"+" "+ getBrand() + "\n" + getModel() + "\n" +
                    "Price per day" + " " + getRentalPricePerDay() + "\n" +
                    (isAvailable? "This car is available. You can rent it!": "This car is not available");
        }
    }


