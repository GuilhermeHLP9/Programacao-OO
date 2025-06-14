package Musica;

public abstract class Musico {
    protected String nome;
    protected int idade;

    public Musico() {
        this.nome = "Sem nome";
    }

    public Musico(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public abstract String tocar();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Musico{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
