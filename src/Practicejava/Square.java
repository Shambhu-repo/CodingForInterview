package Practicejava;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =9;
				if(square(a)) {
					System.out.println("Given number  is perfect square");

				}
				else {
					System.out.println("is not perfect square");
				}

	}
	
	public static boolean square(int number) {
		for(int i=1;i*i<=number;i++) {
			if(number%i==0 && number/i==i) {
					return true;
}
			
		}
		
		return false;
		
	}
	
}
