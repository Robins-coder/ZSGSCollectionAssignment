package zsgsfirstAssignment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StudentsInfo {

	static ArrayList<StudentsDetailPojo> studentsDataBase=new ArrayList<StudentsDetailPojo>();
    static	ArrayList<StudentsDetailPojo> studentsDataBasecopy;
	static ArrayList<StudentsDetailPojo> studentsDataBaseclone=new ArrayList<StudentsDetailPojo>();


	


	private void swapTwoElement() {

    Scanner scanner=new Scanner(System.in);
    System.out.println(" Swap Two Element ");
    System.out.println(" Enter First Element Position : ");
    int firstpos=scanner.nextInt();
    System.out.println(" Enter Second Element  Position : ");
	int secondpos=scanner.nextInt();

    
	StudentsDetailPojo temp=studentsDataBase.get(firstpos);
	studentsDataBase.set(firstpos,studentsDataBase.get(secondpos));
	studentsDataBase.set(secondpos, temp);
	

	Iterator<StudentsDetailPojo> itr=studentsDataBase.iterator();
	System.out.println(" Name \t Rollno \t Age \t SchoolName");
	while(itr.hasNext()) 
	{   StudentsDetailPojo getdetail=itr.next();
	    System.out.println();    	
        System.out.println(" "+getdetail.getName()+" \t "+getdetail.getRollno()+" \t "+getdetail.getAge()+" \t "+getdetail.getSchoolName());
	}

	
	StudentsInfo.main(null);
	
	
		
	}

	private void compareTwoArrayList() {


		boolean referenceArray=studentsDataBase==studentsDataBaseclone;
		
		boolean valueArray=true;
		
		for(int i=0;i<studentsDataBase.size();i++) 
		{          
		          if(studentsDataBase.get(i).getName().equals(studentsDataBasecopy.get(i).getName())) 
			      {
			    	   if(studentsDataBase.get(i).getAge()==studentsDataBasecopy.get(i).getAge()) 
			    	   {
			    		  if(studentsDataBase.get(i).getSchoolName().equals(studentsDataBasecopy.get(i).getSchoolName())) 
			    		  {
			    			  valueArray=true;
					    	   continue;
						  }
			    		  else 
			    		  {  System.out.println("schooll........");
			    			  valueArray=false;
					    	  break;
			    		  }
			    	   }
			    	   else 
			    	   {   System.out.println("age........");
			    		   valueArray=false;
			    		   break;
			    	   }
			      }	
			      else 
			      {   System.out.println("name........");
			    	  valueArray=false;
			    	  break;
			      }		
		
		
		}
		
		     System.out.println(" Reference Element Compare : "+referenceArray);
             System.out.println(" Values Compare : "+ valueArray);
				StudentsInfo.main(null);
		
		
	}





	private void printpositionofArraylist() {
        System.out.println();
        System.out.println(" print all the elements of a ArrayList using the position of the elements");
		int studentlistlength=studentsDataBase.size()-1;
		System.out.println(" Name \t Rollno \t Age \t SchoolName");
		
		for(int i=0;i<=studentlistlength;i++) 
		{
		   
			StudentsDetailPojo studentlist=studentsDataBase.get(i);
		    
		    System.out.println();    	
	        System.out.println(" "+studentlist.getName()+" \t "+studentlist.getRollno()+" \t "+studentlist.getAge()+" \t "+studentlist.getSchoolName());
	
	       		
		}
		StudentsInfo.main(null);

		
	}





	private void increaseSizeofCapacity() {
		
		studentsDataBase.ensureCapacity(100);
		System.out.println( " Increase Capacity !!!");
		StudentsInfo.main(null);

	}





	private void trimtoCapacity() {
            
		   studentsDataBase.trimToSize();
		   System.out.println("trim to capacity successfully !!");
			StudentsInfo.main(null);

	}


	private void empty() {

		System.out.println(" start to delete StudentList..!! ");
		
		studentsDataBase.clear();
		System.out.println("clear studentList !!");
		StudentsInfo.main(null);
		
	}



	private void checkEmptyOrNotAndEmpty() {
		
		boolean checkEmpty=studentsDataBase.isEmpty();
		
		if(checkEmpty) 
		{
			System.out.println(" student Data Base is Empty !!");
		}
		else 
		{
			System.out.println( " Student Data Base Not Empty !!");
		}
		
     StudentsInfo.main(null);		
		
		
	}





	private void joinTwoArrayList() {
		
		studentsDataBaseclone.addAll(studentsDataBase);
		System.out.println();
		System.out.println(" Join students info ");
		System.out.println();
        Collections.reverse(studentsDataBase);
		Iterator<StudentsDetailPojo> itr=studentsDataBaseclone.iterator();
		System.out.println(" Name \t Rollno \t Age \t SchoolName");
		while(itr.hasNext()) 
		{   StudentsDetailPojo getdetail=itr.next();
		    System.out.println();    	
	        System.out.println(" "+getdetail.getName()+" \t "+getdetail.getRollno()+" \t "+getdetail.getAge()+" \t "+getdetail.getSchoolName());
		}

		StudentsInfo.main(null);

	}


	private void cloneAnArrayList() {

		
		studentsDataBaseclone=(ArrayList<StudentsDetailPojo>) studentsDataBase.clone();
		
		System.out.println();
		System.out.println(" Clone student info ");
		System.out.println();
        Collections.reverse(studentsDataBase);
		Iterator<StudentsDetailPojo> itr=studentsDataBaseclone.iterator();
		System.out.println(" Name \t Rollno \t Age \t SchoolName");
		while(itr.hasNext()) 
		{   StudentsDetailPojo getdetail=itr.next();
		    System.out.println();    	
	        System.out.println(" "+getdetail.getName()+" \t "+getdetail.getRollno()+" \t "+getdetail.getAge()+" \t "+getdetail.getSchoolName());
		}

		StudentsInfo.main(null);
     		
		
	}


	private void extractAPortionOfStudentInfo() {
		System.out.println();
		System.out.println("extract a portion of student info !!");
		List<StudentsDetailPojo> subList=studentsDataBase.subList(0, 1);
        System.out.println();		
		Iterator<StudentsDetailPojo> itr=subList.iterator();
		System.out.println(" Name \t Rollno \t Age \t SchoolName");
		while(itr.hasNext()) 
		{   StudentsDetailPojo getdetail=itr.next();
		    System.out.println();    	
	        System.out.println(" "+getdetail.getName()+" \t "+getdetail.getRollno()+" \t "+getdetail.getAge()+" \t "+getdetail.getSchoolName());
		}

		StudentsInfo.main(null);

	}

	private void reverseStudentInfo() {
		System.out.println();
		System.out.println(" reverse student info ");
		System.out.println();
        Collections.reverse(studentsDataBase);
		Iterator<StudentsDetailPojo> itr=studentsDataBase.iterator();
		System.out.println(" Name \t Rollno \t Age \t SchoolName");
		while(itr.hasNext()) 
		{   StudentsDetailPojo getdetail=itr.next();
		    System.out.println();    	
	        System.out.println(" "+getdetail.getName()+" \t "+getdetail.getRollno()+" \t "+getdetail.getAge()+" \t "+getdetail.getSchoolName());
		}

		StudentsInfo.main(null);

	}

	private void shuffleStudentInfo() {

		System.out.println();
		System.out.println("   Shuffle Array List ");
		System.out.println();
		Collections.shuffle(studentsDataBase);
		
		Iterator<StudentsDetailPojo> itr=studentsDataBase.iterator();
		System.out.println(" Name \t Rollno \t Age \t SchoolName");
		while(itr.hasNext()) 
		{   StudentsDetailPojo getdetail=itr.next();
		    System.out.println();    	
	        System.out.println(" "+getdetail.getName()+" \t "+getdetail.getRollno()+" \t "+getdetail.getAge()+" \t "+getdetail.getSchoolName());
		}

		StudentsInfo.main(null);

		
	}

	private void copyArrayList() {
		System.out.println();
		System.out.println("   Copy Array List ");
		studentsDataBasecopy=studentsDataBase;
		
		Iterator<StudentsDetailPojo> itr=studentsDataBasecopy.iterator();
		System.out.println(" Name \t Rollno \t Age \t SchoolName");
		while(itr.hasNext()) 
		{   StudentsDetailPojo getdetail=itr.next();
		    System.out.println();    	
	        System.out.println(" "+getdetail.getName()+" \t "+getdetail.getRollno()+" \t "+getdetail.getAge()+" \t "+getdetail.getSchoolName());
		}
		
		StudentsInfo.main(null);
		
	}

	private void sortNameAsc() {
		  
		Collections.sort(studentsDataBase, new NameComparator());
         		
		Iterator<StudentsDetailPojo> itr=studentsDataBase.iterator();
		System.out.println(" Name \t Rollno \t Age \t SchoolName");
		while(itr.hasNext()) 
		{   StudentsDetailPojo getdetail=itr.next();
		    System.out.println();    	
	        System.out.println(" "+getdetail.getName()+" \t "+getdetail.getRollno()+" \t "+getdetail.getAge()+" \t "+getdetail.getSchoolName());
		}

     System.out.println();

		StudentsInfo.main(null);
		
	}

	private void searchForTheStudentInfo() {
		Scanner scanner=new Scanner(System.in);
		System.out.println();
        System.out.println("Enter Roll No to View Student info : ");
        int rollno=scanner.nextInt();

        int findindex=0;
        for(StudentsDetailPojo studentlist : studentsDataBase ) 
        {
        	if(rollno==studentlist.getRollno()) 
        	{
               break;   
	             
        	}
        	findindex++;
        }
        
        System.out.println();
		System.out.println(" Name \t Rollno \t Age \t SchoolName");
        StudentsDetailPojo getstudentdata=studentsDataBase.get(findindex);
        System.out.println(" "+getstudentdata.getName()+" \t "+getstudentdata.getRollno()+" \t "+getstudentdata.getAge()+" \t "+getstudentdata.getSchoolName());
	
		StudentsInfo.main(null);
		
		
	}

	private void removeTheThirdElement() {
		
		System.out.println();
		try {
			studentsDataBase.remove(2);		
             System.out.println("Remove third Element");
			System.out.println();
			Iterator<StudentsDetailPojo> itr=studentsDataBase.iterator();
			System.out.println(" Name \t Rollno \t Age \t SchoolName");
			while(itr.hasNext()) 
			{   StudentsDetailPojo getdetail=itr.next();
			    System.out.println();    	
		        System.out.println(" "+getdetail.getName()+" \t "+getdetail.getRollno()+" \t "+getdetail.getAge()+" \t "+getdetail.getSchoolName());
			}

	       System.out.println();

		} catch (Exception e) {
           System.out.println("No Third Element !!!");
		}

		
		StudentsInfo.main(null);

		
	}

	private void updateSpecificStudent() {
		Scanner scanner=new Scanner(System.in);		
		System.out.println();
        System.out.println("Enter Roll No to Update : ");
        int rollno=scanner.nextInt();

        int findindex=0;
        for(StudentsDetailPojo studentlist : studentsDataBase ) 
        {
        	if(rollno==studentlist.getRollno()) 
        	{
               break;   
	             
        	}
        	findindex++;
        }
        
		System.out.println("Enter name : ");
		String name=scanner.next();
		System.out.println("Enter Age : ");
		int age=scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter SchoolName :");
		String schoolName=scanner.nextLine();

         StudentsDetailPojo studentdata=new StudentsDetailPojo();
         studentdata.setName(name);
         studentdata.setSchoolName(schoolName);
         studentdata.setRollno(rollno);
         studentdata.setAge(age);

         
         studentsDataBase.set(findindex, studentdata);

         System.out.println();
         System.out.println(" Update Details !!");
			Iterator<StudentsDetailPojo> itr=studentsDataBase.iterator();
			System.out.println(" Name \t Rollno \t Age \t SchoolName");
			while(itr.hasNext()) 
			{   StudentsDetailPojo getdetail=itr.next();
			    System.out.println();    	
		        System.out.println(" "+getdetail.getName()+" \t "+getdetail.getRollno()+" \t "+getdetail.getAge()+" \t "+getdetail.getSchoolName());
			}

         System.out.println();
			StudentsInfo.main(null);

	}

	private void retriveIndexPosition() {
		Scanner scanner=new Scanner(System.in);		
		System.out.println();
		System.out.println("Enter Index position (0-"+(studentsDataBase.size()-1)+") to retrive studentInfo :");
		int index=scanner.nextInt();
		System.out.println();
		System.out.println(" Name \t Rollno \t Age \t SchoolName");
        StudentsDetailPojo getstudentdata=studentsDataBase.get(index);
        System.out.println(" "+getstudentdata.getName()+" \t "+getstudentdata.getRollno()+" \t "+getstudentdata.getAge()+" \t "+getstudentdata.getSchoolName());

		StudentsInfo.main(null);

	}

	private void insertFirstPosition() {
        System.out.println();    
		System.out.println("        insertFirstPosistion       ");
     		Scanner scanner=new Scanner(System.in);

		        System.out.println();
				System.out.println("How many students details Enter : ");
				int studentCount=scanner.nextInt();
				
				while(studentCount!=0) 
				{   
					System.out.println("Enter name : ");
					String name=scanner.next();
					System.out.println("Enter Age : ");
					int age=scanner.nextInt();
					System.out.println("Enter RollNo :");
					int rollNo=scanner.nextInt();
					scanner.nextLine();
					System.out.println("Enter SchoolName :");
					String schoolName=scanner.nextLine();

		             StudentsDetailPojo studentdata=new StudentsDetailPojo();
		             studentdata.setName(name);
		             studentdata.setSchoolName(schoolName);
		             studentdata.setRollno(rollNo);
		             studentdata.setAge(age);
		        	studentsDataBase.add(0,studentdata);
					studentCount--;
				}

				Iterator<StudentsDetailPojo> itr=studentsDataBase.iterator();
				System.out.println(" Name \t Rollno \t Age \t SchoolName");
				while(itr.hasNext()) 
				{   StudentsDetailPojo getdetail=itr.next();
				    System.out.println();    	
			        System.out.println(" "+getdetail.getName()+" \t "+getdetail.getRollno()+" \t "+getdetail.getAge()+" \t "+getdetail.getSchoolName());
				}

				StudentsInfo.main(null);

		
	}

	private void addStudentdetails() {

		
		Scanner scanner=new Scanner(System.in);

		  System.out.println("How many students details Enter : ");
				int studentCount=scanner.nextInt();
				
				while(studentCount!=0) 
				{   
					System.out.println("Enter name : ");
					String name=scanner.next();
					System.out.println("Enter Age : ");
					int age=scanner.nextInt();
					System.out.println("Enter RollNo :");
					int rollNo=scanner.nextInt();
					scanner.nextLine();
					System.out.println("Enter SchoolName :");
					String schoolName=scanner.nextLine();

		             StudentsDetailPojo studentdata=new StudentsDetailPojo();
		             studentdata.setName(name);
		             studentdata.setSchoolName(schoolName);
		             studentdata.setRollno(rollNo);
		             studentdata.setAge(age);
		        	studentsDataBase.add(studentdata);
					studentCount--;
				}
				
				Iterator<StudentsDetailPojo> itr=studentsDataBase.iterator();
				System.out.println(" Name \t Rollno \t Age \t SchoolName");
				while(itr.hasNext()) 
				{   StudentsDetailPojo getdetail=itr.next();
				    System.out.println();    	
			        System.out.println(" "+getdetail.getName()+" \t "+getdetail.getRollno()+" \t "+getdetail.getAge()+" \t "+getdetail.getSchoolName());
				}

				StudentsInfo.main(null);

		
	}
	
	public static void main(String[] args) {

		StudentsInfo studentsinfoObj=new StudentsInfo();
		
        System.out.println();
		System.out.println(" 0. add some student details And iterate  \n  1. insert an element"
				+ "\n 2. retrieve an element  \n 3. update specific student \n 4. remove the third element "
				+ "\n 5. search for the student info \n 6. sort a student lis \n 7. copy one array list into another array list"
				+ "\n 8. shuffle student info  \n 9. reverse student info \n 10. extract a portion of student info \n "
				+ "\n 11. compare two array lists \n 12. swap two elements \n 13. join two array lists \n 14. clone an array list to another array list"
				+ "\n 15 . delete(Empty) student list \n 16. test whether an array list is empty or not \n 17. trim the capacity  \n 18. increase the size of an array list"
				+ "\n 19. print all the elements of a ArrayList using the position of the elements ");
		
		
          Scanner scanner=new Scanner(System.in);
		  String choice=scanner.next();
		switch (choice) {
		case "0":{
			studentsinfoObj.addStudentdetails();
			break;
		}
		case "1": {
			
			studentsinfoObj.insertFirstPosition();
           break; 		
		}
		case "2":{
			 studentsinfoObj.retriveIndexPosition();;
			 break;
		}
		case "3":{
			 studentsinfoObj.updateSpecificStudent();;
			break;
		}
		case "4":{
			 studentsinfoObj.removeTheThirdElement();
			break;
		}
		case "5":{
			 studentsinfoObj.searchForTheStudentInfo();
			break;
		}
		case "6":{
			studentsinfoObj.sortNameAsc();
			break;
		}
		case "7":{
			studentsinfoObj.copyArrayList();
			break;
		}
		case "8":{
			studentsinfoObj.shuffleStudentInfo();
			break;
		}
		case "9":{
			studentsinfoObj.reverseStudentInfo();
			break;
		}
		case "10":{
			studentsinfoObj.extractAPortionOfStudentInfo();
			break;
		}
		case "11":{
			studentsinfoObj.compareTwoArrayList();
			break;
		}
		case "12":{
			studentsinfoObj.swapTwoElement();
			break;
		}
		case "13":{
			studentsinfoObj.joinTwoArrayList();
			break;
		}
		case "14":{
			studentsinfoObj.cloneAnArrayList();;
			break;
		}
		case "15":{
			studentsinfoObj.empty();
			break;
		}
		case "16":{
			studentsinfoObj.checkEmptyOrNotAndEmpty();
			break;
		}
		case "17":{
			studentsinfoObj.trimtoCapacity();
			break;
		}
		case "18":{
			studentsinfoObj.increaseSizeofCapacity();
			break;
		}
		case "19":{
			studentsinfoObj.printpositionofArraylist();
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
	}







}
