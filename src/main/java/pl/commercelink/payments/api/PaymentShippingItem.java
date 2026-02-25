package pl.commercelink.payments.api;

public record PaymentShippingItem(String name, int amountCents, String currency, int minDeliveryDays, int maxDeliveryDays) {
}
