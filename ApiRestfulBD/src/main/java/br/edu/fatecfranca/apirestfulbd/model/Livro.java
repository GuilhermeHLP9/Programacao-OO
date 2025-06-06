package br.edu.fatecfranca.apirestfulbd.model;

import jakarta.persistence.*;

@Entity// a classe vai ser mapeada em uma tabela

public class Livro {
    @Id // chave primaria(identifica unicamente um livro)
    // o id será gerado automaticamente, na sequencia
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String autor;
    private String editora;
    // relaciona com o genero
    @ManyToOne
    @JoinColumn(name = "genero_id")
    private Genero genero;

    public Livro() {
    }

    public Livro(Long id, String titulo, String autor, String editora) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getEditora() {
        return editora;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}
