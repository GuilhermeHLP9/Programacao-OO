package Musica;

import java.util.ArrayList;
import java.util.List;

public class Recital {
    private String tema;
    private List<Musico> musicos;

    public Recital() {
        this.musicos = new ArrayList<Musico>();
        this.tema = "Sem Tema";
    }

    public Recital(String tema) {
        this.tema = tema;
        this.musicos = new ArrayList<Musico>();
    }

    public String getTema() {
        return tema;
    }
    public void setTema(String tema) {
        this.tema = tema;
    }
    public List<Musico> getMusicos() {
        return musicos;
    }

    public void addMusico(Musico m) {
        this.musicos.add(m);
    }

    public void apresentarTodos() {
        for (Musico obj : musicos) {
            System.out.println(obj.tocar());
        }
    }

    public String resumoRecital (){
        for (Musico obj : musicos) {
            System.out.println(obj.tocar());
        }
        return "Quantidade de Musicos : " + this.musicos.size() + "Tema: " + this.tema;
    }
}
