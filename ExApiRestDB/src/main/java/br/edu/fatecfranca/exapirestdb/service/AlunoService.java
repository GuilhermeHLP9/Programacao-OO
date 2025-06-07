package br.edu.fatecfranca.exapirestdb.service;

import br.edu.fatecfranca.exapirestdb.model.Aluno;
import br.edu.fatecfranca.exapirestdb.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {
    AlunoRepository AlunoRepository;

    public AlunoService(AlunoRepository AlunoRepository) {
        this.AlunoRepository = AlunoRepository;
    }

    public List<Aluno> getAlunos() {
        return AlunoRepository.findAll();
    }

    public Aluno addAluno(Aluno aluno) {
        return AlunoRepository.save(aluno);
    }

    public String removeAluno(Long id) {
        if (AlunoRepository.existsById(id)) {
            AlunoRepository.deleteById(id);
            return "Aluno removido com sucesso!";
        }
        return "Aluno não encontrado!";
    }

    public Aluno updateAluno(Long id, Aluno novo) {
        Aluno recuperado = AlunoRepository.findById(id).orElse(null);
        if (recuperado != null) {
            recuperado.setNome(novo.getNome());
            recuperado.setCurso(novo.getCurso());
            recuperado.setIdade(novo.getIdade());
            AlunoRepository.save(recuperado);
            return recuperado;
        }
        return null;
    }
}
