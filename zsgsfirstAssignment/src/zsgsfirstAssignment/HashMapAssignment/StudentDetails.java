package zsgsfirstAssignment.HashMapAssignment;


import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class StudentDetails {

	static HashMap<Integer, StudentPojo> studentdatabase =new HashMap<Integer, StudentPojo>();
	static HashMap<Integer, StudentPojo> studentdatabasecopy =new HashMap<Integer, StudentPojo>();
	static HashMap<Integer, StudentPojo> studentdatabaseshallowcopy =new HashMap<Integer, StudentPojo>();
    static int key=0;

    
    
    private void addStudentDetails() {
        Scanner scanner=new Scanner(System.in);
    	System.out.println();
		System.out.println(" Add Student Details ");
		
		System.out.println(" How many student details created --");
		int studentcount=scanner.nextInt();
		String schoolname="West.Tr.Hr.Sec.School"; 
		int rollno_auto_increment=1000;
	
		while(studentcount!=0) 
		    {
			System.out.println("Enter NAme : ");
			String name=scanner.next();
			System.out.println(" Enter Age : ");
			int age=scanner.nextInt();
			
			
			StudentPojo setStudentData=new StudentPojo();
			setStudentData.setStudentdetails(name, schoolname, rollno_auto_increment,age);
              
			 studentdatabase.put(key, setStudentData);
			 key++;
		
			 rollno_auto_increment++;
		    studentcount--;
		   
		}
		
        StudentDetails studentObj=new StudentDetails();
        studentObj.Homepage();         	
	}
	

	private void viewStudentDetails() {
	    Scanner scanner=new Scanner(System.in);
		System.out.println(" View Student Details ");
		System.out.println("  Enter rollno : ");
        long rollno=scanner.nextLong();
		
		for(Entry<Integer, StudentPojo> m : studentdatabase.entrySet()) 
		{
			int key=m.getKey();
	        StudentPojo studentobj=studentdatabase.get(key);		
			long roll_no=studentobj.getRollno();
		    if(rollno==roll_no) 
		    {
		    	System.out.println(" Name : "+studentobj.getName() +" \n SchoolName : "+studentobj.getSchoolname() +" \n Age : "+studentobj.getAge());
		        break;
		    }	
		}
	
        StudentDetails studentObj=new StudentDetails();
        studentObj.Homepage();
	}

	
	private void cloneArray() {

		System.out.println(" Clone Array !!");
		
	    studentdatabasecopy=(HashMap<Integer, StudentPojo>) studentdatabase.clone();	

		for(Entry<Integer, StudentPojo> m : studentdatabasecopy.entrySet()) 
		{
			int key=m.getKey();
	        StudentPojo studentobj=studentdatabase.get(key);		
		    	System.out.println(" Name : "+studentobj.getName() +" \n SchoolName : "+studentobj.getSchoolname() +" \n Age : "+studentobj.getAge()+" \n Rollno : "+studentobj.getRollno());
		}

        StudentDetails studentObj=new StudentDetails();
        studentObj.Homepage();
	    
	}

	private void removeAllStudentDetails() {

		System.out.println("remove All Student Details !! ");
		studentdatabase.clear();
		System.out.println("Remove all details ......");
		
		
        StudentDetails studentObj=new StudentDetails();
        studentObj.Homepage();
		
		
		
	}

	private void checkEmptyOrNot() {
		System.out.println("Empty or not !!!");
		boolean checkempty=studentdatabase.isEmpty();
		if(checkempty) 
		{
			System.out.println(" Empty Student List !!!");
		}
		System.out.println("Empty or not !!!");
        checkempty=studentdatabase.isEmpty();
		
		if(checkempty) 
		{
			System.out.println(" Empty Student List !!!");
		}
		else 
		{
			System.out.println("  Student List  Not Empty!!!");	
		}
		
        StudentDetails studentObj=new StudentDetails();
        studentObj.Homepage();
		
		
	}

	

	private void shallowCopy() {

         System.out.println(" create shallow copy !!");
        studentdatabaseshallowcopy.putAll(studentdatabase);
        
        for(Entry<Integer, StudentPojo> entry: studentdatabaseshallowcopy.entrySet()) 
        {
			int key=entry.getKey();
	        StudentPojo studentobj=studentdatabase.get(key);		
		    	System.out.println(" Name : "+studentobj.getName() +" \n SchoolName : "+studentobj.getSchoolname() +" \n Age : "+studentobj.getAge()+" \n Rollno : "+studentobj.getRollno());
        	
        }
        StudentDetails studentObj=new StudentDetails();
        studentObj.Homepage();

	}


	private void searchStudentDetails() {
	
		System.out.println("search Student Details use in rollno ->");
        Scanner scanner=new Scanner(System.in);
        int rollno=scanner.nextInt();

        for(Entry<Integer, StudentPojo> entry: studentdatabaseshallowcopy.entrySet()) 
        {
			int key=entry.getKey();
	        StudentPojo studentobj=studentdatabase.get(key);		
		    if(studentobj.getRollno()==rollno) {
	        System.out.println(" Name : "+studentobj.getName() +" \n SchoolName : "+studentobj.getSchoolname() +" \n Age : "+studentobj.getAge()+" \n Rollno : "+studentobj.getRollno());
		    break;
		    }
        }
        StudentDetails studentObj=new StudentDetails();
        studentObj.Homepage();

        
		
	}

	private void setViewOfTheStudentsDetails() {

		System.out.println();
		System.out.println("view Of The Students Details");
        for(Entry<Integer, StudentPojo> entry: studentdatabaseshallowcopy.entrySet()) 
        {
			int key=entry.getKey();
	        StudentPojo studentobj=studentdatabase.get(key);		
	        System.out.println(" Name : "+studentobj.getName() +" \n SchoolName : "+studentobj.getSchoolname() +" \n Age : "+studentobj.getAge()+" \n Rollno : "+studentobj.getRollno());
        }
        StudentDetails studentObj=new StudentDetails();
        studentObj.Homepage();

	}
	
	public static void main(String[] args) {
       
        StudentDetails studentObj=new StudentDetails();
       studentObj.Homepage();                 
	}



    private void Homepage() 
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println(" 1. Add Student Details \n 2. Student Count  \n 3. CloneArrays \n 4.delete all details"
        		+"\n 5. checkEmptyOrNot  \n 6.shallow copy \n 7.searchStudentDetails(rollno) \n 8.contains specified student details \n 9.set View of the student ");
        String choice=scanner.next();
         StudentDetails studentObj=new StudentDetails();
        switch (choice) {
 	   case "1": {
 		     studentObj.addStudentDetails();
 		   break;
 		}
 	   case "2":{
 		   System.out.println();
            System.out.println(" Student Count : "+studentdatabase.size());
 		   break;
 	   }
 	
 	   case "3":{
 		   studentObj.cloneArray();
 		   break;
 	   }
 	   case "4":{
 		   studentObj.removeAllStudentDetails();
 		   break;
 	   }
 	   case "5":{
 		   studentObj.checkEmptyOrNot();
 		   break;
 	   }
 	   case "6":{
 		   studentObj.shallowCopy(); 
 		   break;
 	   }
 	   case "7":{
 		   studentObj.searchStudentDetails();
 		   break;
 	   }
 	   case "8":{
 	       studentObj.specifiedstudentdetals();
 		   break;
 	   }
 	   case "9":{
 		   studentObj.setViewOfTheStudentsDetails();
 	   }
     	default:
 		throw new IllegalArgumentException("Unexpected value: " + choice);
 	}
    	
    }


	private void specifiedstudentdetals() {
	
		if(studentdatabase.isEmpty()) 
		{
			System.out.println("Student database empty !!");
		}
		
		Scanner scanner=new Scanner(System.in);
		System.out.println(" Enter Name : ");
		 String name=scanner.next();
          boolean flag=false;
	        for(Entry<Integer, StudentPojo> entry: studentdatabaseshallowcopy.entrySet()) 
	        {
				int key=entry.getKey();
		        StudentPojo studentobj=studentdatabase.get(key);		
			    if(studentobj.getName().equals(name)) {
		           flag=true;    
			    break;
			    }
	        }
	        
          if(flag) 
          {
        	  System.out.println("this Student details store in database ");
          }
          else 
          {
        	  System.out.println("this Student details not in database ");  
          }
	        
	        StudentDetails studentObj=new StudentDetails();
	        studentObj.Homepage();

		 
		
		
	}







	


	



    


	

}
