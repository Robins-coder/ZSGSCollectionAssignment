package zsgsfirstAssignment.HashMapAssignment;

public class StudentPojo {

	private String name;
	private int age;
	private String schoolname;
	private long rollno;
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getSchoolname() {
		return schoolname;
	}
	public long getRollno() {
		return rollno;
	}
	
	
	public void setStudentdetails(String name ,String schoolname,long rollno,int age) 
	{
		this.name=name;
		this.schoolname=schoolname;
		this.rollno=rollno;
		this.age=age;
	} 
	
}
