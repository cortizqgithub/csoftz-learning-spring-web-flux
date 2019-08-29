package io.spring.workshop.tradingservice.domain;

import lombok.Data;

@Data
public class TradingCompany {
    private String id;
    private String description;
    private String ticker;

    public TradingCompany(String description, String ticker) {
        this.description = description;
        this.ticker = ticker;
    }
}
