package product.rate;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class Product {
    private String name;
    private double price;
    private ArrayList<Integer> ratingList;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" - ")
                .append(String.format("%.2f", price)).append("$ - средняя оценка: ")
                .append(String.format("%.2f", getAvgRating()));

        return sb.toString();
    }

    public double getAvgRating() {
        double total = 0;

        if (ratingList.isEmpty())
            return 0;

        for (Integer rating : ratingList) {
            total += rating;
        }

        return total / ratingList.size();
    }
}
