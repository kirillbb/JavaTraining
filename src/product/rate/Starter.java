package product.rate;

public class Starter {
    public static void main(String[] args) {
        ProductRepository repository = new ProductRepository();
        InputService inputService = new InputService();
        ProductManager productManager = new ProductManager();

        inputService.fillProducts(repository);

        System.out.println("Товары с рейтингом выше 4.0:");
        for (Product product : productManager.getTopRatedProducts(repository.getAllProducts())){
            System.out.println(product);
        }

        System.out.println("Товар с лучшим рейтингом:");
        System.out.println(productManager.getBestProduct(repository.getAllProducts()));
    }
}
