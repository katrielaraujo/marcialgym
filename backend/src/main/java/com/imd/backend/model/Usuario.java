package com.imd.backend.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@MappedSuperclass
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    protected String nome;
    protected String contato;
    protected Date dataNascimento;
    protected String email;
    protected String senha;

    @Enumerated(EnumType.STRING)
    protected TipoUsuario tipoUsuario;
}
