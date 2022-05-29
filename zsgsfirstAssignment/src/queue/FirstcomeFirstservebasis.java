package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FirstcomeFirstservebasis {

	   static Queue<StudentPojo> studentRegistrationList=new LinkedList<>();
	   static Queue<StudentPojo> studentRegistrationcompleteList=new LinkedList<>();
       static int rollno=1001;
       static int admissionnumber=1200;
       
	   
		private void servicestudentrollno() {
			Scanner scanner=new Scanner(System.in);

			System.out.println(" Service ");
            String grpname="";
		    String name="";int age=0;
            int index=0;
		    for(StudentPojo studentpojo : studentRegistrationList) 
            {               
		            	     System.out.println("Hi "+studentpojo.getName() +">>");
                            System.out.println(" Enter Group Name :");
                            grpname=scanner.next();            
                            name=studentpojo.getName();
                            age=studentpojo.getAge();              
                            
                            StudentPojo sPojo=new StudentPojo();
                            sPojo.setAge(age);
                            sPojo.setAdmissionNo(admissionnumber);
                            sPojo.setGroupName(grpname);
                            sPojo.setRollno(rollno);
                            sPojo.setName(name);
                            
                           studentRegistrationcompleteList.add(sPojo);         
                           admissionnumber++;
            }
		    
		    
           System.out.println(" Admission Completed  for all  student !!! ");

           FirstcomeFirstservebasis.main(null);
           
		}

		private void addstudentrollno() {
			
			
			Scanner scanner=new Scanner(System.in);
			System.out.println("ENter Name :");
			String name=scanner.next();
			System.out.println(" Enter Age : ");
			int age =scanner.nextInt();
                       
          StudentPojo stuPojo=new StudentPojo();
          stuPojo.setName(name);
          stuPojo.setRollno(rollno);
          stuPojo.setAge(age);
          stuPojo.setAdmissionNo(0);
          stuPojo.setGroupName("null");
          rollno++;
          
        studentRegistrationList.add(stuPojo);
		System.out.println(" Successfully added student data !!!");
		
		FirstcomeFirstservebasis.main(null);

		}
 

		private void viewstudentdetails() {
          int count=1;
		    for(StudentPojo studentpojo : studentRegistrationcompleteList) 
            {   
		    	System.out.println("-----------------------------------");
                System.out.println("No : "+count);
                
                System.out.println("name :" +studentpojo.getName());
                System.out.println(" Age : "+ studentpojo.getAge());
                System.out.println( "Group :"+studentpojo.getGroupName());
                System.out.println(" Admission no : "+studentpojo.getAdmissionNo());
                System.out.println(" rollno :"+studentpojo.getRollno());
                
               System.out.println("--------------------------------------");   
                count++;
            }

		    FirstcomeFirstservebasis.main(null);
		}

	   
	  public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       FirstcomeFirstservebasis firstcomefirstservicebasic=new FirstcomeFirstservebasis();
       System.out.println();
         System.out.println(" ** 11 Admistion open !!");
       System.out.println(" 1. add Student  \n 2.service for student (choice which  group ) \n 3.viewRegisterStudent \n 4.exit");
       System.out.println();

       
       String choice=scanner.next();
       
       switch (choice) {
     	case "1": {
	          firstcomefirstservicebasic.addstudentrollno();	      
		break;
	    }
     	case "2":{
     		firstcomefirstservicebasic.servicestudentrollno();
     		break;
     	}
     	case "3":{
     		firstcomefirstservicebasic.viewstudentdetails();
     		break;
     	}
     	case "4":{
     		System.exit(0);
     		break;
     	}
	     default:
		throw new IllegalArgumentException("Unexpected value: " +choice );
	     }

	}



}
