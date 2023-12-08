package Tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import Com.Employee.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			List<Employee>e=new ArrayList<>();
			//int id, String fname, double salary, LocalDate dateOfJoin
			
			Employee e1=new Employee(1,"Rohit",1000,LocalDate.parse("1999-06-23"));
			e.add(e1);
			
			Employee e2=new Employee(1,"Sudhir",2000,LocalDate.parse("1983-11-01"));
			e.add(e2);
			
			
			Employee e3=new Employee(1,"lokesh",3000,LocalDate.parse("1997-01-08"));
			e.add(e3);
			
			
			boolean exist = false;
			while(!exist) {
				
				System.out.println("Sort By 1: By fname  2: By Salary 3: By DateOfJoin 4: Show All 0:Exits ");
				
				
				try {
					switch(sc.next()) {
					
					     case 1: 
						 Collections.sort(e);
						 System.out.println("Sorting Succes....!!");
				         break;
					     case 2:
						 Collections.sort(e, new comptwo());
						 System.out.println("Sorting Succes by Salary...!!");
						 break;
						 
						 case 3:
						 Collections.sort(e,new sortdoj);
						 System.out.println("Sorting Sucess By DateOfJoin...!!");
						 break;
						 case 4: 
							 Collections.sort(Employee emp:e){
								 System.out.println(emp);
							 }
							 break;
						   
						 case 0:
							 exit = true;
							 
						   
						
						
					}
					
				}
				
				
			}
			
			
			
		}
	}

}
