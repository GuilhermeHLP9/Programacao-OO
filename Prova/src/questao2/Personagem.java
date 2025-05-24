package questao2;

public abstract class Personagem {
    protected String nome;
    protected int nivel;

    public Personagem() {
        this.nome = "Sem nome";
    }

    public Personagem(String nome, int nivel) {
        this.setNome(nome);
        this.setNivel(nivel);
    }

    public abstract String atacar();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", nivel=" + nivel + '\'' +
                ", ataque=" + atacar() +
                '}';
    }
}
