package com.example.input;

import jakarta.validation.constraints.NotBlank;

public class CardAccountInput {
    @NotBlank(message = "Card number is required")
    private String cardNumber;

    @NotBlank(message = "Account number is required")
    private String accountNumber;

    public CardAccountInput() {}

    public CardAccountInput(String cardNumber, String accountNumber) {
        this.cardNumber = cardNumber;
        this.accountNumber = accountNumber;
    }

    public String getCardNumber() { return cardNumber; }
    public void setCardNumber(String cardNumber) { this.cardNumber = cardNumber; }

    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }
}
