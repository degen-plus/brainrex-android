# brainrex

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>brainrex</artifactId>
    <version>1.0.2</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:brainrex:1.0.2"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/brainrex-1.0.2.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import brainrex.AnomalyApi;

public class AnomalyApiExample {

    public static void main(String[] args) {
        AnomalyApi apiInstance = new AnomalyApi();
        TimeSeries request = new TimeSeries(); // TimeSeries | Time Series to be analyzed, with the following format.
        try {
            List<Boolean> result = apiInstance.anomalyBatch(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyApi#anomalyBatch");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.bitlongs.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AnomalyApi* | [**anomalyBatch**](docs/AnomalyApi.md#anomalyBatch) | **POST** /anomaly/json/detect | Detects anomalies in historical data in batches. This endpoint uses your entire dataset as input
*IntegrationsApi* | [**cryptoGetCandleData**](docs/IntegrationsApi.md#cryptoGetCandleData) | **POST** /crypto/get_candles | Downloads candle format market data
*IntegrationsApi* | [**cryptoGetExchangeAssets**](docs/IntegrationsApi.md#cryptoGetExchangeAssets) | **POST** /crypto/get_exchange_assets | Gets all coin pairs traded in specified exchange
*IntegrationsApi* | [**cryptoGetOrderbooks**](docs/IntegrationsApi.md#cryptoGetOrderbooks) | **POST** /crypto/get_orderbooks | Returns the current state of the orderbook.
*IntegrationsApi* | [**cryptoGetSupportedExchanges**](docs/IntegrationsApi.md#cryptoGetSupportedExchanges) | **GET** /crypto/get_supported_exchanges | Gets all cryptocurrency exchanges supported by the Brainrex API
*IntegrationsApi* | [**cryptoGetTicker**](docs/IntegrationsApi.md#cryptoGetTicker) | **POST** /crypto/get_ticker | Downloads candle format market data
*LanguageApi* | [**languageGetCryptoEntities**](docs/LanguageApi.md#languageGetCryptoEntities) | **POST** /entity/get_crypto_entities | Extracts known crypto entities like coin names, exchanges, media from text.
*LanguageApi* | [**languageGetGeneralSentiment**](docs/LanguageApi.md#languageGetGeneralSentiment) | **POST** /sentiment/get_general_sentiment | Returns a -1 to 1 score, depending on positive/negative sentiment
*LanguageApi* | [**languageGetPriceSentiment**](docs/LanguageApi.md#languageGetPriceSentiment) | **POST** /language/get_price_sentiment | Sentiment analysis score using a model trained for buy signals.


## Documentation for Models

 - [CandleRequest](docs/CandleRequest.md)
 - [CandleResponse](docs/CandleResponse.md)
 - [Error](docs/Error.md)
 - [Exchange](docs/Exchange.md)
 - [ExchangeAssetsResponse](docs/ExchangeAssetsResponse.md)
 - [ExchangeAssetsResponseInner](docs/ExchangeAssetsResponseInner.md)
 - [OHCLV](docs/OHCLV.md)
 - [OrderbookRequest](docs/OrderbookRequest.md)
 - [OrderbookResponse](docs/OrderbookResponse.md)
 - [PointTimeSeries](docs/PointTimeSeries.md)
 - [SupportedExchanges](docs/SupportedExchanges.md)
 - [Text](docs/Text.md)
 - [TickerResponse](docs/TickerResponse.md)
 - [TickerResponseInner](docs/TickerResponseInner.md)
 - [TimeSeries](docs/TimeSeries.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### APIKeyHeader

- **Type**: API key
- **API key parameter name**: x-api-key
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



