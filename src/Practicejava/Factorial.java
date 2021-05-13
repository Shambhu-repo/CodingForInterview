package Practicejava;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int k =    factorial(9);
            System.out.println(k);
	}
	
	public static int factorial(int num) {
		if(num<=0) {
			return 1;
		}
		int result=1;
		
		for(int j=1;j<=num;j++) {
			 result= result*j;
			
		}
		return result;
	}

}
