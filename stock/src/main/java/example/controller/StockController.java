package example.controller;

import example.service.StockService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class StockController {

  private final StockService stockService;

  @GetMapping("/btc")
  public String getBtcPrice() {
    return stockService.getUsdPrice();
  }
}
