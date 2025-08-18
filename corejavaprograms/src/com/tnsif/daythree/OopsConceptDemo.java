package com.tnsif.daythree;

public class OopsConceptDemo {

    // Instance variables should be here (not inside main)
    private int serialNum;
    private String name;
    private int age;

    // Getters and Setters
    public int getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(int serialNum) {
        this.serialNum = serialNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // toString method
    @Override
    public String toString() {
        return "OopsConceptDemo [Serial Number=" + serialNum + ", name=" + name + ", age=" + age + "]";
    }

    // (Optional) Test inside this class itself
    public static void main(String[] args) {
        OopsConceptDemo obj = new OopsConceptDemo();
        obj.setSerialNum(101);
        obj.setName("Abinaya");
        obj.setAge(21);

        System.out.println(obj);  // calls toString()
    }
}