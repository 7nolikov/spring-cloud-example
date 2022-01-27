package example.client;

import example.model.CurrencyInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "spring-cloud-eureka-client", url = "${stock.provider-url}")
public interface StockClient {

  @GetMapping(value = "/api/v3/avgPrice?symbol=${stock.currency-name}")
  CurrencyInfo getCurrencyInfo();
}
