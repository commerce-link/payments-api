package pl.commercelink.payments.api;

public interface PaymentProvider {
    PaymentLink createPaymentLink(PaymentRequest request);
    PaymentWebhookResult processWebhook(PaymentWebhookRequest request);
}
