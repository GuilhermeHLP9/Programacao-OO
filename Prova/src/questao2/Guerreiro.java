package questao2;

public class Guerreiro extends Personagem{
    private String arma;

    public Guerreiro() {
        super();
        this.arma = "Sem arma";
    }

    public Guerreiro(String nome, int nivel, String arma) {
        super(nome, nivel);
        this.setArma(arma);
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    @Override
    public String atacar() {
        return "Guerreiro aatacando com " + arma;
    }

    @Override
    public String toString() {
        return "Guerreiro{" +
                "arma='" + arma + '\'' +
                super.toString() +
                '}';
    }
}
