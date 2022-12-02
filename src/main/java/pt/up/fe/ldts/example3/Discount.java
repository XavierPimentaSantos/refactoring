package pt.up.fe.ldts.example3;

public abstract class Discount {
    private double discount;

    public Discount(double discount) {
        this.discount = discount;
    }

    public abstract double applyDiscount(double price);

    public double getDiscount(){
        return discount;
    }
}
