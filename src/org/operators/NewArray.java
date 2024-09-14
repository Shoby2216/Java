package org.operators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NewArray {
	String s="Welcome to java";
	
	public void method() {
		
		int a=s.length();
		System.out.println("length " + a);
		char c =s.charAt(5);
		System.out.println("char " + c);
		String upperCase = s.toUpperCase();
		System.out.println("upperCase "+ upperCase);
		String lowerCase = s.toLowerCase();
		System.out.println("lowerCase " + lowerCase);
		String concat = s.concat(" and Selenium");
		System.out.println(concat);
	}
	
	
	public void m2() {
		int indexOf = s.indexOf('c');
		System.out.println("indexOf " + indexOf);
		boolean contains = s.contains("java");
		System.out.println("contains " + contains);
		String replace = s.replace("java", "selenium");
		System.out.println("replace " + replace);
		String substring = s.substring(0, 6);
		System.out.println("substring " + substring);
		String substring2 = s.substring(8);
		System.out.println("substring2 " + substring2);
		String s="Welcome to java"; //{Welcome, to, java}
		String[] s1 = s.split(" ");
		for (int i = 0; i < s1.length; i++) {
			System.out.println(s1[i]);
		}
	}
	public static void main(String[] args) {
		/*
		 * StringBuffer name1 = new StringBuffer("Aite"); StringBuffer append =
		 * name1.append("technolegy"); System.out.println(append);
		 * 
		 * System.out.println(System.identityHashCode(append));
		 * System.out.println(System.identityHashCode(name1));
		 */
		
		
		int[] input = new int[]{1,2,3,4};
		List output = Arrays.asList(input);
		
		for (int i = 0; i < output.size(); i++) {
			System.out.println(output.get(i));
		}

	}}	
		
		
		
		
		
		
		
		
	
	


