import exe3.Produto;

public class MainProduto {
    public static void main(String[] args) {
        Produto obj1 = new Produto();
        obj1.comprar(10);
        obj1.vender(3);
        obj1.subir(872.5f);
        obj1.abaixar(34.5f);
        obj1.mostra();

        Produto obj2 = new Produto(10, "Bola de basquete", 2, 510);
        obj2.comprar(10);
        obj2.vender(15);
        obj2.subir(30f);
        obj2.abaixar(600f);
        obj2.mostra();
    }
}
