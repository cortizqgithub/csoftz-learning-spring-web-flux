package io.spring.workshop.tradingservice.domain;

import java.math.BigDecimal;
import java.math.MathContext;
import java.time.Instant;

import lombok.Data;

@Data
public class Quote {
    private static final MathContext MATH_CONTEXT = new MathContext(2);
    private String ticker;
    private BigDecimal price;
    private Instant instant = Instant.now();

    public Quote() {
    }

    public Quote(String ticker) {
        this.ticker = ticker;
    }

    public Quote(String ticker, BigDecimal price) {
        this.ticker = ticker;
        this.price = price;
    }

    public Quote(String ticker, Double price) {
        this(ticker, new BigDecimal(price, MATH_CONTEXT));
    }
}
