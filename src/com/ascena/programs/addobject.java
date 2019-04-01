package com.ascena.programs;

import java.util.Comparator;
import java.util.TreeSet;

class addobject1 {
	String name;
	int rollno;
	int age;

	 addobject1(String name, int rollno, int age) {
		this.name = name;
		this.rollno = rollno;
		this.age = age;

	}

	public String toString() {
		return name + "of the Student" + age + " of the student" + rollno + " of the student";
	}
	
	
}
public class addobject {
	public static void main(String[] args) {
		addobject1 e1 = new addobject1("Vicky", 1, 20);
		addobject1 e2 = new addobject1("Ashish", 2, 40);
		addobject1 e3 = new addobject1("Neha", 67, 21);
		addobject1 e4 = new addobject1("Tushar", 21, 37);
		addobject1 e5 = new addobject1("Tarun", 12, 67);
		
		TreeSet<addobject1> employeedata = new TreeSet<addobject1>();
		employeedata.add(e1);
		employeedata.add(e2);
		employeedata.add(e3);
		employeedata.add(e4);
		employeedata.add(e5);
		System.out.println(employeedata);
		TreeSet<addobject1> employeedata1 = new TreeSet<addobject1>();
		employeedata1.add(e1);
		employeedata1.add(e2);
		employeedata1.add(e3);
		employeedata1.add(e4);
		employeedata1.add(e5);
		System.out.println(employeedata1);
	}
	
	}
class Mycomparator implements Comparator<addobject1>{

	@Override
	public int compare(addobject1 obj1, addobject1 obj2) {
		addobject1 o1 = (addobject1)obj1;
		addobject1 o2 = (addobject1)obj2;
		String S1 = o1.name;
		String S2 = o2.name;
		//Integer I1 = o1.age;
		//Integer I2 = o2.age;
		return S2.compareTo(S1);
		
	}
	
}
