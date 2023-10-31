package org.example.task2;

import org.example.task2.controller.Controller;
import org.example.task2.exception.CustomerException;
import org.example.task2.exception.OrderException;
import org.example.task2.exception.ProductException;
import org.example.task2.model.Customer;
import org.example.task2.model.Order;
import org.example.task2.model.Product;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws CustomerException, ProductException, OrderException {
        Customer customer1 = new Customer("Oleg", Customer.Gender.MALE);
        Customer customer2 = new Customer("Ivan", Customer.Gender.MALE);
        Customer customer3 = new Customer("Margo", Customer.Gender.FEMALE);

        Product product1 = new Product("Mango", 10, 2);
        Product product2 = new Product("Apple", 8, 1);
        Product product3 = new Product("Water", 5, 1);
        Product product4 = new Product("Meat", 3, 5);

        Controller.customers = Arrays.asList(customer1, customer2, customer3);
        Controller.productList= Arrays.asList(product1, product2, product3, product4);
        Order order = new Order("Mango", 3);
        System.out.println(Controller.purchase("Oleg", order));
    }
}
