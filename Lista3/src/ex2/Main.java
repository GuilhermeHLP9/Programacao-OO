package ex2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Passageiro p1 = new Passageiro(1, "Carlos", "123");
        // vamos definir a data da reserva
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate objData = LocalDate.parse("28/03/2025", formatter);

        Voo vo1 = new Voo(11, "Campinas", "Salvador", objData);

        Reserva re1 = new Reserva(111, 7, vo1, p1, new Date());

        vo1.setDataProgramada(objData);
        System.out.println(re1.toString());

        re1.validadeExpirada();
    }
}
