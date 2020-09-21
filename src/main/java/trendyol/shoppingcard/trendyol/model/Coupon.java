package trendyol.shoppingcard.trendyol.model;

public class Coupon extends AbstractDiscount{

    protected double minimumAmount;

    public double getMinimumAmount() {
        return minimumAmount;
    }

    public Coupon setMinimumAmount(double minimumAmount) {
        this.minimumAmount = minimumAmount;
        return this;
    }
}
