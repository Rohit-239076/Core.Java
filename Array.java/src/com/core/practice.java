
package com.core;
import java.io.*;
import java.util.*;

public class practice {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
    
        int i = 0;
        int j = A.length()-1;
              
        boolean flag = false;
        
        while(i <= j/2){
            
            if(A.charAt(i) == A.charAt(j)){
                
                i++;
                j--;               
            }
            else{
                
                flag = true;
                i = j;
            }  
        }
        
        if(flag == false){
            
            System.out.println("Yes");                
        }
        else{
            
            System.out.println("No");           
        }        
    }
}

 
