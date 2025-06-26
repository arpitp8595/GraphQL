package com.example.GraphQL.controller;

import com.example.GraphQL.model.JsonPostRequest;
import com.example.GraphQL.model.JsonPostResponse;
import com.example.GraphQL.model.User.UserRequestBody;
import com.example.GraphQL.model.User.UserResponseBody;
import com.example.GraphQL.service.impl.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.example.GraphQL.model.Country.Country;
import com.example.GraphQL.model.Country.CountryRequest;
import com.example.GraphQL.service.impl.CountryService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;


@Controller
public class CountryQueryController {

    private static final Logger log = LoggerFactory.getLogger(CountryQueryController.class);

    private final CountryService countryService;
    private final UserService userService;

    public CountryQueryController(CountryService countryService, UserService userService) {
        this.countryService = countryService;
        this.userService = userService;
    }

    @QueryMapping
    public List<Country> allCountries() {
        return countryService.getAllCountries();
    }

    @MutationMapping
    public Country getCountryByInput(@Argument("request") CountryRequest request) {
        log.info("Received request for getCountryByInput: {}", request.toString());
        ResponseEntity<Country> countryResponseEntity = countryService.getCountryByRequest(request);
        log.info("Response: {}", countryResponseEntity.getBody());
        return countryResponseEntity.getBody();
    }

    @MutationMapping
    public JsonPostResponse createPost(@Argument("request") JsonPostRequest request) {
        log.info("Received request for createPost(): {}", request.toString());
        return userService.createPost(request);
    }
}

