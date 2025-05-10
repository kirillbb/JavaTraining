package basic;

class Product {
    String name;
    double basePrice;
    int discount;
    int vat;

    public Product(String name, double basePrice, int discount, int vat) {
        this.name = name;
        this.basePrice = basePrice;
        this.discount = discount;
        this.vat = vat;
    }

    @Override
    public String toString() {
        return "Товар: " + name + "\n" +
                "Базовая цена: " + basePrice + " грн\n" +
                "Цена после скидки: " + getDiscountPrice() + " грн\n" +
                "Финальная цена с НДС: " + getFinalPrice() + " грн";
    }

    public double getDiscountPrice() {
        return basePrice - calculatePercentage(basePrice, discount);
    }

    public double getFinalPrice() {
        return getDiscountPrice() + calculatePercentage(getDiscountPrice(), vat);
    }

    private double calculatePercentage(double value, int percent) {
        return value * percent / 100;
    }
}
