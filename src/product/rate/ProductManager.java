package product.rate;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {

    public ArrayList<Product> getTopRatedProducts(ArrayList<Product> products){
        ArrayList<Product> result = new ArrayList<>();
        for (Product product : products){
            if (product.getAvgRating() >= 4.0){
                result.add(product);
            }
        }
        return result;
    }

    public Product getBestProduct(ArrayList<Product> products){
        Product best = products.get(0);
        for (Product product : products){
            if (product.getAvgRating() > best.getAvgRating()){
                best = product;
            }
        }
        return best;
    }

    /*public void productDataEntry(ProductRepository repository) {
        Scanner scanner = new Scanner((System.in));
        ArrayList<Product> products = repository.getAllProducts();

        while (true) {
            System.out.println("Введите название товара (или 'стоп' для завершения): ");
            String input = scanner.nextLine();

            if (isStop(input))
                break;

            Product product = new Product();
            product.setName(input);

            System.out.println("Введите цену: ");
            product.setPrice(scanner.nextDouble());
            scanner.nextLine();

            System.out.println("Введите рейтинги: ");
            product.setRatingList(convertToRatingList(scanner.nextLine()));

            repository.createProduct(product);
        }
    }

    public ArrayList<Integer> convertToRatingList(String input) {
        String[] parts = input.split(" ");
        ArrayList<Integer> ratingList = new ArrayList<>();

        for (String part : parts) {
            ratingList.add(Integer.parseInt(part));
        }

        return ratingList;
    }

    public void printProducts(ProductRepository repository) {
        System.out.println("Список товаров:\n");
        int count = 1;
        for (Product product : repository.getAllProducts()) {
            System.out.println(count++ + ". " + product.toString());
        }
    }

    public void printTopRatedProducts(ProductRepository repository) {
        if (repository.getAllProducts().isEmpty())
            return;

        System.out.println("Товары с рейтингом выше 4.0:\n");
        for (Product product : repository.getAllProducts()) {
            if (product.getAvgRating() >= 4)
                System.out.println(product.getName() + " - " + String.format("%.2f", product.getAvgRating()));
        }
    }

    public void printBestProduct(ProductRepository repository) {
        if (repository.getAllProducts().isEmpty())
            return;

        System.out.println("Товар с лучшим рейтингом: ");

        Product topRatedProduct = repository.getAllProducts().getFirst();
        for (Product product : repository.getAllProducts()) {
            if (product.getAvgRating() > topRatedProduct.getAvgRating())
                topRatedProduct = product;
        }

        System.out.println(topRatedProduct.getName() + " - " + String.format("%.2f", topRatedProduct.getAvgRating()));
    }

    public static boolean isStop(String string) {
        return string.equalsIgnoreCase("stop");
    }*/
}
