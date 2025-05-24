import rh.Assistente;
import rh.Diretor;
import rh.Funcionario;
import rh.Gerente;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void mostraDadosDetalhados(Funcionario obj) {
        System.out.println(obj.toString() + "Salario final: " + obj.calculaSalario());
    }
    public static void main(String[] args) {

        Assistente assistente = new Assistente("João", "Franca", "123", 3000, 10);
        mostraDadosDetalhados(assistente);
        Gerente gerente = new Gerente("Pedro", "São Joaquim da Barra", "456", 5000, 2000);
        mostraDadosDetalhados(gerente);
        Diretor diretor = new Diretor("Vitor", "Claraval", "789", 7000, 1000);
        mostraDadosDetalhados(diretor);

        // vetor de funcionarios
        List<Funcionario> vetor = new ArrayList<Funcionario>();
        // adiciona no vetor
        vetor.add(assistente);
        vetor.add(gerente);
        vetor.add(diretor);

        //Calculo folha de pagamento

        float folha = 0;

        for (Funcionario funcionario : vetor) {
            folha += funcionario.calculaSalario();
        }
        System.out.println(folha);


    }
}