package io.spring.workshop.stockdetails.repository;

import io.spring.workshop.stockdetails.domain.TradingCompany;
import reactor.core.publisher.Mono;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface TradingCompanyRepository extends ReactiveMongoRepository<TradingCompany, String> {
	Mono<TradingCompany> findByTicker(String ticker);
}
