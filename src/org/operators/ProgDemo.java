package org.operators;

import java.util.LinkedHashMap;
import java.util.Map;

public class ProgDemo {
	
	public static void main(String[] args) {
		
		String name = "WelcomeW";
		Map<Character, Integer> emp = new LinkedHashMap<>();
		char[] ch = name.toCharArray();
		for (char c : ch) { 
			if (emp.containsKey(c)) { 
				int count = emp.get(c);
				emp.put(c, count + 1);
			} else {
				emp.put(c, 1);

			}

		}
		System.out.println(emp);

		
	
	}
	

}
