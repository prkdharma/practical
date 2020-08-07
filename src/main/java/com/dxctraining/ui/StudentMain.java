package com.dxctraining.ui;

import com.dxctraining.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.*;



public class StudentMain {
	private Set<Student> store = new HashSet<>();

	public static void main(String[] args) {
		StudentMain demo = new StudentMain();
		demo.runApp();
	}

	public void runApp() {
		try {
			
			Course course1 = new Course(1, "java");
			Course course2 = new Course(2, "python");
			
			ElectronicsStudent student1 = new ElectronicsStudent("21", 21,course1, "multimeter");
			
			store.add(student1);
			ComputerScienceStudent student2 = new ComputerScienceStudent("22", 21, course2, "dell");
			store.add(student2);
			ComputerScienceStudent student3 = new ComputerScienceStudent("23", 23, course2, "asus");
			store.add(student3);
			ElectronicsStudent student4 = new ElectronicsStudent("24", 24,course1, "diode");
			store.add(student4);

			
		    
			System.out.println("*******displaying all students********"); 
			
			displayAll();
		} catch (InvalidStudentArgumentException e) {
			System.out.println("student is null");
		} catch (Exception e) {
			System.out.println("some error occurred in program");
		}

	}

	

	public void displayAll() {
		Set<String> set = store.keySet();
		for (String key : set) {
			Student current = store.get(key);
			boolean isCSGuy = current instanceof ComputerScienceStudent;
			if (isCSGuy) {
				ComputerScienceStudent cs = (ComputerScienceStudent) current;
				int i=cs.getAge();
				if(i>21)
				display(cs);
			}

			boolean isECEGuy = current instanceof ElectronicsStudent;
			if (isECEGuy) {
				ElectronicsStudent es = (ElectronicsStudent) current;
				int i=es.getAge();
				if(i>21)
				display(es);
			}

		}

	}

	

	public void displayStudent(Student student) {
		
		String rollno = student.getRollNo();
		int age = student.getAge();
		
		System.out.println("roll no is " + rollno + " age is " + age  );
		Course course = student.getCourse();
		System.out.println("student pursuing course=" + course.getId() + " " + course.getName());
	}

	public void display(ElectronicsStudent student) {
		
		displayStudent(student);
		System.out.println("gadget available=" + student.getGadgetAlloted());

	}

	public void display(ComputerScienceStudent student) {
		
		displayStudent(student);
		System.out.println("laptop available=" + student.getLaptopAlloted());

	}
	

}
