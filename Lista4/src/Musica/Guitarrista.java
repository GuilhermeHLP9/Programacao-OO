package Musica;

public class Guitarrista extends Musico {
    private String tipoGuitarra;

    public Guitarrista() {
        super();
        this.tipoGuitarra = "Sem tipo";
    }

    public Guitarrista(String nome, int idade, String tipoGuitarra) {
        super(nome, idade);
        this.tipoGuitarra = tipoGuitarra;
    }

    public String getTipoGuitarra() {
        return tipoGuitarra;
    }
    public void setTipoGuitarra(String tipoGuitarra) {
        this.tipoGuitarra = tipoGuitarra;
    }

    @Override
    public String tocar() {
        return "Guitarrista tocando solo de guitarra " + tipoGuitarra;
    }

    @Override
    public String toString() {
        return "Guitarrista{" +
                super.toString() +
                "tipoGuitarra='" + tipoGuitarra + '\'' +
                '}';
    }
}
