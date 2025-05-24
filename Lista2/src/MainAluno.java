import exe2.Aluno;

public class MainAluno {
    public static void main(String[] args) {
        Aluno obj1 = new Aluno(281414, 20, "Guilherme", 9, 9);
        System.out.println(obj1.exibirDetalhes());

        Aluno obj2 = new Aluno();
        obj2.setNroAluno(885469);
        obj2.setIdade(3);
        obj2.setNome("Pedro");
        obj2.setP1(7);
        obj2.setP2(5);
        System.out.println(obj2.exibirDetalhes());

        Aluno obj3 = new Aluno();
        System.out.println(obj3.exibirDetalhes());
    }
}
