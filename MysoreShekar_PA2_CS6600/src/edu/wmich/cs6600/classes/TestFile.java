package edu.wmich.cs6600.classes;

import edu.wmich.cs6600.vineeth.classes.AwardProgram;

public class TestFile {

	public static void main(String[] args) {
		AwardProgram aProgram = new AwardProgram();

		Status normal = new Normal();
		Status silver = new Silver();
		Status gold = new Gold();
		gold.setNext(silver);
		silver.setNext(normal);
		normal.setNext(null);
		
		
		// 10001 is the WorldPerks number
		Customer john = new Customer("John Lee", 10001, normal,gold);
		//john.setStatus(normal);
		Customer marry = new Customer("Marry Hoke", 10002,normal,gold);
		//marry.setStatus(silver);
		Customer joe = new Customer("English, Sue", 10003,normal,gold);
		//joe.setStatus(gold);

		aProgram.add_customer(john);
		aProgram.add_customer(marry);
		aProgram.add_customer(joe);

		john.setMileage(12000);
		marry.setMileage(23000);
		john.setMileage(2000);
		marry.setMileage(32000);
		joe.setMileage(4000);
		joe.setMileage(21000);
		marry.setMileage(10000);
		joe.setMileage(-10000);
		joe.setMileage(50000);

		aProgram.Print_all_mileage();
		

		System.out.println("John Lee has " + aProgram.Find_mileage(john)
				+ " mileage");
		System.out.println("Customer 10001 has " + aProgram.Find_mileage(10001)
				+ " mileage");
	}
}
