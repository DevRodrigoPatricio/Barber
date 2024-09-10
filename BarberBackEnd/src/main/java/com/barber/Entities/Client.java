package com.barber.Entities;

import com.barber.Entities.Dtos.UserDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Client extends  User  {
    @Column(name = "telephone", length = 20, nullable = false)
    private String telephone;


    public Client(UserDTO userDTO) {
        super(userDTO);
    }
}
