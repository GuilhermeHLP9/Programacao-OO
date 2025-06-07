package br.edu.fatecfranca.exapidbrl.controller;

import br.edu.fatecfranca.exapidbrl.model.Curso;
import br.edu.fatecfranca.exapidbrl.service.CursoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/curso")
public class CursoController {
    CursoService cursoService;
    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    @GetMapping
    public List<Curso> getCurso() {
        return cursoService.getCurso();
    }

    @PostMapping
    public Curso addCurso(@RequestBody Curso curso) {
        return cursoService.addCurso(curso);
    }

    @DeleteMapping("/{id}")
    public String removeCurso(@PathVariable Long id) {
        return cursoService.removeCurso(id);
    }

    @PutMapping("/{id}")
    public Curso updateCurso(@PathVariable Long id, @RequestBody Curso novo) {
        return cursoService.updateCurso(id, novo);
    }
}
