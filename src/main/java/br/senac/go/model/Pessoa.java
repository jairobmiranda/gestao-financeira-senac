package br.senac.go.model;

import jakarta.persistence.*;
import lombok.Data;

@Data // faz os metodos getters, setters, tostring, hascode, equals
@Entity // Fala para o ORM gerenciar o estado deste item no banco de dados
@Table(name = "PESSOA") // nomeia a tabela do banco de dados

public class Pessoa {
    @Id // fala que este item é chave primária
    @GeneratedValue(strategy = GenerationType.AUTO) // auto-incremento
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NOME", length = 120, nullable = false) // nomeia o nome da coluna para maiúsculo
    private String nome;

    @Column(name = "ENDERECO")
    private String endereco;

}