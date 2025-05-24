package ex0;

public class CarItem {
    private int id;
    private float quantity;
    // associção tode-parte
    private Product product;

    public CarItem(int id, float qunatity, Product product) {
        this.setId(id);
        this.setQuantity(qunatity);
        this.setProduct(product);
    }

    public CarItem() {
    }

    // get

    public int getId() {
        return id;
    }

    public float getQuantity() {
        return quantity;
    }

    public Product getProduct() {
        return product;
    }

    //set

    public void setId(int id) {
        this.id = id;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String toString() {
        return "\nCarItem{" +
                "id=" + id +
                ", quantity=" + quantity +
                ", product=" + product +
                '}';
    }
}
