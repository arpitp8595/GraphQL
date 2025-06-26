package com.example.GraphQL.service;

import com.example.GraphQL.model.Country.Country;
import com.example.GraphQL.model.Country.CountryRequest;
import com.example.GraphQL.model.Country.RestCountryResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "restCountriesClient", url = "https://restcountries.com")
public interface ApiCountriesRepository {
    @GetMapping("/v3.1/all?fields=cca2,name,capital,currencies")
    ResponseEntity<List<RestCountryResponse>> getAllCountries();

    @PostMapping("/country/search")
    ResponseEntity<Country> searchCountry(@RequestBody CountryRequest request);
}
