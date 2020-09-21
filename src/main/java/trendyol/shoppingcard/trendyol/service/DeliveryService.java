package trendyol.shoppingcard.trendyol.service;

import trendyol.shoppingcard.trendyol.model.Delivery;

public class DeliveryService {

    protected Delivery delivery;

    public DeliveryService(Delivery delivery) {
        this.delivery = delivery;
    }

    public double deliveryCostCalculator(int deliveryCount, int productCount) {
        if (deliveryCount <= 0 || productCount <= 0){
            return this.delivery.getDefaultCost();
        }

        return (this.delivery.getCostPerDelivery() * deliveryCount) + (this.delivery.getCostPerProduct() * productCount);
    }
}
