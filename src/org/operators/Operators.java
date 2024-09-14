package org.operators;

public class Operators {
	
	int a=20;
	int b=4;
	int c=5;
	
	public void arithmetic() {
	
		System.out.println("add "+ (a+b));
		System.out.println("mul "+ (a*b));
		System.out.println("div "+ (a/b));
		System.out.println("sub "+ (a-b));
		System.out.println("modulo "+ (a%b));
		
	}
	
	public void relational() {
		
		System.out.println((a>b)); //true
		System.out.println((a<b));// false
		System.out.println((a==b));//false
				
	}
	
	public void logical() { //20, 5, 10
		
		System.out.println((a>b)&& (a<b)); //true
		System.out.println((a<b)&& (a<c));// false
		System.out.println((a>b)|| (a<b));//false
				
	}

	public void increment() {
	int a=5;
	System.out.println(a); 
	System.out.println(++a); // a=a+1; // pre increment
	//System.out.println(a);
	System.out.println(a++); // post increment
	System.out.println(a++);
	System.out.println(a);
	}
	
	public void decrement() {
		int a=10;
		System.out.println(a); //10
		System.out.println(--a); // a=a+1; // pre decrement 9
		//System.out.println(a);
		System.out.println(a--); // post decrement 9
		System.out.println(a--); //8
		System.out.println(a); // 8 or 7
		}
	
	
	public static void main(String[] args) {
		
		
		Operators op=new Operators();
		op.arithmetic();
		op.relational();
		op.logical();
		op.increment();
		op.decrement();
		
	}
	

}
