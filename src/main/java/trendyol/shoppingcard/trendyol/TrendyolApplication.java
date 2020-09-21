package trendyol.shoppingcard.trendyol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import trendyol.shoppingcard.trendyol.model.*;
import trendyol.shoppingcard.trendyol.service.DeliveryService;
import trendyol.shoppingcard.trendyol.service.ShoppingService;
import trendyol.shoppingcard.trendyol.shoppingCard.ShoppingCard;
import trendyol.shoppingcard.trendyol.shoppingCard.ShoppingItem;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class TrendyolApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrendyolApplication.class, args);

		Category bagCategory = (new Category()).setTitle("Bag");

		Category shirtCategory = (new Category()).setTitle("Shirt");

		Product greyShirt = (new Product())
				.setTitle("Gri Gömlek")
				.setPrice(49.99)
				.setCategory(shirtCategory);

		Product whiteShirt = (new Product())
				.setTitle("Beyaz Gömlek")
				.setPrice(59.99)
				.setCategory(shirtCategory);

		Product blackBag = (new Product())
				.setTitle("Siyah Çanta")
				.setPrice(99.99)
				.setCategory(bagCategory);

		List<ShoppingItem> items = new ArrayList<>();
		items.add(new ShoppingItem(greyShirt, 1));
		items.add(new ShoppingItem(whiteShirt, 3));
		items.add(new ShoppingItem(blackBag, 2));

		ShoppingCard shoppingCard = (new ShoppingCard()).setItems(items);

		Campaign bagCampaign = (Campaign) (new Campaign())
				.setCategory(bagCategory)
				.setDiscountAmount(10);

		Campaign shirtCampaign = (Campaign) (new Campaign())
				.setCategory(shirtCategory)
				.setDiscountAmount(5);

		List<Campaign> campaigns = new ArrayList<>();
		campaigns.add(bagCampaign);
		campaigns.add(shirtCampaign);

		ShoppingService shoppingService = new ShoppingService();
		shoppingService.applyCampaigns(shoppingCard, campaigns);

		Coupon coupon = (Coupon) (new Coupon())
				.setMinimumAmount(75)
				.setDiscountAmount(10);

		shoppingService.applyCoupon(shoppingCard, coupon);

		Delivery delivery = (new Delivery())
            	.setCostPerDelivery(1)
            	.setCostPerProduct(2);

		DeliveryService deliveryService = new DeliveryService(delivery);

		double deliveryCost = deliveryService.deliveryCostCalculator(
				shoppingCard.getDeliveryCount(),
				shoppingCard.getItemCount()
		);

		System.out.format(
			"Basket Amount: %.2f \nDelivery Amount: %.2f \nTotal Amount: %.2f",
				shoppingCard.getTotalPrice(),
				deliveryCost,
				(deliveryCost + shoppingCard.getTotalPrice())
		);
	}
}
