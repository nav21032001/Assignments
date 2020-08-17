package assignment;

import java.util.Scanner;

public class FibonacciWithRecurrsion {
	
	static int n1 = 0, n2 = 1 ,n3=0;
	
	static void fib(int count) {
		
		
		  if(count>0){    
		         n3 = n1 + n2;    
		         n1 = n2;    
		         n2 = n3;    
		         System.out.print(" "+n3);   
		         fib(count-1);    
		     }    
	
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int n =sc.nextInt();
		
		System.out.print(0 + " " + 1);
		
		fib(n-2);

		
	}

}
