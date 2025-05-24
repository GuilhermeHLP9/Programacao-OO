import exe1.Cliente;

public class MainCliente {
    public static void main(String[] args) {
        Cliente obj1 = new Cliente();
        obj1.setNroConta("123456-7");
        obj1.setNroAgencia("1234-5");
        obj1.setNome("Maria");
        obj1.setSaldo(1500);
        System.out.println("Nro Conta:" + obj1.getNroConta());
        obj1.depositar(1500);
        obj1.sacar(200);
        System.out.println(obj1.exibeDetalhes());

        Cliente obj2 = new Cliente("836-x", "1284-2", "Pedro", -300);
        System.out.println(obj2.exibeDetalhes());

        Cliente obj3 = new Cliente();
        System.out.println(obj3.exibeDetalhes());
    }
}
