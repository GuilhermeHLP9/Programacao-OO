package exe1;

public class Cliente {
    private String nome, nroAgencia, nroConta;
    private float saldo;

    // Metodo Contrutor
    public Cliente() {
        this.nroConta = "111111-1";
        this.nroAgencia = "1111-1";
        this.nome = "Sem nome";
    }

    public Cliente(String nroConta, String nroAgencia, String nome, float saldo) {
        this.setNroConta(nroConta);
        this.setNroAgencia(nroAgencia);
        this.setNome(nome);
        this.setSaldo(saldo);
    }
    // Setters
    public void setNroConta (String nroConta) {
        if (nroConta.length() == 8) {
            if (nroConta.charAt(6) == '-') {
                this.nroConta = nroConta;
            }
            else System.out.println("Problema no DV");
        }
        else System.out.println("Problema no tamanho");
    }

    public void setNroAgencia (String nroAgencia) {
        // Quando um metodo é chamado por um objeto
        // esse metodo é chamado de metodo de instancia
        if (nroAgencia.length() == 6) {
            if (nroAgencia.charAt(4) == '-') {
                this.nroAgencia = nroAgencia;
            }
            else System.out.println("Problema no DV");
        }
        else System.out.println("Problema no tamanho");
    }

    public void setNome(String nome) {
        if (nome.length() <= 30){
            this.nome = nome;
        }
        else System.out.println("Nome invalido");
    }

    public void setSaldo(float saldo) {
        if (saldo >= 0){
            this.saldo = saldo;
        }
        else System.out.println("Saldo negativo");
    }

    // Getters

    public String getNroConta() {
        return nroConta;
    }

    public String getNroAgencia() {
        return nroAgencia;
    }

    public String getNome() {
        return nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void depositar(float x){
        this.setSaldo(this.getSaldo() + x);
    }

    public void sacar(float x){
        this.setSaldo(this.getSaldo() - x);
    }
    public String exibeDetalhes() {
        return "Cliente{" +
                "nroAgencia='" + nroAgencia + '\'' +
                ", nroConta='" + nroConta + '\'' +
                ", nome='" + nome + '\'' +
                ", saldo=" + saldo +
                "}\n";
    }
}
