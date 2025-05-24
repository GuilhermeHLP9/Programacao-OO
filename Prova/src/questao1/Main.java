package questao1;

public class Main {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente("Guilherme", "123.456.789-00", 40, 95.8f);
        System.out.println(paciente1.exibirPaciente());
        paciente1.ganharPeso(20);
        System.out.println(paciente1.exibirPaciente());
        paciente1.perderPeso(30);
        System.out.println(paciente1.exibirPaciente() + "\n");

        Paciente paciente2 = new Paciente();
        paciente2.setNome("Pedro");
        paciente2.setCpf("123.456.789-00");
        paciente2.setIdade(30);
        paciente2.setPeso(75f);
        System.out.println(paciente2.exibirPaciente());
        paciente2.ganharPeso(10);
        System.out.println(paciente2.exibirPaciente());
        paciente2.perderPeso(60);
        System.out.println(paciente2.exibirPaciente() + "\n");

        Paciente paciente3 = new Paciente();
        System.out.println(paciente3.exibirPaciente());
    }
}