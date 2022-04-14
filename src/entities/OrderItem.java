package entities;

public class OrderItem {

    private Integer quantity;
    //private Double price;
    //ASSOCIATION
    private Product product;

    //CONSTRUCTOR
    public OrderItem() {
    }

    //CONSTRUCTOR
    public OrderItem(Integer quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }

        double sum = 0;
    public double subTotal() {
        sum = quantity * product.getPrice();
        return sum;
   }

    //GET AND SET
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

}
