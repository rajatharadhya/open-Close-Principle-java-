package edu.wmich.cs6600.classes;

public abstract class Status {
	
	abstract Status getNext();
	abstract void setNext(Status next);
	abstract Status check_Status(Customer c);
	abstract int get_factor(); 
}
