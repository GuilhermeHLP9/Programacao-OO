package questao2;

public class Mago extends Personagem{
    private String elemento;

    public Mago() {
        super();
        this.elemento = "Sem elemento";
    }

    public Mago(String nome, int nivel, String elemento) {
        super(nome, nivel);
        this.setElemento(elemento);
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    @Override
    public String atacar() {
        return "Mago conjurando magia de " + elemento;
    }

    @Override
    public String toString() {
        return "Mago{" +
                "elemento='" + elemento + '\'' +
                super.toString() +
                '}';
    }
}
