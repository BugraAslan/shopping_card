package trendyol.shoppingcard.trendyol.model;

public class Campaign extends AbstractDiscount {

    protected Category category;

    public Category getCategory() {
        return category;
    }

    public Campaign setCategory(Category category) {
        this.category = category;
        return this;
    }
}
