public class RegularCustomer extends Customer implements Discountable{
    public RegularCustomer(String name) {
        super(name);
    }

    @Override
    public double applyDiscount(double price) {
        return price; // no discount
    }
}
