package example.service;

import example.client.StockClient;
import example.properties.StockProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StockServiceImpl implements StockService {

  private final StockProperties stockProperties;
  private final StockClient stockClient;

  @Override
  public String getCurrencyPrice() {
    return stockClient.getCurrencyInfo().getPrice() + " " + stockProperties.getCurrencyName();
  }
}
