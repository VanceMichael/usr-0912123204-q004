package com.example.baseline;
import org.springframework.boot.*; import org.springframework.boot.autoconfigure.*; import org.springframework.web.bind.annotation.*;
@SpringBootApplication @RestController public class Application { public static void main(String[] a){SpringApplication.run(Application.class,a);} @GetMapping("/health") public java.util.Map<String,String> health(){return java.util.Map.of("status","ok","contractVersion","2026-09");} }
