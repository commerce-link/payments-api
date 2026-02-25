package pl.commercelink.payments.api;

public interface PaymentProvider {
    String createPaymentLink(PaymentRequest request);
}
