package trendyol.shoppingcard.trendyol.model;

public class Delivery {

    protected double costPerProduct;

    protected double costPerDelivery;

    protected double defaultCost = 9.99;

    public double getCostPerProduct() {
        return costPerProduct;
    }

    public Delivery setCostPerProduct(double costPerProduct) {
        this.costPerProduct = costPerProduct;
        return this;
    }

    public double getCostPerDelivery() {
        return costPerDelivery;
    }

    public Delivery setCostPerDelivery(double costPerDelivery) {
        this.costPerDelivery = costPerDelivery;
        return this;
    }

    public double getDefaultCost() {
        return defaultCost;
    }

    public Delivery setDefaultCost(double defaultCost) {
        this.defaultCost = defaultCost;
        return this;
    }
}
