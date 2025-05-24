package questao2;

public class Main {
    public static void main(String[] args) {
        Guerreiro guerreiro = new Guerreiro("Gustavo", 10, "Espada");
        Arqueiro arqueiro = new Arqueiro("Lara", 12,50);
        Mago mago = new Mago("Otavio", 14, "Fogo");

        Time time = new Time("Barbaros");

        time.addPersonagem(guerreiro);
        time.addPersonagem(arqueiro);
        time.addPersonagem(mago);

        time.exibirPersonagens();
        time.resumo();
    }
}
