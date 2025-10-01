package com.example.input;

import jakarta.validation.constraints.NotBlank;

public class CardLastNameInput {
    @NotBlank(message = "Card number is required")
    private String cardNumber;

    @NotBlank(message = "Last name is required")
    private String lastName;

    public CardLastNameInput() {}

    public CardLastNameInput(String cardNumber, String lastName) {
        this.cardNumber = cardNumber;
        this.lastName = lastName;
    }

    public String getCardNumber() { return cardNumber; }
    public void setCardNumber(String cardNumber) { this.cardNumber = cardNumber; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
}