package io.spring.workshop.tradingservice.exception;

public class TickerNotFoundException extends RuntimeException {
	public TickerNotFoundException(String message) {
		super(message);
	}
}