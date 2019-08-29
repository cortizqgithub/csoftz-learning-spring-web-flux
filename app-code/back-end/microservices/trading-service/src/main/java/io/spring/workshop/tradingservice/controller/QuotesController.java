package io.spring.workshop.tradingservice.controller;

import static org.springframework.http.MediaType.TEXT_EVENT_STREAM_VALUE;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import io.spring.workshop.tradingservice.component.QuotesClient;
import io.spring.workshop.tradingservice.domain.Quote;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

@Controller
@RequiredArgsConstructor
public class QuotesController {
    private final QuotesClient quotesClient;

    @GetMapping(path = "/quotes/feed", produces = TEXT_EVENT_STREAM_VALUE)
    @ResponseBody
    public Flux<Quote> quotesFeed() {
        return this.quotesClient.quotesFeed();
    }
}