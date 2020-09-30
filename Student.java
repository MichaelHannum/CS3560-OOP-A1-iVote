/***************************************************************
* author: Michael Hannum
* class: CS 3560 OOP
* Assignment 1 - iVoter
* 
****************************************************************/
public class Student {
	
	private String ID;
	private String name;
	
	//CONSTRUCTORS
	public Student() {
		ID = "Error";
		name = "Error";
	}
	public Student(String i, String n) {
		ID = i;
		name = n;
	}
	
	//SETS
	public void setID(String i) {
		ID = i;
	}
	public void setName(String n) {
		name = n;
	}
	
	//GETS
	public String getID() {
		return ID;
	}
	
	public String getName() {
		return name;
	}
	
	
	
	
}
