package Practicejava;

public class PlainDromeInteger {
	
	public static void main(String[] args) {
		if(checkPlaindrome(121)) {
			System.out.println("plaindrome");
		}
		else {
			System.out.println("not plainDrome");
		}
	}
	
	public static boolean checkPlaindrome(int numbers) {
		int originalNumbrs=numbers;
		int storeReversenumber=0;
		while(numbers>0) {
		int remainder = numbers%10;
		    storeReversenumber=storeReversenumber*10+remainder;
		     numbers=numbers/10;
		   //  count++;
		}
		
		if(storeReversenumber==originalNumbrs) {
			return true;
		}
		return false;
		
	}

}
