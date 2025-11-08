public class Item {
    private String name;
    private double price;

    // Costruttore
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }
}