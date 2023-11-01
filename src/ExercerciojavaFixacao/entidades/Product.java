package ExercerciojavaFixacao.entidades;

public class Product {
    private String name;
    private Double price;
    
    private OrderItem item;

    public Product(String name, Double price,OrderItem item) {
        this.name = name;
        this.price = price;
        this.item = item;
        
    }
    public Product(){

    }

    public Product(String nameProduct, Double priceProduct) {
    }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + "," + "price "+price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
