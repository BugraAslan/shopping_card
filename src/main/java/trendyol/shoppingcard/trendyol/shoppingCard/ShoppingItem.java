package trendyol.shoppingcard.trendyol.shoppingCard;

import trendyol.shoppingcard.trendyol.model.Product;

public class ShoppingItem {

    protected Product product;

    protected int quantity;

    protected double discount = 0;

    public ShoppingItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public ShoppingItem setProduct(Product product) {
        this.product = product;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public ShoppingItem setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public double getDiscount() {
        return discount;
    }

    public ShoppingItem setDiscount(double discount) {
        this.discount = discount;
        return this;
    }
}
