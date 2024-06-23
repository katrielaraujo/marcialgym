package com.imd.backend.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
public class Professor extends Usuario{
    @ManyToMany
    @JoinTable(
            name = "professor_modalidade",
            joinColumns = @JoinColumn(name = "professor_id"),
            inverseJoinColumns = @JoinColumn(name = "modalidade_id")
    )
    private List<Modalidade> modalidadesEnsinadas;

    @OneToMany(mappedBy = "professorResponsavel")
    private List<Turma> turmasLecionadas;
}
