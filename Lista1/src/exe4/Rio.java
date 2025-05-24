package exe4;
public class Rio {
    public String nome;
    public float nivel;
    public boolean poluido;

    // Construtor sem parametro
    public Rio(){
        this.nome = "sem nome";
    }

    //construtor com parametro
    public Rio(String nome, float nivel, boolean poluido){
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }

    public void chover (float x){
        this.nivel += x;
    }

    public void ensolarar (float x){
        if (this.nivel >= x){
            this.nivel -= x;
        }
        else{
            System.out.println("Nivel do rio continua inalterado");
        }
    }

    public void limpar(){
        this.poluido = false;
    }

    public void sujar(){
        this.poluido = true;
    }

    public String mostra(){
        return "Nome: " + this.nome + "Nivel: " + this.nivel + "Poluido: " + (this.poluido ? "Sim" : "Nao");
    }
}
