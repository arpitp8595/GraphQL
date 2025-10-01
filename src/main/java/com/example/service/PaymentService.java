package com.example.service;

import com.example.input.CardAccountInput;
import com.example.input.CardEmailInput;
import com.example.input.CardLastNameInput;
import com.example.model.ProcessResult;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PaymentService {

    public ProcessResult processWithLastName(CardLastNameInput input) {
        // Simulate business logic for card + last name processing
        System.out.println("Processing payment with Card: " + input.getCardNumber() +
                ", Last Name: " + input.getLastName());

        // Simulate validation
        if (!isValidCard(input.getCardNumber())) {
            return new ProcessResult(false, "Invalid card number", null, "FAILED");
        }

        // Simulate processing
        String transactionId = "TXN-" + UUID.randomUUID().toString().substring(0, 8);

        return new ProcessResult(true, "Payment processed successfully with last name verification",
                transactionId, "COMPLETED");
    }

    public ProcessResult processWithAccount(CardAccountInput input) {
        // Simulate business logic for card + account processing
        System.out.println("Processing payment with Card: " + input.getCardNumber() +
                ", Account: " + input.getAccountNumber());

        // Simulate validation
        if (!isValidCard(input.getCardNumber()) || !isValidAccount(input.getAccountNumber())) {
            return new ProcessResult(false, "Invalid card or account number", null, "FAILED");
        }

        // Simulate processing
        String transactionId = "TXN-" + UUID.randomUUID().toString().substring(0, 8);

        return new ProcessResult(true, "Payment processed successfully with account verification",
                transactionId, "COMPLETED");
    }

    public ProcessResult processWithEmail(CardEmailInput input) {
        // Simulate business logic for card + email processing
        System.out.println("Processing payment with Card: " + input.getCardNumber() +
                ", Email: " + input.getEmail());

        // Simulate validation
        if (!isValidCard(input.getCardNumber())) {
            return new ProcessResult(false, "Invalid card number", null, "FAILED");
        }

        // Simulate processing
        String transactionId = "TXN-" + UUID.randomUUID().toString().substring(0, 8);

        return new ProcessResult(true, "Payment processed successfully with email notification",
                transactionId, "COMPLETED");
    }

    private boolean isValidCard(String cardNumber) {
        // Simple validation - in real world, use proper card validation
        return cardNumber != null && cardNumber.length() >= 12;
    }

    private boolean isValidAccount(String accountNumber) {
        // Simple validation - in real world, use proper account validation
        return accountNumber != null && accountNumber.length() >= 8;
    }
}
