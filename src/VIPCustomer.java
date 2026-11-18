public class VIPCustomer extends Customer implements Discountable {
    public VIPCustomer(String name) {
        super(name);
    }

    @Override
    public int getpriority() {
        return 1; // VIP Customer has priority of 1 (they are skipped ahead from the line)
    }

    @Override
    public double applyDiscount(double price) {
        return price * 0.90; // 10% of
    }
}

