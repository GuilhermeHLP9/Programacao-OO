package exe1;
public class Aluno {
    public int nroAluno, idade; //tipo primitivo
    public float p1, p2; // tipo primitivo
    public String nome; // tipo de uma classe

    public Aluno() {
        this.nome = "sem nome";
    }

    public Aluno(int nroAluno, String nome, int idade, float p1, float p2) {
        this.nroAluno = nroAluno;
        this.nome = nome;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
    }

    public void dadosAluno() {
    System.out.println("Nro  do aluno: " + this.nroAluno + " Nome: " + this.nome + " idade: " + this.idade + " p1: " + this.p1 + " p2: " + this.p2 + " Situação: " + this.passou());
    }

    public float notaFinal() {
        return (this.p1 + this.p2) / 2;
    }

    public String passou(){
        // Operador ternario
        return(this.notaFinal() >= 6) ? "Passou" : "Não Passou";
        }
}
