package ex2;

import java.time.LocalDate;
import java.util.Date;

public class Voo {
    private int id;
    private LocalDate dataProgramada;
    private String origem, destino;


    public Voo(int id, String origem, String destino, LocalDate dataProgramada) {
        this.setId(id);
        this.setOrigem(origem);
        this.setDestino(destino);
        this.setDataProgramada(dataProgramada);
    }

    public Voo() {
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public LocalDate getDataProgramada() {
        return dataProgramada;
    }
    public void setDataProgramada(LocalDate dataProgramada) {
        this.dataProgramada = dataProgramada;
    }
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public String getOrigem() {
        return origem;
    }
    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String toString() {
        return "Voo{" +
                "id=" + id +
                ", date=" + dataProgramada +
                ", origem='" + origem + '\'' +
                ", destino='" + destino + '\'' +
                '}';
    }


}
