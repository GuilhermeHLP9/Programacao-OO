package Musica;

public class Main {
    public static void main(String[] args) {
        Guitarrista guitarrista1 = new Guitarrista("Doulgas", 20, "Eletrica");
        Baterista baterista1 = new Baterista("Carlos", 24, 5);
        Pianista pianista1 = new Pianista("Julio", 30,false);

        Recital recital1 = new Recital("Sexta-feira santa");

        recital1.addMusico(guitarrista1);
        recital1.addMusico(baterista1);
        recital1.addMusico(pianista1);

        System.out.println(recital1.resumoRecital());
    }
}
