package com.dxctraining.ui;

import com.dxctraining.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.*;

public class StudentMain {
	Map<String, Student> store = new HashMap<>();
	Set<Student> seteven = new HashSet<>();
	Set<Student> setodd = new LinkedHashSet<>();
	List<String> allrollno = new ArrayList<>();

	public static void main(String[] args) {
		StudentMain run = new StudentMain();
		run.runApp();
	}

	public void runApp() {

		Student student1 = new Student("21", 21);
		store.put("21", student1);
		Student student2 = new Student("22", 21);
		store.put("22", student2);
		Student student3 = new Student("23", 23);
		store.put("23", student3);
		Student student4 = new Student("24", 24);
		store.put("24", student4);

		Set<String> keys = store.keySet();
		for (String k : keys) {
			Student fetched = store.get(k);
			int i = fetched.getAge();
			String j = fetched.getRollNo();
			allrollno.add(j);
			if (i % 2 == 0) {
				seteven.add(fetched);
			}
			if (i % 2 != 0) {
				setodd.add(fetched);
			}
			System.out.println("Age=" + fetched.getAge() + " " + "Rollno" + fetched.getRollNo());
		}

	}
}
