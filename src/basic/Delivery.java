package basic;

public class Delivery {
    String city;
    double orderAmount;
    String deliveryType;
    String paymentType;

    @Override
    public String toString() {
        return "Город: " + city + "\n" +
                "Сумма заказа: " + orderAmount + "грн" + "\n" +
                "Доставка: " + deliveryType + "\n" +
                "Оплата: " + paymentType + "\n" +
                "Стоимость доставки: " + getDeliveryCost() + "грн" + "\n" +
                "Комиссия за оплату: " + getPaymentFee() + "грн" + "\n" +
                "Итого к оплате: " + getFinalOrderCoast() + "грн";
    }

    public double getDeliveryCost() {
        if (deliveryType.equalsIgnoreCase("pickup"))
            return 0;
        if (isBigCity() && orderAmount >= 1000)
            return 0;
        return 100;
    }

    private boolean isBigCity() {
        return (this.city.equalsIgnoreCase("Kyiv")
                || this.city.equalsIgnoreCase("Lviv")
                || this.city.equalsIgnoreCase("Odesa"));
    }

    private boolean isOnlinePayment() {
        return (this.paymentType.equalsIgnoreCase("online"));
    }

    private int getPaymentFee() {
        return isOnlinePayment() ? 0 : 20;
    }

    public double getFinalOrderCoast() {
        return orderAmount + getDeliveryCost() + getPaymentFee();
    }
}
