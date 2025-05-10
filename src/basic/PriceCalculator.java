package basic;

import java.util.Scanner;

public class PriceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите название товара: ");
        String name = scanner.nextLine();
        System.out.println("Введите цену: ");
        double price = scanner.nextDouble();
        System.out.println("Введите скидку (%): ");
        int discount = scanner.nextInt();
        System.out.println("Введите НДС (%): ");
        int vat = scanner.nextInt();

        Product product = new Product(name, price, discount, vat);

        System.out.println(product);
    }
}
