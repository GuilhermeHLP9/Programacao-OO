package br.edu.fatecfranca.apirestfulbd.repository;

// uma inteface é uma classe especiial, onde todos os metodos
// são abstratos, ou seja, não são implementados

import br.edu.fatecfranca.apirestfulbd.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

// uma inteface pode herdar de outra inteface, neste caso,
// vai herdar de JpaRepository, que precisamos indicar qual
// classe que será utilizada pelos metodos do CRUD

public interface LivroRepository extends JpaRepository<Livro, Long> {
    // a interface LivroRepository vai conter os metodos
    // de CRUD vinculados ao livro, exemplos:
    // findAll, save, findById, etc
}
