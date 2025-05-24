package questao2;

public class Arqueiro extends Personagem{
    private int flechas;

    public Arqueiro() {
        super();
    }

    public Arqueiro(String nome, int nivel, int flechas) {
        super(nome, nivel);
        this.setFlechas(flechas);
    }

    public int getFlechas() {
        return flechas;
    }

    public void setFlechas(int flechas) {
        this.flechas = flechas;
    }

    @Override
    public String atacar() {
        return "Arqueiro disparando " + flechas + " flechas";
    }

    @Override
    public String toString() {
        return "Arqueiro{" +
                "flechas=" + flechas +
                super.toString() +
                '}';
    }
}
