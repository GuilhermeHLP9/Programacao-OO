package br.edu.fatecfranca.apirestfulbd.service;

import br.edu.fatecfranca.apirestfulbd.model.Genero;
import br.edu.fatecfranca.apirestfulbd.repository.GeneroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneroService {

    GeneroRepository generoRepository;

    public GeneroService(GeneroRepository generoRepository) {
        this.generoRepository = generoRepository;
    }

    public List<Genero> getGeneros(){
        return generoRepository.findAll();
    }

    public Genero addGenero(Genero genero){
        return generoRepository.save(genero);
    }

    public String removeGenero(Long id){
        if (generoRepository.existsById(id)) {
            generoRepository.deleteById(id);
            return "Genero removido com sucesso!";
        }
        return "Genero nao encontrado!";
    }

    public Genero updateGenero(Long id, Genero novo) {
        Genero recuperado = generoRepository.findById(id).orElse(null);
        if (recuperado != null) {
            recuperado.setNome(novo.getNome());
            generoRepository.save(recuperado);
            return recuperado;
        }
        return null;
    }
}
