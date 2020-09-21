package trendyol.shoppingcard.trendyol.model;

public abstract class AbstractDiscount {

    protected double discountAmount;

    public double getDiscountAmount() {
        return discountAmount;
    }

    public AbstractDiscount setDiscountAmount(double discountAmount) {
        this.discountAmount = discountAmount;
        return this;
    }
}
