package Practicejava;

import java.util.Scanner;

public class Fabiccino {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Type number for fabonacci : ");
		Scanner scanner = new Scanner(System.in);
		 int number = scanner.nextInt();
		 
		 for(int m=1;m<=number;m++) {
		int result= fabi(m);
	      System.out.println(" Loop : " + result);

		 }
		 
		int  result1= fabi1(number);
		System.out.println(" Recursion  : "+result1);
      scanner.close();
      
	}
	
	public static int fabi(int numbers) {
		
		 if(numbers==1 || numbers==2) {
			 return 1;                          // first declear the fixed condition return 1; 
		} 
		 
		
		 int fabi1 =1;
		 int fabi2=1;
		 int fabonacci=1;

		
		for(int l=2;l<=numbers;l++) {
			fabonacci = fabi1+fabi2;
			 fabi1=fabi2;
			fabi2=fabonacci;
			
		}
		return fabonacci;
		
		
	}
	
	public static int fabi1 (int numbers) {
		if (numbers<=1) 
			return numbers;
		    return fabi1(numbers-1)+fabi1(numbers-2);
	
		}
		
	}
	
	


