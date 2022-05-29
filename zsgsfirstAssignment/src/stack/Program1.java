package stack;

import java.util.Scanner;
import java.util.Stack;

public class Program1 {

	
	//the PUSH, POP and TOP operations in Stack 
  static Stack<String> stack=new Stack<String>();	
	
	
	private static void pop() {
		System.out.println();
        if(stack.isEmpty()) 
        {   System.out.println();
        	System.out.println(" Stack is Empty !!!");
            Program1.main(null);
        }		
	    
        System.out.println(" pop : "+stack.pop());
        System.out.println();
        Program1.main(null);
	}

	private static void push() {
		Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Student Name : ");
        String name=scanner.next();
        stack.push(name);
        System.out.println();
        System.out.println(" push "+name+" to stack !! ");
        System.out.println();
        Program1.main(null);
	}

	private static void peek() {
        System.out.println();
        System.out.println(" top of stack ");
        System.out.print("name => "+stack.peek());
        System.out.println();

        Program1.main(null);

	}

	
	private static void view_student() {
         int no=0;

         if(stack.isEmpty()) 
         {   System.out.println();
         	System.out.println(" Stack is Empty !!!");
             Program1.main(null);
         }		
         
        
		System.out.println();
        for(String name : stack) 
        {   no++;
           System.out.println(no+" "+name);	
        }
        System.out.println();
	    Program1.main(null);	
	}
	
	public static void main(String[] args) {
		
		System.out.println(" 1. push\n 2. pop\n 3.View Student Name\n 4.peek list\n 4.exit");
		Scanner scanner=new Scanner(System.in);
		 int ch=scanner.nextInt();
		switch (ch) {
		case 1: {
		        push();      	
			break;
		}
		case 2: {
	      	   pop();
			break;
		}
		case 3: {
	         view_student();
			break;
		}
		case 4:{
		    peek();	
			break;
		}
		case 5: {
	         System.exit(0); 	
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " +ch );
		}
		
		
	}



	
}
