package com.example.service;

import com.example.model.JsonPostRequest;
import com.example.model.JsonPostResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "jsonPlaceholder", url = "https://jsonplaceholder.typicode.com")
public interface JsonPlaceholderClient {
    @PostMapping("/posts")
    JsonPostResponse createPost(@RequestBody JsonPostRequest request);
}
