package com.ifba;

import java.util.UUID;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

public class Endereco {
    private UUID id;
    private String rua;
    private String cidade;
    private String estado;
    private String cep;
}
