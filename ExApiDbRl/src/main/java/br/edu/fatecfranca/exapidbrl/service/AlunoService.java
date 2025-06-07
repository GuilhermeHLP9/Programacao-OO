package br.edu.fatecfranca.exapidbrl.service;

import br.edu.fatecfranca.exapidbrl.model.Aluno;
import br.edu.fatecfranca.exapidbrl.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {
    AlunoRepository alunoRepository;
    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public List<Aluno> getAlunos() {
        return alunoRepository.findAll();
    }

    public Aluno addAlunos(Aluno alunos) {
        return alunoRepository.save(alunos);
    }

    public String removeAlunos(Long id) {
        if (alunoRepository.existsById(id)) {
            alunoRepository.deleteById(id);
            return "Aluno removido com sucesso!";
        }
        return "Aluno não encontrado!";
    }

    public Aluno updateAlunos(Aluno novo, Long id) {
        Aluno recuperado = alunoRepository.findById(id).orElse(null);
        if (recuperado != null) {
            recuperado.setNome(novo.getNome());
            recuperado.setIdade(novo.getIdade());
            recuperado.setEmail(novo.getEmail());
            recuperado.setCurso(novo.getCurso());
            alunoRepository.save(recuperado);
            return recuperado;
        }
        return null;
    }
}
