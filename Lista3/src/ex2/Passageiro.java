package ex2;

public class Passageiro {
    private int id;
    private String nome, cpf;

    public Passageiro(int id, String nome, String cpf) {
        this.setId(id);
        this.setNome(nome);
        this.setCpf(cpf);
    }

    public Passageiro() {
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String toString() {
        return "Passageiro{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}