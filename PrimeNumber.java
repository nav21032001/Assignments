package assignment;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please insert any number");
		
		int n = sc.nextInt();
		
		if(isPrime(n)) {
			System.out.println(n + " is a prime number");
		}
		
		
		

	}
	static boolean isPrime(int n) {  
	    if (n%2==0) return false;  
	    for(int i=3;i<=Math.sqrt(n);i+=2) { 
	        if(n%i==0) 
	            return false; 
	    } 
	    return true; 
	} 

}
