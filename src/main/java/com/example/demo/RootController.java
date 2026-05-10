package com.example.demo;

import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    @GetMapping("/")
    public Map<String, Object> get(
        @RequestParam Map<String, String> params
    ) {
        return Map.of(
            "method", "GET",
            "params", params
        );
    }

    @PostMapping("/")
    public Map<String, Object> post(
        @RequestParam Map<String, String> params,
        @RequestBody(required = false) Map<String, Object> body
    ) {
        return Map.of(
            "method", "POST",
            "params", params,
            "body", body == null ? Map.of() : body
        );
    }

    @PutMapping("/")
    public Map<String, Object> put(
        @RequestParam Map<String, String> params,
        @RequestBody(required = false) Map<String, Object> body
    ) {
        return Map.of(
            "method", "PUT",
            "params", params,
            "body", body == null ? Map.of() : body
        );
    }

    @PatchMapping("/")
    public Map<String, Object> patch(
        @RequestParam Map<String, String> params,
        @RequestBody(required = false) Map<String, Object> body
    ) {
        return Map.of(
            "method", "PATCH",
            "params", params,
            "body", body == null ? Map.of() : body
        );
    }

    @DeleteMapping("/")
    public Map<String, Object> delete(
        @RequestParam Map<String, String> params
    ) {
        return Map.of(
            "method", "DELETE",
            "params", params
        );
    }

}