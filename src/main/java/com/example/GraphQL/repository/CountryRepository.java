package com.example.GraphQL.repository;

import com.example.GraphQL.model.Country;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class CountryRepository {

    private static final List<Country> countries = List.of(
            new Country("IN", "India", "New Delhi", "INR"),
            new Country("US", "United States", "Washington D.C.", "USD"),
            new Country("FR", "France", "Paris", "EUR")
    );

    public List<Country> findAll() {
        return countries;
    }

    public Optional<Country> findByCode(String code) {
        return countries.stream()
                .filter(country -> country.getCode().equalsIgnoreCase(code))
                .findFirst();
    }
}