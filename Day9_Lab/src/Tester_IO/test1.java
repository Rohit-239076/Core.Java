package Tester_IO;

import static utils.IOUtils.storeProductDetails;
import static utils.ShopUtils.*;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.shop.core.Product;

public class test1 {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			// get populated map
			Map<Integer, Product> productMap = populateProductMap(populateProductList());
			System.out.println("Choose product category");
			String categoryName = sc.nextLine();
			System.out.println("Enter file name");
			String fileName = sc.nextLine();
			// invoke IOUtils method to store process product details
			storeProductDetails(productMap, fileName, categoryName);
			System.out.println("products stored successfully !");
		} catch (Exception e) {
			e.printStackTrace();
		}	
}
	}


