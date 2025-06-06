package br.edu.fatecfranca.exercicioapi.controller;

import br.edu.fatecfranca.exercicioapi.model.Livro;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/livro")
public class LivroController {
     List<Livro> livros = new ArrayList<Livro>();

     @GetMapping
     public List<Livro> getLivros() {
         return this.livros;
     }

     @PostMapping
    public Livro addLivro(@RequestBody Livro livro) {
         this.livros.add(livro);
         return livro;
     }

     @DeleteMapping("/{id}")
    public String deleteLivro(@PathVariable Long id) {
         boolean resp = this.livros.removeIf(livro -> livro.getId() == id);
         if (resp) {
             return "Livro removido com sucesso!";
         }
         else {
             return "Livro não encontrado!";
         }
     }

     @PutMapping("/{id}")
    public Livro updateLivro(@RequestBody Livro novo, @PathVariable Long id) {
         for (Livro livro : this.livros) {
             if (livro.getId() == id) {
                 livro.setTitulo(novo.getTitulo());
                 livro.setDiretor(novo.getDiretor());
                 livro.setAno(novo.getAno());
                 livro.setNota(novo.getNota());
                 return livro;
             }
         }
         return null;
     }
}
