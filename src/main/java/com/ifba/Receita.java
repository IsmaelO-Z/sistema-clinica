package com.ifba;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Receita {
    private UUID id;
    private LocalDateTime data;
    private String descricao;
    private List<Medicamento> medicamentos;

}