import java.time.LocalDateTime;

public class Order {
    private static int nextNumber = 1;

    private int number;
    private Customer customer;
    private MenuItem item;
    private LocalDateTime placedAt;


    public Order(Customer customer, MenuItem item) {
        this.number =nextNumber;
        this.customer = customer;
        this.item = item;
        this.placedAt = LocalDateTime.now();
    }


    public Customer getCustomer() {
        return customer;
    }

    public MenuItem getItem() {
        return item;
    }

    public LocalDateTime getPlacedAt() {
        return placedAt;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Order{" +
                "number=" + number +
                ", customer=" + customer +
                ", item=" + item +
                ", placedAt=" + placedAt +
                '}';
    }
}