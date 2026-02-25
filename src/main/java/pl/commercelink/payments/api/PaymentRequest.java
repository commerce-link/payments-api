package pl.commercelink.payments.api;

import java.util.List;

public record PaymentRequest(
        String storeName,
        String orderId,
        String buyerEmail,
        String currency,
        String successUrl,
        String cancelUrl,
        List<PaymentLineItem> lineItems,
        PaymentShippingItem shippingItem) {
}
