package com.ifba;

import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data 
@AllArgsConstructor
@NoArgsConstructor

public class Usuario {
    private UUID id;
    private String login;
    private String senha;
}
