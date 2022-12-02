package pt.up.fe.ldts.example3;

public class PercentageDiscount extends Discount{
    public PercentageDiscount(double percentage){
        super(percentage);
    }

    public double applyDiscount(double price){
        return (1 - getDiscount()) * price;
    }
}
