package com.example.GraphQL.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Country {
    private String code;
    private String name;
    private String capital;
    private String currency;

    public Country(){};

    public Country(String code, String name, String capital, String currency) {
        this.code = code;
        this.name = name;
        this.capital = capital;
        this.currency = currency;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Country{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", capital='" + capital + '\'' +
                ", currency='" + currency + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Country country)) return false;

        if (!getCode().equals(country.getCode())) return false;
        if (!getName().equals(country.getName())) return false;
        if (!getCapital().equals(country.getCapital())) return false;
        return getCurrency().equals(country.getCurrency());
    }

    @Override
    public int hashCode() {
        int result = getCode().hashCode();
        result = 31 * result + getName().hashCode();
        result = 31 * result + getCapital().hashCode();
        result = 31 * result + getCurrency().hashCode();
        return result;
    }
}