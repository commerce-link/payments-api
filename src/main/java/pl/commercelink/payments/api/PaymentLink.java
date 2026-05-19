package pl.commercelink.payments.api;

import java.util.Map;

public record PaymentLink(String url, String method, Map<String, String> params) {
}
