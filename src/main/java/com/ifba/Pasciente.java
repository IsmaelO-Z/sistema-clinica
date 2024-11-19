package com.ifba;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Pasciente extends Pessoa { 
    private String plano_saude;
    private List<Consulta> consultas;
}
