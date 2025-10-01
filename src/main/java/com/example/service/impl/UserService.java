package com.example.service.impl;

import com.example.controller.CountryQueryController;
import com.example.model.JsonPostRequest;
import com.example.model.JsonPostResponse;
import com.example.service.JsonPlaceholderClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private static final Logger log = LoggerFactory.getLogger(CountryQueryController.class);
    private final JsonPlaceholderClient jsonPlaceholderClient;

    public UserService(JsonPlaceholderClient jsonPlaceholderClient) {
        this.jsonPlaceholderClient = jsonPlaceholderClient;
    }

    public JsonPostResponse createPost(JsonPostRequest request) {
        log.info("Fetching data for createPost() {}", request.toString());
        return jsonPlaceholderClient.createPost(request);
    }
}