package com.ifba;

import java.util.UUID;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

// @Getter ou @Setter 
// @Data é importa o get e o set ao mesmo tempo

@Data 
@AllArgsConstructor
@NoArgsConstructor

public abstract class Pessoa {

    private UUID id;
    private String nome;
    private String whatsapp;
    private Usuario usuario;
    private Endereco endereco;
    private Genero genero;

}
