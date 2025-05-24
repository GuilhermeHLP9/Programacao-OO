package exe0;
public class Carro {

    // modificador
    private String marca;
    private String modelo;
    private int ano;
    private float velocidade;

    public Carro(){
        this.marca = "Sem Marca";
        this.modelo = "Sem Modelo";
    }
    public Carro(String marca, String modelo, int ano, float velocidade){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setAno(ano);
        this.setVelocidade(velocidade);
    }

    // Getters
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getAno() {
        return ano;
    }
    public float getVelocidade() {
        return velocidade;
    }

    // Setters
    public void setVelocidade(float velocidade) {
        //isso é encapsular
        if (velocidade >= 0){
            this.velocidade = velocidade;
        }
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setAno(int ano) {
        if (ano >= 0){
            this.ano = ano;
        }else{
            System.out.println("O ano deve ser maior que 0");
        }
    }
    // acelera o carro
    public void acelerar(float x){
        this.setVelocidade(this.velocidade + x);
        this.verificarVelocidade();
    }
    // frea o carro
    public void frear(float x){
        this.setVelocidade(this.velocidade - x);
    }

    public String exibirDados(){
        return "\nMarca: " + this.marca +
                "\nModelo: " + this.modelo +
                "\nAno: " + this.ano +
                "\nVelocidade: " + this.velocidade;
    }

    // verifica se o carro ultrapassou 200 km/h
    private void verificarVelocidade(){
        if (this.velocidade > 200) {
            this.velocidade = 200;
            System.out.println("\nVelocidade não pode ultrapassar os 200");
        }
    }
}
