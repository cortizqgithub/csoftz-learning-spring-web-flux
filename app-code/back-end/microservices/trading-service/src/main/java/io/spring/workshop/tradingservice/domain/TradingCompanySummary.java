package io.spring.workshop.tradingservice.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class TradingCompanySummary {
    private final TradingCompany tradingCompany;
    private final Quote latestQuote;
}
