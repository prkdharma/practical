package com.dxctraining;




public class Student{
	private String rollno;
	private int age; 
	private Course course;
		
	
	
	public Student(String rollno,int age,Course course){
		this.rollno=rollno;
		this.age=age;
		this.course=course;
	}
	
	public String getRollNo() {
		return rollno;
	}

public void setRollNo(String rollno) {
		this.rollno = rollno;
	}

public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}	
	
	
	

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	public int hashCode() {
		String str=(String)rollno;
		return rollno;
	}
	public boolean equals(Object arg) {
		if(this==arg) {
			return true;
		}
		
	   if(arg==null || !(arg instanceof Student) ) {
			return false;
	   }
		
	    Student that=(Student)arg;	
		boolean isequal=this.rollno==that.rollno;
		return isequal;
	}
	
	
	
		
	
		
}