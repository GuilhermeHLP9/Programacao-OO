package br.edu.fatecfranca.exapidbrl.repository;

import br.edu.fatecfranca.exapidbrl.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
