package swc2333;
public class Flower {
    // Declare private attributes for the Flower class
    private String name;
    private String color;
    private double price;
    private int quantity;

    // Default constructor for the Flower class
    public Flower() {
    }

    // Constructor with parameters for the Flower class
    public Flower(String name, String color, double price, int quantity) {
        // Initialize the attributes with the given parameters
        this.name = name;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
    }

    // Accessor method to get the name attribute
    public String getName() {
        return name;
    }

    // Mutator method to set the name attribute
    public void setName(String name) {
        this.name = name;
    }

    // Accessor method to get the color attribute
    public String getColor() {
        return color;
    }

    // Mutator method to set the color attribute
    public void setColor(String color) {
        this.color = color;
    }

    // Accessor method to get the price attribute
    public double getPrice() {
        return price;
    }

    // Mutator method to set the price attribute
    public void setPrice(double price) {
        this.price = price;
    }

    // Accessor method to get the quantity attribute
    public int getQuantity() {
        return quantity;
    }

    // Mutator method to set the quantity attribute
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // toString() method to display the details of a Flower object
    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}

