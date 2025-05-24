package questao2;

import java.util.ArrayList;
import java.util.List;

public class Time {
    private String nome;
    private List<Personagem> personagens;

    public Time() {
        this.nome = "Sem nome";
        this.personagens = new ArrayList<>();
    }

    public Time(String nome) {
        this.setNome(nome);
        this.personagens = new ArrayList<Personagem>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Personagem> getPersonagens() {
        return personagens;
    }

    public void addPersonagem(Personagem personagem) {
        this.personagens.add(personagem);
    }

    public void exibirPersonagens() {
        for (Personagem personagem : personagens) {
            System.out.println(personagem.toString());
        }
    }

    public void resumo(){
        System.out.println("O nome do time é " + getNome() +
                " e possui " + personagens.size()+" personagens.");
    }
}
