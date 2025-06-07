package br.edu.fatecfranca.exapidbrl.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String area;
    @OneToMany(mappedBy = "curso", cascade = CascadeType.ALL)
    private List<Aluno> alunos;

    public Curso() {
    }

    public Curso(Long id, String nome, String area) {
        this.id = id;
        this.nome = nome;
        this.area = area;
        this.alunos = new ArrayList<>();
    }

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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void addAlunos(Aluno alunos) {
        this.alunos.add(alunos);
    }
}
