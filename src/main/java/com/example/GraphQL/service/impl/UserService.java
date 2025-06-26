package com.example.GraphQL.service.impl;

import com.example.GraphQL.controller.CountryQueryController;
import com.example.GraphQL.model.JsonPostRequest;
import com.example.GraphQL.model.JsonPostResponse;
import com.example.GraphQL.service.JsonPlaceholderClient;
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