package io.spring.workshop.stockdetails.controller;

import java.time.Duration;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.spring.workshop.stockdetails.domain.TradingCompany;
import io.spring.workshop.stockdetails.repository.TradingCompanyRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
public class TradingCompanyController {

    private final TradingCompanyRepository tradingCompanyRepository;

    @GetMapping(path = "/details", produces = MediaType.APPLICATION_JSON_VALUE)
    public Flux<TradingCompany> listTradingCompanies() {
        return this.tradingCompanyRepository.findAll();
    }

    @GetMapping(path = "/details/{ticker}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<TradingCompany> showTradingCompanies(@PathVariable String ticker) {
        return this.tradingCompanyRepository.findByTicker(ticker).delayElement(Duration.ofMillis(400));
    }
}