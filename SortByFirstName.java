package org.cap.demo;

import java.util.Comparator;

public class SortByFirstName implements Comparator<Employee>{

	public int compare(Employee emp1, Employee emp2) {
		if(emp1.getFirstName().compareTo(emp2.getFirstName())>0)
			return 1;
		else if(emp1.getFirstName().compareTo(emp2.getFirstName())<0)
			return -1;
		else 
			return 0;
	}

}
