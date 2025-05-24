public class Jogos {
    //Dados primitivas
    public double preco;
    public int q_estoque;

    //Dados de classe
    public String nome_j, plataforma;

    // Metodo construtor

    public Jogos() {
        this.nome_j = "Nenhum jogo informado";
        this.plataforma = "Nenhum plataforma";
    }

    public Jogos(String nome_j, double preco, int q_estoque, String plataforma) {
        this.nome_j = nome_j;
        this.preco = preco;
        this.q_estoque = q_estoque;
        this.plataforma = plataforma;
    }

    //Metodo
    public void exibir() {
        System.out.println("\nJogo: " + nome_j+
                "\n Preço: " + preco+
                "\n Plataforma: " + plataforma+
                "\n Quantidade: " + q_estoque);
    }
}
