package com.acc.InvoiceQR_code.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class EmailController {

    @PostMapping("/send-invoice")
    public ResponseEntity<String> sendInvoiceEmail(@RequestBody InvoiceEmailRequest request) {
        System.out.println("Received email: " + request.getEmail());
        emailService.sendInvoice(request);
        return ResponseEntity.ok("Email sent");
    }

}
