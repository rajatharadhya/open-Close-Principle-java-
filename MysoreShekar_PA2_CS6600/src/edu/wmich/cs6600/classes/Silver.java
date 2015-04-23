package edu.wmich.cs6600.classes;

public class Silver extends Status{
	
	int get_factor() {
		return 2;
	}

	
	Status getNext() {
		return null;
	}

	@Override
	void setNext(Status next) {
		
		
	}

	@Override
	Status check_Status(Customer c) {
		// TODO Auto-generated method stub
		return null;
	}
	 
}
