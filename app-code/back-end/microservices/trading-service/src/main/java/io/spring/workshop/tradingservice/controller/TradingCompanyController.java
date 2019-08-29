package io.spring.workshop.tradingservice.controller;

import io.spring.workshop.tradingservice.component.TradingCompanyClient;
import io.spring.workshop.tradingservice.domain.TradingCompany;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TradingCompanyController {
	private final TradingCompanyClient tradingCompanyClient;

	@GetMapping(path = "/details", produces = MediaType.APPLICATION_JSON_VALUE)
	public Flux<TradingCompany> listTradingCompanies() {
		return tradingCompanyClient.findAllCompanies();
	}

	@GetMapping(path = "/details/{ticker}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Mono<TradingCompany> showTradingCompanies(@PathVariable String ticker) {
		return tradingCompanyClient.getTradingCompany(ticker);
	}
}