package queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class EnqueueAndDequeue {

	
   static Queue<String> fruitNameList=new LinkedList<>();	
	
	
	
	private void enqueueOperation() {
		Scanner scanner=new Scanner(System.in);
	    
		System.out.println(" Insert fruit Name ");
        System.out.println(" How Many fruits name Enter ");
        int n=scanner.nextInt();
        while(n!=0) 
        {
    		System.out.println(" Enter fruit name ");
            String name=scanner.next();
            fruitNameList.add(name);
    		n--;
        }
	     EnqueueAndDequeue.main(null);	
	}
	
	private void viewCustomerList() {

		System.out.println(" View All Fruits Names : ");
		int count=1;
		for(String fruitsname : fruitNameList) 
		{
			System.out.println(count+" : "+fruitsname);
		   
		}
		EnqueueAndDequeue.main(null);
	}


	private void dequeueOperation() {
		Scanner scanner=new Scanner(System.in);

		if(fruitNameList.size()==0) {
			System.out.println();
			System.out.println(" No Fruits to remove!!!");
		    System.out.println();
			EnqueueAndDequeue.main(null);
		}
		System.out.println(" Remove Last Fruit in List !!! ");
		
		fruitNameList.poll();
		
		EnqueueAndDequeue.main(null);
		
	}

	
	public static void main(String[] args) {
        EnqueueAndDequeue enqueuedequeue=new EnqueueAndDequeue();
		Scanner scanner=new Scanner(System.in);
		System.out.println(" 1. Enqueue  \n 2. dequeue \n 3.view list \n 4.Exit");
		String choice=scanner.next();
		switch (choice) {
		case "1": {
		    enqueuedequeue.enqueueOperation();	
			break;
		}
		case "2":{
			enqueuedequeue.dequeueOperation();
			break;
		}
		case "3":{
			enqueuedequeue.viewCustomerList();
		    break;
		}
		case "4":
		{   System.exit(0);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
	}


	

}
