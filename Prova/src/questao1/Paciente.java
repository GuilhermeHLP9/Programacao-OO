package questao1;

public class Paciente {
    private String nome, cpf;
    private int idade;
    private float peso;

    public Paciente() {
        this.cpf = "000.000.000-00";
        this.nome = "Sem nome";
        this.idade = 0;
        this.peso = 0.0f;
    }

    public Paciente(String nome, String cpf, int idade, float peso) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setIdade(idade);
        this.setPeso(peso);
    }

    //Get e Set


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() > 50) {
            System.out.println("O nome pode ter no maximo 50 caracteres");
        }else {
            this.nome = nome;
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf.length() == 14) {
            if (cpf.charAt(3) == '.') {
                if (cpf.charAt(7) == '.') {
                    if (cpf.charAt(11) == '-') {
                        this.cpf = cpf;
                    }else {
                        System.out.println("Erro na pontuação");
                    }
                }else {
                    System.out.println("Erro na pontuação");
                }
            }else {
                System.out.println("Erro na pontuação");
            }
        }else {
            System.out.println("O cpf deve ter 14 caracteres contando com a pontuação");
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Idade invalida, insira um valor positivo");
        }else {
            this.idade = idade;
        }
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        if (peso <= 0.0f) {
            System.out.println("Peso invalido, insira um valor positivo");
        }else {
            this.peso = peso;
        }
    }

    public void ganharPeso(float quilos){
        this.peso += quilos;
    }

    public void perderPeso(float quilos) {
        if (this.peso < quilos) {
            System.out.println("Valor invalido, quilos precisa ser menor que o peso");
        }else {
            this.peso -= quilos;
        }
    }

    public String exibirPaciente() {
        return "Paciente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", idade=" + idade +
                ", peso=" + peso +
                '}';
    }
}
