package com.imd.backend.controller;

import com.imd.backend.model.Aluno;
import com.imd.backend.model.Professor;
import com.imd.backend.model.Usuario;
import com.imd.backend.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/register/professor")
    public String registerProfessor(@RequestBody Professor professor){
        professor.setSenha(passwordEncoder.encode(professor.getSenha()));
        usuarioRepository.save(professor);
        return "Professor registrado com sucesso";
    }

    @PostMapping("/register/aluno")
    public String registerAluno(@RequestBody Aluno aluno){
        aluno.setSenha(passwordEncoder.encode(aluno.getSenha()));
        usuarioRepository.save(aluno);
        return "Aluno registrado com sucesso!";
    }

    @PostMapping("/login")
    public String login(@RequestBody Usuario usuario){
        return "Login bem-sucedido!";
    }
}
