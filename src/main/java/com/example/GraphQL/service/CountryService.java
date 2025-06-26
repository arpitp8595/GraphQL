package com.example.GraphQL.service;

import com.example.GraphQL.model.Country;
import com.example.GraphQL.repository.CountryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {

    private final CountryRepository repository;

    public CountryService(CountryRepository repository) {
        this.repository = repository;
    }

    public List<Country> getAllCountries() {
        return repository.findAll();
    }

    public Optional<Country> getCountryByCode(String code) {
        return repository.findByCode(code);
    }
}