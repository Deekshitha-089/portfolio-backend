package com.deekshitha.portfolio_backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/admin")
@CrossOrigin(origins = "*")
public class AuthController {

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Map<String, String> data) {

        String username = data.get("Deekshitha");
        String password = data.get("Kl@2406832");

        if ("Deekshitha".equals(username) && "Kl@2406832".equals(password)) {
            return ResponseEntity.ok(Map.of("message", "Login successful"));
        } else {
            return ResponseEntity.status(401).body(Map.of("message", "Invalid credentials"));
        }
    }
}
