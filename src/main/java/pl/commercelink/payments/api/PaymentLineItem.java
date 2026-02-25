package pl.commercelink.payments.api;

public record PaymentLineItem(String name, String description, int unitAmountInCents, int quantity) {
}
