package Practicejava;

public class ArmStrong {
	public static void main(String[] args) {
		if(checkArmStrong(153)) {
			System.out.println("is armstrong");
		}
		else {
			System.out.println("is not armStrong");
		}
		
	}
	public static boolean checkArmStrong(int numbers) {
		int originalNumbers=numbers;
		int armStrongNumStore=0;
		
		while(numbers>0) {
			int remainder=numbers%10;
			numbers /=10;
			armStrongNumStore=armStrongNumStore+(remainder*remainder*remainder);
			
		}
		if(armStrongNumStore==originalNumbers) {
			return true;
		}
		
		return false;
		
		
	}

}
