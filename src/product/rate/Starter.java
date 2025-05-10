package product.rate;

import java.util.ArrayList;

public class Starter {
    public static void main(String[] args) {
        ProductRepository repository = new ProductRepository();
        InputService inputService = new InputService();
        ProductManager productManager = new ProductManager();

        inputService.fillProducts(repository);
        ArrayList<Product> products = repository.getAllProducts();

        if (products != null) {
            printProducts(products);

            System.out.println("Товары с рейтингом выше 4.0:");
            for (Product product : productManager.getTopRatedProducts(products)) {
                System.out.println(product);
            }
            System.out.println("Товар с лучшим рейтингом:");
            System.out.println(productManager.getBestProduct(products));
        } else {
            System.out.println("Список продуктов пуст :(");
        }
    }

    public static void printProducts(ArrayList<Product> products) {
        System.out.println("Список товаров:\n");
        int count = 1;
        for (Product product : products) {
            System.out.println(count++ + ". " + product.toString());
        }
    }
}
