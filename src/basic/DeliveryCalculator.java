package basic;

import java.util.Scanner;

public class DeliveryCalculator {
    public static void main(String[] args) {
        Delivery delivery = createDelivery();
        System.out.println(delivery);
    }

    public static Delivery createDelivery() {
        Scanner scanner = new Scanner(System.in);
        Delivery delivery = new Delivery();

        System.out.println("City: ");
        delivery.city = scanner.nextLine();
        System.out.println("Order Amount: ");
        delivery.orderAmount = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Delivery type: ");
        delivery.deliveryType = scanner.nextLine();
        System.out.println("Payment type: ");
        delivery.paymentType = scanner.nextLine();

        return delivery;
    }
}
