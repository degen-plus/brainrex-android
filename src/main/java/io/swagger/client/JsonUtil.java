/**
 * BrainRex API
 * The Brainrex API is a collection of analytics tools and data integrations made for blockchain developers. In particular we offer Natural Language Processing and Anomaly detection algorithms that have been fine tune to understand text data and time series in the domain speficic setting of cryptocurrency and blockchain technology. This technology is intended to be use as building blocks to bigger applications, we offer examples on how to use them for Trading Backtesting and Smart Contract anomaly monitoring.
 *
 * OpenAPI spec version: 1.0.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Date;
import brainrexPackage.*;

public class JsonUtil {
  public static GsonBuilder gsonBuilder;

  static {
    gsonBuilder = new GsonBuilder();
    gsonBuilder.serializeNulls();
    gsonBuilder.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
    gsonBuilder.registerTypeAdapter(Date.class, new JsonDeserializer<Date>() {
      public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        return new Date(json.getAsJsonPrimitive().getAsLong());
      }
    });
  }

  public static Gson getGson() {
    return gsonBuilder.create();
  }

  public static String serialize(Object obj){
    return getGson().toJson(obj);
  }

  public static <T> T deserializeToList(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getListTypeForDeserialization(cls));
  }

  public static <T> T deserializeToObject(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getTypeForDeserialization(cls));
  }

  public static Type getListTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("CandleRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<CandleRequest>>(){}.getType();
    }
    
    if ("CandleResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CandleResponse>>(){}.getType();
    }
    
    if ("Error".equalsIgnoreCase(className)) {
      return new TypeToken<List<Error>>(){}.getType();
    }
    
    if ("Exchange".equalsIgnoreCase(className)) {
      return new TypeToken<List<Exchange>>(){}.getType();
    }
    
    if ("ExchangeAssetsResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ExchangeAssetsResponse>>(){}.getType();
    }
    
    if ("ExchangeAssetsResponseInner".equalsIgnoreCase(className)) {
      return new TypeToken<List<ExchangeAssetsResponseInner>>(){}.getType();
    }
    
    if ("OHCLV".equalsIgnoreCase(className)) {
      return new TypeToken<List<OHCLV>>(){}.getType();
    }
    
    if ("OrderbookRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderbookRequest>>(){}.getType();
    }
    
    if ("OrderbookResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderbookResponse>>(){}.getType();
    }
    
    if ("PointTimeSeries".equalsIgnoreCase(className)) {
      return new TypeToken<List<PointTimeSeries>>(){}.getType();
    }
    
    if ("SupportedExchanges".equalsIgnoreCase(className)) {
      return new TypeToken<List<SupportedExchanges>>(){}.getType();
    }
    
    if ("Text".equalsIgnoreCase(className)) {
      return new TypeToken<List<Text>>(){}.getType();
    }
    
    if ("TickerResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TickerResponse>>(){}.getType();
    }
    
    if ("TickerResponseInner".equalsIgnoreCase(className)) {
      return new TypeToken<List<TickerResponseInner>>(){}.getType();
    }
    
    if ("TimeSeries".equalsIgnoreCase(className)) {
      return new TypeToken<List<TimeSeries>>(){}.getType();
    }
    
    return new TypeToken<List<Object>>(){}.getType();
  }

  public static Type getTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("CandleRequest".equalsIgnoreCase(className)) {
      return new TypeToken<CandleRequest>(){}.getType();
    }
    
    if ("CandleResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CandleResponse>(){}.getType();
    }
    
    if ("Error".equalsIgnoreCase(className)) {
      return new TypeToken<Error>(){}.getType();
    }
    
    if ("Exchange".equalsIgnoreCase(className)) {
      return new TypeToken<Exchange>(){}.getType();
    }
    
    if ("ExchangeAssetsResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ExchangeAssetsResponse>(){}.getType();
    }
    
    if ("ExchangeAssetsResponseInner".equalsIgnoreCase(className)) {
      return new TypeToken<ExchangeAssetsResponseInner>(){}.getType();
    }
    
    if ("OHCLV".equalsIgnoreCase(className)) {
      return new TypeToken<OHCLV>(){}.getType();
    }
    
    if ("OrderbookRequest".equalsIgnoreCase(className)) {
      return new TypeToken<OrderbookRequest>(){}.getType();
    }
    
    if ("OrderbookResponse".equalsIgnoreCase(className)) {
      return new TypeToken<OrderbookResponse>(){}.getType();
    }
    
    if ("PointTimeSeries".equalsIgnoreCase(className)) {
      return new TypeToken<PointTimeSeries>(){}.getType();
    }
    
    if ("SupportedExchanges".equalsIgnoreCase(className)) {
      return new TypeToken<SupportedExchanges>(){}.getType();
    }
    
    if ("Text".equalsIgnoreCase(className)) {
      return new TypeToken<Text>(){}.getType();
    }
    
    if ("TickerResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TickerResponse>(){}.getType();
    }
    
    if ("TickerResponseInner".equalsIgnoreCase(className)) {
      return new TypeToken<TickerResponseInner>(){}.getType();
    }
    
    if ("TimeSeries".equalsIgnoreCase(className)) {
      return new TypeToken<TimeSeries>(){}.getType();
    }
    
    return new TypeToken<Object>(){}.getType();
  }

};