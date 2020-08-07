package com.dxctraining;

/**
 * 
 * things that can be done with super keyword
 * 1) you can address members(fields + methods)
 * 2) you can call constructor of immediate base class
 *
 */
public class ComputerScienceStudent extends Student {

	private String laptopAlloted;

	public ComputerScienceStudent(String rollno, int age,  Course course , String laptopAlloted) {
		//super with round bracket means we are calling base class constructor
		super(rollno, age, course);
		this.laptopAlloted = laptopAlloted;
	}
	
	
	

	public String getLaptopAlloted() {
		return laptopAlloted;
	}

	public void setLaptopAlloted(String laptopAlloted) {
		this.laptopAlloted = laptopAlloted;
	}
	
	
		

}
