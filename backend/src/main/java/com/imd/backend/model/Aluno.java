package com.imd.backend.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String contato;
    private Date dataNascimento;
    private String nivelGraduacao;

    @ElementCollection
    private List<String> modalidadesPraticadas;

    @OneToMany(mappedBy = "aluno")
    private List<Pagamento> historicoPagamento;
}
