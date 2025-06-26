package com.example.GraphQL.controller;

import com.example.GraphQL.model.Country;
import com.example.GraphQL.service.CountryService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CountryQueryResolver {

    private final CountryService countryService;

    public CountryQueryResolver(CountryService countryService) {
        this.countryService = countryService;
    }

    @QueryMapping
    public List<Country> allCountries() {
        return countryService.getAllCountries();
    }

    @QueryMapping
    public Country countryByCode(@Argument String code) {
        return countryService.getCountryByCode(code).orElse(null);
    }
}

