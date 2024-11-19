package com.ifba;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Medico extends Pessoa{
    private String crm;
    private Especialidade especialidade;
    private List<Consulta> consutas;
}
