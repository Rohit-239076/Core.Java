package utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Comparator;
import com.shop.core.*;
import java.util.Map;

import com.shop.core.Product;

public interface IOUtils {
	static void storeProductDetails(Map<Integer,Product> productMap,String fileName,String categoryName) throws IOException {

		Category cat=Category.valueOf(categoryName.toUpperCase());
		Comparator<Product> comp =(p1,p2)->p1.getManufactureDate().compareTo(p2.getManufactureDate());
		
		
		try(PrintWriter pw = new PrintWriter(new FileWriter(fileName))){
			
			productMap.values()
			.stream()
			.filter(p->p.getProductCategory()== cat)
			.sorted(comp)
			.forEach(p->pw.println(p));			
		
		}
	
		
		
	}

}
