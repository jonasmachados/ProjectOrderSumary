package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        //DATA OFF CLIENTS
        System.out.println("Enter cliente data: ");
        System.out.print("Name: ");
        String nameCliente = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.println("Birth date");
        Date birthDate = sdf.parse(sc.next());

        //DATA OFF ORDER STATUS
        System.out.println("Enter order data: ");
        System.out.println("Status: ");
        String status = sc.next();
        Date moment = new Date(System.currentTimeMillis());

        Order order = new Order(moment, OrderStatus.valueOf(status), new Client(nameCliente, email, birthDate));

        System.out.println("How many items to this order? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter #" + i + "item data:");
            System.out.println("Product name: ");
            String productName = sc.next();
            System.out.println("Product price: ");
            Double price = sc.nextDouble();

            System.out.println("Quantity");
            Integer quantity = sc.nextInt();
            OrderItem items = new OrderItem(quantity, new Product(productName, price));
            order.addItem(items);
        }
        
        System.out.println("");
        System.out.println(order);

        sc.close();

    }

}
