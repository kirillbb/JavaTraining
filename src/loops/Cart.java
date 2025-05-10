package loops;

import java.util.ArrayList;

public class Cart {
    public ArrayList<CartItem> cartItems;

    public Cart() {
        cartItems = new ArrayList<CartItem>();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Корзина:\n");
        int count = 1;
        for (CartItem item : cartItems) {
            sb.append(count++)
                    .append(". ")
                    .append(item.name)
                    .append(" — ")
                    .append(item.quantity)
                    .append(" шт. по ")
                    .append(item.price)
                    .append(" грн = ")
                    .append(item.getTotalPrice())
                    .append(" грн\n");
        }
        sb.append("Итого: ").append(getTotalPrice()).append(" грн");
        return sb.toString();

    }

    public void addItem(CartItem item) {
        cartItems.add(item);
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (CartItem item : cartItems) {
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
