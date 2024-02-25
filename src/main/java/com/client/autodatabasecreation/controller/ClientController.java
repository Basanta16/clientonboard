package com.client.autodatabasecreation.controller;


import com.client.autodatabasecreation.pojo.ClientRequestPojo;
import com.client.autodatabasecreation.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/client")
@RequiredArgsConstructor
public class ClientController {

    private final ClientService clientService;

    @PostMapping
    public ResponseEntity<?> save(@RequestBody ClientRequestPojo clientRequestPojo) {
        clientService.addClient(clientRequestPojo);
        return ResponseEntity.ok("Client Saved Succesfully");
    }
}
