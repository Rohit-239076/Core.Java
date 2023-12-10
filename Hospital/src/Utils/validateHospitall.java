package Utils;
import java.time.LocalDate;

import com.code.core.Doctor;

import CustomInvalidException.HospitalException;
//import CustomeInvalidException.HospitalException;

public class validateHospitall {
public static Doctor validateAll(int docid, int experience, String dname, String email, String degree,
		String joinDate, double salary)throws HospitalException {
	
	LocalDate jDate=LocalDate.parse(joinDate);
	validateDate(jDate);
 return new Doctor(docid,experience,dname,email,degree,jDate,salary);
			

}

private static void validateDate(LocalDate jDate)throws HospitalException {
	LocalDate checkdate=LocalDate.parse("2001-05-10");
	if(jDate.isBefore(checkdate)) {
		throw new HospitalException("Enter Date After 2001,05,10");
	}
}
}
