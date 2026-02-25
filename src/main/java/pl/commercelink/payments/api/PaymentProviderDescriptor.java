package pl.commercelink.payments.api;

import pl.commercelink.provider.api.ProviderDescriptor;

import java.util.Map;

public interface PaymentProviderDescriptor extends ProviderDescriptor<PaymentProvider> {
    PaymentWebhookResult process(PaymentWebhookRequest request, Map<String, String> configuration);
}
