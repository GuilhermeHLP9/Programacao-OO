import ex0.Product;
import ex0.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Product produto1 = new Product(1, "Raquete", 300.0);
        Product produto2 = new Product(2, "Bolinha", 10.0);

//        CarItem carrinho1 = new CarItem(11,5, produto1);
//        CarItem carrinho2 = new CarItem(12,10, produto2);
//
//        System.out.println(carrinho1.exibeCarItem());
//        System.out.println(carrinho2.exibeCarItem());

        ShoppingCart shoppingCart1 = new ShoppingCart(111, "Franca");
        shoppingCart1.addCarItem(11,5, produto1);
        shoppingCart1.addCarItem(12,10, produto2);

        System.out.println(shoppingCart1.toString());
    }
}