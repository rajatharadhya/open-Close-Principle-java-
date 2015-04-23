package edu.wmich.cs6600.classes;

import java.util.HashSet;
import java.util.Set;

import edu.wmich.cs6600.classes.Customer;

public class AwardProgram {

	private Set<Customer> customer = new HashSet<Customer>();

	
	public Set<Customer> getCustomer() {
		return customer;
	}
	
	public void setCustomer(Set<Customer> customer){
		this.customer = customer;
	}
	
	public void add_customer(Customer cust) {
		customer.add(cust);
	}
	
	public Integer Find_mileage(Customer cust){
				return cust.getMileage();
	}
	
	public Integer Find_mileage(Integer wPNumber) {
		int mileage=0;
		for (Customer cust : customer) {
			int a=cust.getWPNumber();
			int b= wPNumber;
			while (a==b) {
			 mileage = Find_mileage(cust);
				break;
			}
		}
		return mileage;
	}
	public void Print_all_mileage() {
		for (Customer cust : customer) {
			System.out.println(cust.getName() + ": WorldPerks number is "+ cust.getWPNumber() + " and mileage is"	+ Find_mileage(cust));
		}
	}	
	
}
