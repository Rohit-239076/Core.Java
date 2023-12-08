package Com.Employee;

import java.time.LocalDate;

public class Employee implements Comparable<Employee> { 
	private int id;
	private String fname;
	private double salary;
	private LocalDate dateOfJoin;
	
	
	public Employee(int id, String fname, double salary, LocalDate dateOfJoin) {
		super();
		this.id = id;
		this.fname = fname;
		this.salary = salary;
		this.dateOfJoin = dateOfJoin;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public LocalDate getDateOfJoin() {
		return dateOfJoin;
	}


	public void setDateOfJoin(LocalDate dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", fname=" + fname + ", salary=" + salary + ", dateOfJoin=" + dateOfJoin + "]";
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Employee)
			return this.fname.equals(((Employee)obj).fname);
		return false;
	}

	
	@Override
	public int compareTo(Employee e) {
		return this.fname.compareTo(e.fname);
		
	}
}



