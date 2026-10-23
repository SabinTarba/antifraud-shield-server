package com.antifraudshield.server.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class AntiFraudShieldAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(AntiFraudShieldAdminApplication.class, args);

    }

    @RestController 
    public class Test {

        @GetMapping
        public String test() {
            return "ADMIN";
        }
    }
}
