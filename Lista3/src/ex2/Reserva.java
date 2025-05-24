package ex2;

import java.util.Date;

public class Reserva{
    private int id, validade;
    private Date data;
    private Voo voo;
    private Passageiro passageiro;

    public Reserva(int id, int validade, Voo voo, Passageiro passageiro, Date data) {
        this.setId(id);
        this.setValidade(validade);
        this.setVoo(voo);
        this.setPassageiro(passageiro);
        this.setData(data);
    }

    public Reserva() {
        this.voo = new Voo();
        this.passageiro = new Passageiro();
    }

    public Voo getVoo() {
        return voo;
    }
    public void setVoo(Voo voo) {
        this.voo = voo;
    }
    public Passageiro getPassageiro() {
        return passageiro;
    }
    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getValidade() {
        return validade;
    }
    public void setValidade(int validade) {
        this.validade = validade;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }

    public String toString() {
        return "Reserva{" +
                "id=" + id +
                ", validade=" + validade +
                ", data=" + data +
                ", voo=" + voo +
                ", passageiro=" + passageiro +
                '}';
    }

    public void validadeExpirada() {
        if (this.getValidade() > 0) {
            System.out.println("Dentro da validade");
        }else {
            System.out.println("Fora da validade");
        }
    }
}
