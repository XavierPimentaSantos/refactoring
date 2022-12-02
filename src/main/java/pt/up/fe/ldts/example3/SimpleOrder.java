package pt.up.fe.ldts.example3;

public class SimpleOrder {
    private Discount discount;
    private double price;

    public SimpleOrder(double price) {
        this.price = price;
        discount = new NoDiscount();
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public double getTotal() {
        if (discount == null) {
            discount = new NoDiscount();
            return discount.applyDiscount(price);
        }
        else{
            return discount.applyDiscount(price);
        }
    }
}
