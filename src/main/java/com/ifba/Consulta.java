package com.ifba;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Consulta {
    private UUID id;
    private LocalDateTime data;
    private Boolean retorno;
    private BigDecimal valor;
    private StatusPagment statusPagment;
    private StatusConsulta statusConsulta;
    private Pasciente pasciente;
    private Medico medico;
    private Receita receita;
}