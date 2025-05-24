package ex0;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShoppingCart {
    private int id;
    private Date date;
    private float finalPrice;
    private String address;
    private List<CarItem> carItens;

    public ShoppingCart() {
        this.date = new Date();
        this.address = "No address";
        // aloca espaço para o vetor
        this.carItens = new ArrayList<CarItem>();
    }

    public ShoppingCart(int id, String address) {
        this.setId(id);
        this.date = new Date();
        this.setAddress(address);
        this.carItens = new ArrayList<CarItem>();
    }

    // get
    public int getId() {
        return id;
    }
    public Date getDate() {
        return date;
    }
    public float getFinalPrice() {
        return finalPrice;
    }
    public String getAddress() {
        return address;
    }
    public List<CarItem> getCarItens() {
        return carItens;
    }

    // set
    public void setId(int id) {
        this.id = id;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public void setFinalPrice(float finalPrice) {
        this.finalPrice = finalPrice;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    //Não pode ser implementado pois estamos em uma composição
//    public void setCarItens(List carItens) {
//        this.carItens = carItens;
//    }
    public void addCarItem(int id, float qunatity, Product product) {
        this.carItens.add(new CarItem(id, qunatity, product));
        this.calulateFinalPrice();
    }

    public void calulateFinalPrice() {
        double soma = 0;
        for (CarItem obj: this.carItens) {
            soma += obj.getProduct().getPrice() * obj.getQuantity();
        }
        this.finalPrice = (float) soma;
    }

    public String toString() {
        return "ShoppingCart{" +
                "id=" + id +
                ", date=" + date +
                ", finalPrice=" + finalPrice +
                ", address='" + address + '\'' +
                ", carItens=\n" + carItens +
                '}';
    }
}
