package product.rate;

import java.util.ArrayList;
import java.util.Scanner;

public class InputService {
    private final Scanner scanner = new Scanner(System.in);

    public void fillProducts(ProductRepository repository) {
        while (true) {
            System.out.println("Введите название товара (или 'стоп'):");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("стоп")) break;

            System.out.println("Введите цену:");
            double price = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Введите рейтинги (через пробел):");
            ArrayList<Integer> ratings = convertToRatingList(scanner.nextLine());

            Product product = new Product();
            product.setName(name);
            product.setPrice(price);
            product.setRatingList(ratings);
            repository.getAllProducts().add(product);
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
}
