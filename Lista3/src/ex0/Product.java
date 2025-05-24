package ex0;
public class Product {
    private int id;
    private String description;
    private double price;

    public Product(int id, String description, double price) {
        this.setId(id);
        this.setDescription(description);
        this.setPrice(price);
    }

    public Product() {
        this.description = "No Description";
    }

    //get

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    //set
    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "Product{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
