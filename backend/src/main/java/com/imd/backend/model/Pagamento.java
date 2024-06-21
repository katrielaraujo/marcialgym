package com.imd.backend.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;

    private double valor;
    private Date dataVencimento;
    private Date dataPagamento;
    private String status;
    private String qrCodePix;
}
