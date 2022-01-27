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

  @GetMapping("/price")
  public String getCurrencyPrice() {
    return stockService.getCurrencyPrice();
  }
}
