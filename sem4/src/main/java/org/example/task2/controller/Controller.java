package org.example.task2.controller;

import org.example.task2.exception.CustomerException;
import org.example.task2.exception.OrderException;
import org.example.task2.exception.ProductException;
import org.example.task2.model.Customer;
import org.example.task2.model.Order;
import org.example.task2.model.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Controller {

    public static List<Customer> customers = new ArrayList<>();

    public static List<Product> productList = new ArrayList<>();

    public static int purchase(String name, Order order) throws CustomerException, ProductException, OrderException {
        Customer c = null;
        for (Customer customer : customers) {
            if (customer.getName().equals(name))
                c = customer;
        }
        if (c == null) throw new CustomerException(name);
        Product p = null;
        for (Product product : productList) {
            if (product.getName().equals(order.getName()))
                p = product;
        }
        if (p == null) throw new ProductException(order.getName());

        if(order.getCount() < 0) throw new OrderException(order.getCount());

        return p.getAmount() / order.getCount();
    }

}
