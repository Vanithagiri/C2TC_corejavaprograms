package com.tnsif.daythree;

	// Main class
	public class EncapsulationDemo {
	    public static void main(String[] args) {
	        // Create object
	        Person p = new Person();

	        // Set values using setter methods
	        p.setName("Vanitha");
	        p.setAge(21);

	        // Get values using getter methods
	        System.out.println("Name: " + p.getName());
	        System.out.println("Age: " + p.getAge());
	    }
	}