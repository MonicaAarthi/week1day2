package week1.day2;



public class Palindrome {

	public static void main(String[] args) {
	
		int num = 34343;
		int rev = 0; 
		int temp;
	
		temp=num;
			
	for(int i=1; i<=5; i++) {
		
		rev = (rev*10) + (num%10);
		num = num/10;
	  	
	}
	
	if (temp == rev) {

		System.out.println("Its a palindrome number");
		
	} else {
		
		System.out.println("Its not a palindrome number");

	}
		
	
		
	}

}
