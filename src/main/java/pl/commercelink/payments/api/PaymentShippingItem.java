package pl.commercelink.payments.api;

public record PaymentShippingItem(String name, int amount, int minDeliveryDays, int maxDeliveryDays) {
}
