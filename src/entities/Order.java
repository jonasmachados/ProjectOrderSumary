package entities;

import entities.enums.OrderStatus;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private static SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");

    private Date moment;
    private OrderStatus status;
    //ASSOCIATION
    private Client client;
    private List<OrderItem> items = new ArrayList<>();

    //CONSTRUCTOR
    public Order() {
    }

    //CONSTRUCTOR
    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    //TOSTRING
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        //Data client
        sb.append("Order momment: " + sdf.format(moment) + "\n");
        sb.append("Order status: " + status.name() + "\n");
        sb.append("Client: " + client.getName()
                + " (" + sdf2.format(client.getBirthDate()) + ") " + " - "
                + client.getEmail() + "\n");
        sb.append("Order items: \n");
        for (OrderItem i : items) {
            sb.append(i.getProduct().getName() + ", "
                    + i.getProduct().getPrice() + ", "
                    + i.getQuantity() + ", "
                    + "Subtotal: $" + i.subTotal() + "\n");
        }
        sb.append("Total price: \n");
        for (OrderItem i : items) {
            sb.append(total());
        }

        return sb.toString();
    }

    //METHOS MAIN
    double totalPrice = 0;

    public double total() {
        for (OrderItem i : items) {
            totalPrice = totalPrice + i.subTotal();
        }
        return totalPrice;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    //total
    //GET AND SET
    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItems() {
        return items;
    }

}
