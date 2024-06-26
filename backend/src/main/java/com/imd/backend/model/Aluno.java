package com.imd.backend.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
public class Aluno extends Usuario{

    public Aluno(){
        this.tipoUsuario = TipoUsuario.ALUNO;
    }

    @ManyToMany
    @JoinTable(
            name = "aluno_modalidade",
            joinColumns = @JoinColumn(name = "aluno_id"),
            inverseJoinColumns = @JoinColumn(name = "modalidade_id")
    )
    private List<Modalidade> modalidadesPraticadas;

    @OneToMany(mappedBy = "aluno")
    private List<Pagamento> historicoPagamento;
}
