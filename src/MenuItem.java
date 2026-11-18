public class MenuItem {
    private String code;
    private String name;
    private double price;
    private boolean available;

    //constructor
    public MenuItem(String _name, double _price, boolean _available) {
        // assign value to our instance variables
        this.name = _name;
        this.price = price;
        this.available = _available;

    }
    // get code
    public String getCode() {
        return code;
    }

    // get name
    public String getName() {
        return this.name;
    }

    // get Price
    public double getPrice() {
        return this.price;
    }

    // get available
    public boolean getAvailable() {
        return this.available;

    }


    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", available=" + available +
                '}';
    }
}

