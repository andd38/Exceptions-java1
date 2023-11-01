package ExercerciojavaFixacao.entidades;

public class OrderItem {
    private int quantity;
    private Double price;


    public OrderItem(int quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
    }
    public OrderItem(){

    }

    public OrderItem(int quantity) {
        this.quantity = quantity;
    }

    public double subTotal(){
        return getPrice()*getQuantity();
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
