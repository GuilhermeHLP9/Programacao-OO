package br.edu.fatecfranca.apirestfulbd.controller;

import br.edu.fatecfranca.apirestfulbd.model.Genero;
import br.edu.fatecfranca.apirestfulbd.service.GeneroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/genero")
public class GeneroController {
    GeneroService generoService;
    public GeneroController(GeneroService generoService) {
        this.generoService = generoService;
    }
    @GetMapping
    public List<Genero> getGeneros(){
        return generoService.getGeneros();
    }
    @PostMapping
    public Genero addGenero(@RequestBody Genero genero) {
        return generoService.addGenero(genero);
    }
    @DeleteMapping("/{id}")
    public String removeGenero(@PathVariable Long id) {
        return generoService.removeGenero(id);
    }

    @PutMapping("/{id}")
    public Genero updateGenero(@PathVariable Long id, @RequestBody Genero novo) {
        return generoService.updateGenero(id, novo);
    }
}