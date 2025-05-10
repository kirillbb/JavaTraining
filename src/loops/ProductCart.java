package loops;

import java.util.Scanner;

public class ProductCart {
    public static void main(String args[]) {
        Cart cart = new Cart();
        AddItems(cart);

        System.out.println(cart.toString());
    }

    public static void AddItems(Cart cart) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите товар (или 'стоп' для завершения): ");
            String input = scanner.nextLine();

            if (isStop(input))
                break;

            CartItem item = new CartItem();
            item.name = input;

            System.out.println("Введите цену: ");
            item.price = scanner.nextDouble();

            System.out.println("Введите количество: ");
            item.quantity = scanner.nextInt();
            scanner.nextLine();

            cart.addItem(item);
        }
    }

    public static boolean isStop(String string) {
        return string.equalsIgnoreCase("stop");
    }
}
