package tester;

import java.util.ArrayList;
import java.util.Map;

import com.app.core.Student;
import static utils.StudentCollectionUtils.*;

public class Test1 {

	public static void main(String[] args) {
       
		Map<String, Student> studentMap = populateMap (populateList());
		//Method 1
//		for(Student s:studentMap.values()) {
//			System.out.println();
//		}
		//Method 2
//		ArrayList<Student> list=new ArrayList<>(studentMap.values());
//		for(Student s:list) {
//			System.out.println(s);
//		}
		//Method 3
		studentMap.values().stream().forEach(p->System.out.println(p));
    

	}

}
