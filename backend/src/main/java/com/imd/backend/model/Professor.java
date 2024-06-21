package com.imd.backend.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String contato;
    private String tipoGraduacao;
    private String nivelGraduacao;

    @ElementCollection
    private List<String> modalidadesEnsinadas;

    @OneToMany(mappedBy = "professorResponsavel")
    private List<Turma> turmasLecionadas;
}
