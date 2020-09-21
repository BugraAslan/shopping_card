package trendyol.shoppingcard.trendyol.service;

import trendyol.shoppingcard.trendyol.model.Campaign;
import trendyol.shoppingcard.trendyol.model.Coupon;
import trendyol.shoppingcard.trendyol.shoppingCard.ShoppingCard;
import trendyol.shoppingcard.trendyol.shoppingCard.ShoppingItem;

import java.util.List;

public class ShoppingService {

    public void applyCampaigns(ShoppingCard shoppingCard, List<Campaign> campaigns) {
        for (ShoppingItem item: shoppingCard.getItems()) {
            for (Campaign campaign: campaigns){
                if (item.getProduct().getCategory().getTitle().equals(campaign.getCategory().getTitle())) {
                    item.setDiscount(campaign.getDiscountAmount());
                }
            }
        }
    }

    public void applyCoupon(ShoppingCard shoppingCard, Coupon coupon)
    {
        if (shoppingCard.getSubTotalPrice() >= coupon.getMinimumAmount() &&
            (shoppingCard.getSubTotalPrice() - coupon.getDiscountAmount()) > 0
        ){
            shoppingCard.setTotalPrice(shoppingCard.getSubTotalPrice() - coupon.getDiscountAmount());
        }
    }
}
