package com.dxctraining;

public class ElectronicsStudent extends Student{

	private String gadgetAlloted;
	
	public ElectronicsStudent(String rollno,int age, Course course, String gadget)
	{
		super(rollno,age,course);
		this.gadgetAlloted=gadget;
	}

	public String getGadgetAlloted() {
		return gadgetAlloted;
	}

	public void setGadgetAlloted(String gadgetAlloted) {
		this.gadgetAlloted = gadgetAlloted;
	}
	
	
	
}
