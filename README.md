# Payments API

This library defines a provider-agnostic API for integrating external payment systems into the CommerceLink platform. It provides a common set of interfaces and data models that payment provider implementations must adhere to, enabling seamless swapping or coexistence of different payment backends.

The core `PaymentProvider` interface supports creating payment links from a `PaymentRequest` containing line items and optional shipping details.

## Provider Discovery

This library extends the [provider-api](https://github.com/commerce-link/provider-api) plugin system. The `PaymentProviderDescriptor` interface extends `ProviderDescriptor<PaymentProvider>` and serves as the SPI entry point for pluggable payment implementations.

Concrete implementations are discovered at runtime via `ServiceLoader`. See the [provider-api README](https://github.com/commerce-link/provider-api) for registration details.
