package br.edu.fatecfranca.apirestfulbd.service;

import br.edu.fatecfranca.apirestfulbd.model.Livro;
import br.edu.fatecfranca.apirestfulbd.repository.LivroRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService {
    // injeção de dependência → serve para dse utilizar um objeto
    // sem precisar instanciá-lo
    LivroRepository livroRepository;
    public LivroService(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }
    public List<Livro> getLivros() {
        return livroRepository.findAll(); // select * from livro
    }

    public Livro addLivro(Livro livro) {
        return livroRepository.save(livro); // insert into livro
    }

    public String removeLivro(Long id) {
        if (livroRepository.existsById(id)) {
            livroRepository.deleteById(id);
            return "Livro removido com sucesso!";
        }
        return "Livro não encontrado!";
    }

    public Livro updateLivro(Long id, Livro novo) {
        // verifica se o livro existe, se existe retorna o livro, seão null
        Livro recuperado = livroRepository.findById(id).orElse(null);
        if (recuperado != null) {
            recuperado.setTitulo(novo.getTitulo());
            recuperado.setAutor(novo.getAutor());
            recuperado.setEditora(novo.getEditora());
            recuperado.setGenero(novo.getGenero());
            livroRepository.save(recuperado); // recuperado tem ‘id’, portanto, atualiza
            return recuperado;
        }
        return null; // não encontrou o livro
    }
}
