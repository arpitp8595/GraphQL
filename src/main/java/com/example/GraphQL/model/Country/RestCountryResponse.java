package com.example.GraphQL.model.Country;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class RestCountryResponse {
    private Name name;
    private String cca2;
    private List<String> capital;

    private Map<String, CurrencyDetails> currencies; // ✅ this is the correct mapping

    @Data
    public static class Name {
        private String common;

        public String getCommon() {
            return common;
        }

        public void setCommon(String common) {
            this.common = common;
        }
    }

    @Data
    public static class CurrencyDetails {
        private String name;
        private String symbol;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSymbol() {
            return symbol;
        }

        public void setSymbol(String symbol) {
            this.symbol = symbol;
        }
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getCca2() {
        return cca2;
    }

    public void setCca2(String cca2) {
        this.cca2 = cca2;
    }

    public List<String> getCapital() {
        return capital;
    }

    public void setCapital(List<String> capital) {
        this.capital = capital;
    }

    public Map<String, CurrencyDetails> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(Map<String, CurrencyDetails> currencies) {
        this.currencies = currencies;
    }
}