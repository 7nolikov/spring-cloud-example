package example.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "stock")
@Data
public class StockProperties {
  private String currencyName;
  private String providerUrl;
}
