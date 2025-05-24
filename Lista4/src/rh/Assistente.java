package rh;

public class Assistente extends Funcionario{
    private float horaExtra;

    public Assistente() {
        super(); // chama o metodo da superclasse
    }

    public Assistente(String nome, String endereco, String cpf, float salario, float horaExtra) {
        super(nome, endereco, cpf, salario);
        this.horaExtra = horaExtra;
    }

    public float getHoraExtra() {
        return horaExtra;
    }
    public void setHoraExtra(float horaExtra) {
        this.horaExtra = horaExtra;
    }

    @Override
    public float calculaSalario() {
        return this.salario + (this.horaExtra * 30);
    }

    @Override // anula o metodo herdado
    public String toString() {
        return "Assistente{" +
                "horaExtra=" + horaExtra +
                super.toString() +
                '}';
    }
}
