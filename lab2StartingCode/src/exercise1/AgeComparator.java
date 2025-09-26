package exercise1;

import java.util.Comparator;

public class AgeComparator implements Comparator <Student> {
	
	// create the compare method of comparator interface
	
	@Override
	public int compare(Student s1, Student s2) {
		
		int ageComparison = Integer.compare(s1.getAge(), s2.getAge());
		
		if(ageComparison == 0) {
			return s1.getName().compareTo(s2.getName());
			
		}
		
		return ageComparison;
	}

}
