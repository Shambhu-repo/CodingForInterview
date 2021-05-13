package Practicejava;
//
public class PrimeNumber {

	public static void main(String[] args) {
		
		if(prime(2)) {   //note : always in if block : first it execute true and in else execute false statement
			System.out.println("this is   prime");
		}
		else {
			System.out.println("This is not prime");
		}

	}
	
	public static boolean prime(int number) {
		
		for(int i=2;i<=number/2;i++) {
			if(number%i==0) {
				return false;
			}
			
		}
		return true;

	}

}
