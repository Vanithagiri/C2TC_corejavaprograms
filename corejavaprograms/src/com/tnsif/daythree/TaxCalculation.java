package com.tnsif.daythree;

public class TaxCalculation {

		    public void calculateTax(Person person) {
		        // Example tax calculation
		        double tax = 0;
		        if (person.getIncome() > 500000) {
		            tax = person.getIncome() * 0.2; // 20% tax
		        } else {
		            tax = person.getIncome() * 0.1; // 10% tax
		        }

		        // update income after tax (optional)
		        person.setIncome(person.getIncome() - (int) tax);
		    }

}