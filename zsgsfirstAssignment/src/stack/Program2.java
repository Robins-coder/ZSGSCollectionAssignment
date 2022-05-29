package stack;

import java.util.Scanner;
import java.util.Stack;

public class Program2 {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println(" 1. stack overflow \n 2. stack underflow ");
		int choice=scanner.nextInt();
		
		switch (choice) {
		case 1: {
			stackOverflow();
			break;
		}
		case 2: {
			stackUnderflow();
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
		
	}

	private static void stackOverflow() {
      
		int overflow=999999999;
        
		try {
			for(int i=0;i<=overflow+1;i++) 
			{
				stackOverflow();
			}	
		} catch (Exception e) {
                 e.printStackTrace();
		}
		
	
		
	}

	private static void stackUnderflow() {


		try {
			Stack stack=new Stack<>();
	 			stack.pop();
				
		} catch (Exception e) {
	             e.printStackTrace();
		}
		
		
	
		

		
	}



}
