package Lesson10;

public class Furniture {

    private String name;
    private double price;
    private String material;

    // Constructor
    public Furniture (String name, double price,String material) {
        this.name = name;
        this.price = price;
        this.material = material;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getMaterial() {
        return material;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setMaterial(String material) {
        this.material = material;
    }


    @Override
    public String toString() {
        return "Product: " + getName() + getPrice() + getMaterial(); }
}
