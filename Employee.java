package org.cap.demo;

public class Employee implements Comparable<Employee> {
	private int empId;
	private String firstName;
	private String lastName;
	private double salary;
	
	public Employee(){}
	
	public Employee(int empId, String firstName, String lastName, double salary) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empId != other.empId)
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ "]";
	}

	public int compareTo(Employee emp) {
		/*if(this.getEmpId()>emp.getEmpId())
			return 1;
		else if(this.getEmpId()<emp.getEmpId())
			return -1;
		else
			return 0;*/
		
		
		/*if(this.getFirstName().compareTo(emp.getFirstName())>0)
			return 1;
		else if(this.getFirstName().compareTo(emp.getFirstName())<0)
			return -1;
		else 
			return 0;*/
		
		if(this.getSalary()>emp.getSalary())
			return 1;
		else if(this.getSalary()<emp.getSalary())
			return -1;
		else
			return 0;
		
	}
	
	

}
