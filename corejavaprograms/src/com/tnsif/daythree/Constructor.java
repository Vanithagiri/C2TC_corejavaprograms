package com.tnsif.daythree;

import java.util.Scanner;

// Customer class
class Customer {
    private int customerId;
    private String customerName;
    private String customerCity;

    // Default constructor
    public Customer() {
        this.customerId = 0;
        this.customerName = "Unknown";
        this.customerCity = "Unknown";
    }

    // Parameterized constructor
    public Customer(String customerName, int customerId, String customerCity) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerCity = customerCity;
    }

    // Getters and Setters
    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerCity() {
        return customerCity;
    }
    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }

    // toString() method for printing object nicely
    @Override
    public String toString() {
        return "Customer [Id=" + customerId + ", Name=" + customerName + ", City=" + customerCity + "]";
    }
}

// Main class
public class Constructor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, city;
        int id;

        System.out.print("Enter Customer Id : ");
        id = sc.nextInt();

        sc.nextLine(); // consume newline
        System.out.print("Enter Customer Name : ");
        name = sc.nextLine();

        System.out.print("Enter Customer City : ");
        city = sc.nextLine();

        System.out.println(" ");

        // Default constructor
        Customer c1 = new Customer();
        c1.setCustomerName(name);
        c1.setCustomerId(id);
        c1.setCustomerCity(city);
        System.out.println(c1);

        System.out.print("Enter Customer Id : ");
        id = sc.nextInt();

        sc.nextLine(); // consume newline
        System.out.print("Enter Customer Name : ");
        name = sc.nextLine();

        System.out.print("Enter Customer City : ");
        city = sc.nextLine();

        // Parameterized constructor
        Customer c2 = new Customer(name, id, city);
        System.out.println(c2);

        sc.close();
    }
}
