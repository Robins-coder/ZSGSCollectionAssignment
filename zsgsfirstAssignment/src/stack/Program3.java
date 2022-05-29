package stack;

import java.util.Scanner;

public class Program3 {

	
	
	
	
	private void activechatbox() {
                
		        System.out.println("  [ *jio cunsumer care ] ");
                System.out.println(" hi my name zoro..  ");
                System.out.println(" how can i help u ??");
                System.out.println(" press 1 -> check Balance\n press 2 -> check offers\n 3 -> end call ");
                Scanner scanner=new Scanner(System.in);
                int choice=scanner.nextInt();
                switch (choice) {
				case 1: {
					 checkBalance();
					break;
				}case 2: {
					 checkOffer();
					break;
				}case 3: {
					   System.exit(0);;
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + choice);
				}
                
	}
	
	private void checkOffer() {

		System.out.println(" 100rs -> 10 GB data per month ");
		System.out.println(" 99rs  -> 20ps per call 1 month");
		System.out.println(" 249rs -> 1 month unlimited calls 1.5 Gb data ");
		System.out.println(" GOTO Back press 0 ");
        Scanner scanner=new Scanner(System.in);
        if(scanner.nextInt()==0) 
        {
          activechatbox();	
        }		
		
        checkOffer();
		
	}

	private void checkBalance() {
        System.out.println();
		System.out.println(" Your Current Balance is 99 rs");
		System.out.println(" GOTO Back press 0 ");
        Scanner scanner=new Scanner(System.in);
        if(scanner.nextInt()==0) 
        {
          activechatbox();	
        }		

		System.out.println();
		
	}

	public static void main(String[] args) {
	
		//chatbox
          Program3 program3=new Program3();
          program3.activechatbox();
	}

}
