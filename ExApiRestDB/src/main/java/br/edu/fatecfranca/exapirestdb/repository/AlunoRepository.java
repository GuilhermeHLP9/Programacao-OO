package br.edu.fatecfranca.exapirestdb.repository;

import br.edu.fatecfranca.exapirestdb.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
