package io.spring.workshop.stockquotes.component;

import static org.springframework.http.MediaType.APPLICATION_STREAM_JSON;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class QuoteRouter {

    @Bean
    public RouterFunction<ServerResponse> route(QuoteHandler quoteHandler) {
        return RouterFunctions
                .route(GET("/quotes").and(accept(APPLICATION_STREAM_JSON)), quoteHandler::streamQuotes);
    }
}