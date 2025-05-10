package product.rate;

public class Starter {
    public static void main(String args[]) {
        ProductRepository repository = new ProductRepository();
        ProductManager manager = new ProductManager();

        manager.productDataEntry(repository);

        manager.printProducts(repository);
        manager.printTopRatedProducts(repository);
        manager.printBestProduct(repository);
    }
}
