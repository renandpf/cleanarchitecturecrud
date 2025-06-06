package br.com.cleanarchitecture.crud.adapter.persistence;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "usuarios")
public class UsuarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cpf;
    private String nome;
    private LocalDate nascimento;
    private String email;
    private String telefone;

    public UsuarioEntity(String cpf, String nome, LocalDate nascimento, String email, String telefone) {
        this.cpf = cpf;
        this.nome = nome;
        this.nascimento = nascimento;
        this.email = email;
        this.telefone = telefone;
    }

    public UsuarioEntity() {

    }
}
