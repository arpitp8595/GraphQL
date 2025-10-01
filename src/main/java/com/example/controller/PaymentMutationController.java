package com.example.controller;

import com.example.input.CardAccountInput;
import com.example.input.CardEmailInput;
import com.example.input.CardLastNameInput;
import com.example.model.ProcessResult;
import com.example.service.PaymentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

@Controller
public class PaymentMutationController {

    @Autowired
    private final PaymentService paymentService;

    public PaymentMutationController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @MutationMapping
    public ProcessResult processWithLastName(@Argument @Valid CardLastNameInput input) {
        return paymentService.processWithLastName(input);
    }

    @MutationMapping
    public ProcessResult processWithAccount(@Argument @Valid CardAccountInput input) {
        return paymentService.processWithAccount(input);
    }

    @MutationMapping
    public ProcessResult processWithEmail(@Argument @Valid CardEmailInput input) {
        return paymentService.processWithEmail(input);
    }
}