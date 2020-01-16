# AnomalyApi

All URIs are relative to *https://api.bitlongs.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**anomalyBatch**](AnomalyApi.md#anomalyBatch) | **POST** /anomaly/json/detect | Detects anomalies in historical data in batches. This endpoint uses your entire dataset as input


<a name="anomalyBatch"></a>
# **anomalyBatch**
> List&lt;Boolean&gt; anomalyBatch(request)

Detects anomalies in historical data in batches. This endpoint uses your entire dataset as input

The Anomaly Detect endpoint ingests time series data of all types, then monitors and detects abnormalities historical time series data. &lt;br&gt;&lt;br&gt; Our AI selects from several models, choosing the one that fits the given data best, and we give you the avality to customize the sensitivy of the model. Our model has been trained to recognize anomalies in popular blockchain networks e.g. Bitcoin, Ethereum, learning from past events.

### Example
```java
// Import classes:
//import brainrex.AnomalyApi;

AnomalyApi apiInstance = new AnomalyApi();
TimeSeries request = new TimeSeries(); // TimeSeries | Time Series to be analyzed, with the following format.
try {
    List<Boolean> result = apiInstance.anomalyBatch(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnomalyApi#anomalyBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**TimeSeries**](TimeSeries.md)| Time Series to be analyzed, with the following format. | [optional]

### Return type

**List&lt;Boolean&gt;**

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

