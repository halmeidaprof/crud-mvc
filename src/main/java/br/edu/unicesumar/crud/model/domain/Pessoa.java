package br.edu.unicesumar.crud.model.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "ES_PESSOA")  // para tabelas com nome diferente da entidade
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    @Column(name = "doc", length = 14) // se necessário, informar atribuições para a coluna
    private String documento;


    public Pessoa(Long id, String nome, String documento) {
        this.id = id;
        this.nome = nome;
        this.documento = documento;
    }

    public Pessoa() {
    }

    // getters e setters necessários para serializar e deserializar a classe para json

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
}
