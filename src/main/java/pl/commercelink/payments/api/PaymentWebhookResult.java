package pl.commercelink.payments.api;

public record PaymentWebhookResult(String orderId, String reference, double fee, boolean processable) {
}
