package entities;

import java.util.ArrayList;
import java.util.List;

public class OrderItem {

    private Integer quantity;
    private Double price;
    //ASSOCIATION
    private Product product;

    //CONSTRUCTOR
    public OrderItem() {
    }

    //CONSTRUCTOR
    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public double subTotal() {
        double sum = 0;
        sum = quantity * price;
        return sum;
    }

    //GET AND SET
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

}
