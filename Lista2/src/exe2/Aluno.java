package exe2;
public class Aluno {
    private int nroAluno, idade;
    private String nome;
    private float p1, p2;

    public Aluno() {
        this.nome = "Sem nome";

    }

    public Aluno(int nroAluno, int idade, String nome, float p1, float p2) {
        this.setNroAluno(nroAluno);
        this.setIdade(idade);
        this.setNome(nome);
        this.setP1(p1);
        this.setP2(p2);
    }

    // Setters
    public void setNroAluno(int nroAluno) {
        //Converte int para String
        // Quando o mettodo é chamado por uma
        // classe esse metodo é um metodo de classe
        String aux = String.valueOf(nroAluno);
        if (aux.length() == 6) {
            this.nroAluno = nroAluno;
        }
        else System.out.println("Numero do aluno invalido");
    }
    public void setNome(String nome){
        if (nome.length() <= 30){
            this.nome = nome;
        }
        else System.out.println("Nome invalido");
    }
    public void setIdade(int idade){
        if (idade >= 0){
            this.idade = idade;
        }
        else System.out.println("Idade invalido");
    }
    public void setP1(float p1){
        if (p1 >= 0){
            this.p1 = p1;
        }
        else System.out.println("P1 invalido");
    }
    public void setP2(float p2){
        if (p2 >= 0){
            this.p2 = p2;
        }
        else System.out.println("P2 invalido");
    }

    public int getNroAluno() {
        return nroAluno;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public float getP1() {
        return p1;
    }

    public float getP2() {
        return p2;
    }

    public String exibirDetalhes(){
        return "Nro do aluno: " + this.nroAluno +
                "\nIdade: " + this.idade +
                "\nNome: " + this.nome +
                "\nP1: " + this.p1 +
                "\nP2: " + this.p2;
    }
}
