package loops;

public class CartItem {
    String name;
    double price;
    int quantity;

    public double getTotalPrice() {
        return price * quantity;
    }
}
