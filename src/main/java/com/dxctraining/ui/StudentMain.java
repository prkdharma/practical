package com.dxctraining.ui;

import com.dxctraining.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.*;



public class StudentMain {
	private Set<Student> store = new HashSet<>();
	Iterator<Student> iterator=store.iterator();
	List<Student> list=new ArrayList<>();

	public static void main(String[] args) {
		StudentMain run = new StudentMain();
		run.runApp();
	}

	public void runApp() {
		    
			Student student1 = new Student("21", 21);
			store.add(student1);
			Student student2 = new Student("22", 21);
			store.add(student2);
		    Student student3 = new Student("23", 23);
			store.add(student3);
			Student student4 = new Student("24", 24);
			store.add(student4);

			
		  
		   while(iterator.hasNext()) {		 
				Student student = iterator.next();
				int i=student.getAge();
				if(i>21)
				list.add(student);
				System.out.println("Age=" + student.getAge() + " " + "Rollno"+ student.getRollNo());
		   }
}
}
			  
		   
