package Practicejava;

public class PlainDromeString {
public static void main (String[]args) {
	
	if(plaindrome("")) {
		System.out.println("is plaindrome");
	}
	else {
		System.out.println("is not plaindrome or Empty or Blank");
	}
	
}

public static boolean plaindrome(String input) {
	
	if(input==null || input.isEmpty() || input.isBlank()) {
		return false;
	}
	
	char [] array = input.toCharArray();
	
	int length=array.length;
	
	
	StringBuilder sb = new StringBuilder();

	for(int i=length-1; i>=0 ; i--) {
	sb.append(array[i]);
	}
	String reversedString = sb.toString();
	
	if(input==reversedString) {
		return true;
		
	}
	
	return false;

	
}
}
