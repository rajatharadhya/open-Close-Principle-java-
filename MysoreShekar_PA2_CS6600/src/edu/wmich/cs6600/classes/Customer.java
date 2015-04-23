package edu.wmich.cs6600.classes;

import edu.wmich.cs6600.vineeth.classes.AwardProgram;

//for PA1- This Project satisfies Open - Closed Principle as it is open to new membership statuses and new memberships too.
// This does not require to make changes to Customer class which is closed for changes. 
// Hence Project satisfies Open - Close principle 
public class Customer {

	private String name;
	
	public String getName() {
		return name;
		}
	
	public void setName(String name) {
	    this.name = name;
		}
	
	private int status;
	
	public int getStatus() {
		return status;
		}
	
	public void setStatus(Status status) {
		
		
		this.status = status.get_factor();
		//System.out.println("status-"+this.status);
		}
	
	private Integer wPNumber;

	public Integer getWPNumber() {
		return wPNumber;
		}
	
	public void setwPNumber(Integer wPNumber) {
		this.wPNumber = wPNumber;
		}
	
	public Customer(String name, Integer wPNumber,Status presentstat,Status Nextstat) {
		this.wPNumber = wPNumber;
		this.name = name;
		
		}
	
	private AwardProgram aP;

	public AwardProgram getAwardProgram() {
		return aP;
		}
	
	public void setAwardProgram(AwardProgram awardProgram) {
		this.aP = awardProgram;
		}

	private Integer mileage = new Integer(0);
	
	public Integer getMileage() {
		return mileage;
		}

	public void setMileage(Integer mileage) {
		this.mileage +=this.status *mileage;
		
	}
		
}
