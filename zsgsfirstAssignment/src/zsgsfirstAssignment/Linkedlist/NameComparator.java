package zsgsfirstAssignment.Linkedlist;

import java.util.Comparator;

public class NameComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		StudentsDetailPojo s1=(StudentsDetailPojo) o1;
		StudentsDetailPojo s2=(StudentsDetailPojo) o2;
		
		return s1.getName().compareTo(s2.getName());
	}
	
	

}
