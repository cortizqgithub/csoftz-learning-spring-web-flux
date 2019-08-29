package io.spring.workshop.stockdetails.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class TradingCompany {
    @Id
    private String id;
    private String description;
    private String ticker;

    public TradingCompany(String description, String ticker) {
        this.description = description;
        this.ticker = ticker;
    }
}
