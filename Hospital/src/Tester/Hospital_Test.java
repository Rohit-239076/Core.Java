package Tester;

import java.time.LocalDate;
import static Utils.validateHospitall.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.code.core.Department;
import com.code.core.Doctor;

public class Hospital_Test {
 public static List<Doctor> doctList=new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(Scanner sc=new Scanner(System.in)){
			boolean exit=false;
			while(!exit) {
				System.out.println("1:Sign in \n"
						+"2:Dispaly Name Of specific Dr\n"
						+"3:Add A New Dr."
						);
				
				try {
					switch(sc.nextInt()) {
					
					case 0: exit=true;
					   break;
					
					case 1:System.out.println("1:Sign in..");
//					int docid, int experience, String dname, String email, String degree, LocalDate joinDate, 
					//double salary,
//					Department dept
					System.out.println("Enter DocId,Experi,dname,email,degree,joinDate,Salary");
					Doctor D=validateAll(sc.nextInt(),sc.nextInt(),sc.next(),sc.next(),
							sc.next(),sc.next(),
							sc.nextDouble());
					doctList.add(D);
					System.out.println("Doctor Added suce...!!");
					break;
					case 2:System.out.println("Display Name Of Specific Dr.");
					for(Doctor dc:doctList) {
						System.out.println(dc);
					}
					break;
					
					}
					
					
				}catch(Exception e) {
					System.out.println(e);
				}
				
				
			}
			
			
		}

	}

}
