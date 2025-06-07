package br.edu.fatecfranca.exapidbrl.controller;

import br.edu.fatecfranca.exapidbrl.model.Aluno;
import br.edu.fatecfranca.exapidbrl.service.AlunoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aluno")
public class AlunoController {
    AlunoService alunoService;
    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @GetMapping
    public List<Aluno> getAlunos() {
        return alunoService.getAlunos();
    }

    @PostMapping
    public Aluno adAlunos(@RequestBody Aluno aluno) {
        return alunoService.addAlunos(aluno);
    }

    @DeleteMapping("/{id}")
    public String removeAluno(@PathVariable Long id) {
        return alunoService.removeAlunos(id);
    }

    @PutMapping("/{id}")
    public Aluno updateAluno(@PathVariable Long id, @RequestBody Aluno novo) {
        return alunoService.updateAlunos(novo, id);
    }
}
