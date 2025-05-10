package product.rate;

import java.util.ArrayList;

public class ProductRepository {
    private ArrayList<Product> products;

    public ProductRepository() {
        products = new ArrayList<>();
    }

    public ArrayList<Product> getAllProducts() {
        return products;
    }

    public void createProduct(Product product) {
        products.add(new Product());
    }
}
