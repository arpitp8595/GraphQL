package com.example.input;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class CardEmailInput {
    @NotBlank(message = "Card number is required")
    private String cardNumber;

    @Email(message = "Valid email is required")
    @NotBlank(message = "Email is required")
    private String email;

    public CardEmailInput() {}

    public CardEmailInput(String cardNumber, String email) {
        this.cardNumber = cardNumber;
        this.email = email;
    }

    public String getCardNumber() { return cardNumber; }
    public void setCardNumber(String cardNumber) { this.cardNumber = cardNumber; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}