package com.example.GraphQL.service.impl;

import com.example.GraphQL.controller.CountryQueryController;
import com.example.GraphQL.model.Country.Country;
import com.example.GraphQL.model.Country.CountryRequest;
import com.example.GraphQL.model.Country.RestCountryResponse;
import com.example.GraphQL.service.ApiCountriesRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CountryService {

    private static final Logger log = LoggerFactory.getLogger(CountryQueryController.class);


    private final ApiCountriesRepository client;

    CountryService(ApiCountriesRepository client) {
        this.client = client;
    }

    public List<Country> getAllCountries() {
        ResponseEntity<List<RestCountryResponse>> response = client.getAllCountries();

        List<RestCountryResponse> countries = response.getBody(); // ✅ unwrap

        if (countries == null) {
            return Collections.emptyList();
        }

        return countries.stream()
                .map(resp -> {
                    String currencyName = "";
                    if (resp.getCurrencies() != null && !resp.getCurrencies().isEmpty()) {
                        var entry = resp.getCurrencies().entrySet().iterator().next();
                        currencyName = entry.getValue().getName();
                    }
                    return new Country(
                            resp.getCca2(),
                            resp.getName().getCommon(),
                            (resp.getCapital() != null && !resp.getCapital().isEmpty())
                                    ? resp.getCapital().get(0)
                                    : "N/A",
                            currencyName
                    );
                })
                .collect(Collectors.toList());
    }

    public ResponseEntity<Country> getCountryByRequest(CountryRequest request) {
        log.info("Fetching country data for {}", request.toString());
        return client.searchCountry(request);
    }
}