package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.reactive.server.WebTestClient;

@AutoConfigureWebTestClient
@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class RequestParamTests {

    @Autowired
    private WebTestClient webClient;

    @Test
    void shouldReturnBadRequestWithEmptyBooleanParameter() {
        final WebTestClient.ResponseSpec response = webClient
                .get()
                .uri("boolean?parameter=")
                .exchange();

        response.expectStatus()
                .isBadRequest();
    }

    @Test
    void shouldReturnBadRequestWithEmptyIntegerParameter() {
        final WebTestClient.ResponseSpec response = webClient
                .get()
                .uri("integer?parameter=")
                .exchange();

        response.expectStatus()
                .isBadRequest();
    }

    @Test
    void shouldReturnOkWithEmptyStringParameter() {
        final WebTestClient.ResponseSpec response = webClient
                .get()
                .uri("string?parameter=")
                .exchange();

        response.expectStatus()
                .isOk();
    }
}
