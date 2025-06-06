package br.edu.fatecfranca.apirestfulbd.controller;

import br.edu.fatecfranca.apirestfulbd.model.Livro;
import br.edu.fatecfranca.apirestfulbd.service.LivroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livro")
public class LivroController {
    // injeção de dependencia
    LivroService livroService;
    public LivroController(LivroService livroService) {
        this.livroService = livroService;
    }
    @GetMapping
    public List<Livro> getLivros() {
        return livroService.getLivros();
    }

    @PostMapping
    public Livro addLivro(@RequestBody Livro livro) {
        return livroService.addLivro(livro);
    }

    @DeleteMapping("/{id}")
    public String removeLivro(@PathVariable Long id) {
        return livroService.removeLivro(id);
    }

    @PutMapping("/{id}")
    public Livro updateLivro(@PathVariable Long id, @RequestBody Livro novo) {
        return livroService.updateLivro(id, novo);
    }
}
