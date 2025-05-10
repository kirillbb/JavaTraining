package product.rate;

import java.util.ArrayList;

public class ProductManager {

    public ArrayList<Product> getTopRatedProducts(ArrayList<Product> products) {
        if (products.isEmpty()) new ArrayList<>();

        ArrayList<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (product.getAvgRating() >= 4.0) {
                result.add(product);
            }
        }
        return result;
    }

    public Product getBestProduct(ArrayList<Product> products) {
        if (products.isEmpty()) return null;

        Product best = products.get(0);
        for (Product product : products) {
            if (product.getAvgRating() > best.getAvgRating()) {
                best = product;
            }
        }
        return best;
    }
}
