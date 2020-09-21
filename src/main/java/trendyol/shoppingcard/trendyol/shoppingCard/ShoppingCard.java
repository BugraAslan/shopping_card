package trendyol.shoppingcard.trendyol.shoppingCard;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCard {

    protected List<ShoppingItem> items;

    protected double totalPrice = 0;

    public List<ShoppingItem> getItems() {
        return items;
    }

    public ShoppingCard setItems(List<ShoppingItem> items) {
        this.items = items;
        return this;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public ShoppingCard setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    public ShoppingCard addItem(ShoppingItem item){
        this.items.add(item);
        return this;
    }

    public int getItemCount(){
        int quantity = 0;
        for(ShoppingItem item: this.items) {
            quantity += item.getQuantity();
        }

        return quantity;
    }

    public double getSubTotalPrice() {
        float subTotalPrice = 0;
        for(ShoppingItem item: this.items) {
            subTotalPrice += item.getQuantity() * (item.getProduct().getPrice() - item.getDiscount());
        }

        return subTotalPrice;
    }

    public int getDeliveryCount() {
        List<Object> categories = new ArrayList<>();
        for (ShoppingItem item: this.items){
            if (!categories.contains(item.getProduct().getCategory().getTitle())){
                categories.add(item.getProduct().getCategory().getTitle());
            }
        }

        return categories.size();
    }
}
