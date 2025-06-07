package br.edu.fatecfranca.exapidbrl.service;

import br.edu.fatecfranca.exapidbrl.model.Curso;
import br.edu.fatecfranca.exapidbrl.repository.CursoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {
    CursoRepository cursoRepository;

    public CursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    public List<Curso> getCurso() {
        return cursoRepository.findAll();
    }

    public Curso addCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    public String removeCurso(Long id) {
        if (cursoRepository.existsById(id)) {
            cursoRepository.deleteById(id);
            return "Curso removido com sucesso!";
        }
        return "Curso nao encontrado!";
    }

    public Curso updateCurso(Long id, Curso novo) {
        Curso recuperado = cursoRepository.findById(id).orElse(null);
        if (recuperado != null) {
            recuperado.setNome(novo.getNome());
            recuperado.setArea(novo.getArea());
            cursoRepository.save(recuperado);
            return recuperado;
        }
        return null;
    }
}
