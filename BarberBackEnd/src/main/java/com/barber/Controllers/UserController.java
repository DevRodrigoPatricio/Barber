package com.barber.Controllers;

import com.barber.Entities.Dtos.ServiceDTO;
import com.barber.Entities.Dtos.UserDTO;
import com.barber.Services.ServicesService;
import com.barber.Services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping
    public ResponseEntity create(@Valid @RequestBody UserDTO data){
        service.create(data);
        return ResponseEntity.status(HttpStatus.CREATED).body("Usuário criado com sucesso!");
    }
}
