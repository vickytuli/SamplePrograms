package com.ascena.programs;

import java.util.Comparator;
import java.util.TreeSet;

public class CompareExample {
	public static void main(String[] args) {
		TreeSet<String> numbers = new TreeSet<String>(new MyComparartor());
		numbers.add("Vicky");
		numbers.add("Cat");
		numbers.add("Zebra");
		numbers.add("Ink");
		numbers.add("Anb");
		numbers.add("Boy");
		numbers.add("Ant");
		numbers.add("Van");
		System.out.println(numbers);
	}

}

class MyComparartor implements Comparator<Object> {

	@Override
	public int compare(Object obj1, Object obj2) {
		String I1 = (String) obj1;
		String I2 = (String) obj2;
		//return I2.compareTo(I1);
		return I1.compareTo(I2);
}
}
