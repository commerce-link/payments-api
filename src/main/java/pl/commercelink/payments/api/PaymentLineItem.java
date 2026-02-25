package pl.commercelink.payments.api;

public record PaymentLineItem(String name, String description, int amount, int quantity) {
}
