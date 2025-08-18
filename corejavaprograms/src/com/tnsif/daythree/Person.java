package com.tnsif.daythree;

public class Person {

    // Instance variables should be here, not inside main()
    private String name;
    private int income;
    private String gender;
    private int age;
    private int tax;

    // Getters and Setters
    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // toString method for printing object
    @Override
    public String toString() {
        return "Person [name=" + name + ", income=" + income + ", gender=" + gender + ", age=" + age + ", tax=" + tax + "]";
    }

    // Main method to test the Person class
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Abinaya");
        p1.setIncome(50000);
        p1.setGender("Female");
        p1.setAge(21);
        p1.setTax(2000);

        System.out.println(p1);  // calls toString()
    }
}