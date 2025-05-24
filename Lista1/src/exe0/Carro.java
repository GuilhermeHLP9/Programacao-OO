package exe0;

import javax.swing.*;

public class Carro {
    //variavies
    //dados primitivos
    public int ano;
    public float velocidade;
    //dados são classes
    public String marca, modelo;

    //Método construtor
    public Carro(){
        this.marca = "Marca não definida";
        this.modelo = "Modelo nâo definido";
    }
    public Carro(int ano, float velocidade, String marca, String modelo){
        this.ano = ano;
        this.velocidade = velocidade;
        this.marca = marca;
        this.modelo = modelo;
    }
    //Métodos
    public void exibirDetalhes() {
        // This representa o objeto que chama o método
        JOptionPane.showMessageDialog(null, "Marca: " + this.marca +
                "\n Modelo: " + this.modelo +
                "\n Ano: " + this.ano +
                "\n Velocidade: " + this.velocidade);
    }

    // Acelerar o carro de x unidades
    public void acelerar(float x){
        this.velocidade = this.velocidade + x;
    }

    // frear o carro em x uniddades
    // velocidade não pode ficar negativa após a frenagem
    public void frear(float x) {
        if (this.velocidade >= x) {
            this.velocidade -= x;
        }
        else {
            JOptionPane.showMessageDialog(null,"Velocicade não pode ser negativa");
        }
    }
}

