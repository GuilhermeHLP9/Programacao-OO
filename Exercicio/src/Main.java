public class Main {
    public static void main(String[] args) {
        //Criação dos objetos

        Jogos obj1 = new Jogos();

        obj1.nome_j = "Resident Evil";
        obj1.preco = 350.00 ;
        obj1.q_estoque = 50;
        obj1.plataforma = "Xbox Series S";
        obj1.exibir();

        Jogos obj2 = new Jogos("Spiderman",299.99,23,"Playstation");
        obj2.exibir();

        Jogos obj3 = new Jogos();
        obj3.exibir();
    }
}