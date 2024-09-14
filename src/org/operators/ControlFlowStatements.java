package org.operators;

import java.util.Iterator;
import java.util.Scanner;

public class ControlFlowStatements extends ConditionalStatement{
	
	
	public static void main(String[] args) {
		
		ControlFlowStatements student=new ControlFlowStatements();
		int mark = student.getMark();
		System.out.println(mark);
		
		ControlFlowStatements teacher=new ControlFlowStatements();
		teacher.setMark(75);
		
		int mark2 = teacher.getMark();
		System.out.println(mark2);
		  
		}
		 
		
		
		
		
		
		
		
		
		
		
	
	

}
