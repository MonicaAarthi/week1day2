package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
	int input = 153;
	int sum = 0;
	int temp = input;
	
	while (input>0) {
		
		int rem = input%10;

		sum =sum +(rem*rem*rem);
		input = input/10;
		
	}
		
		if(sum == temp) {
			
			System.out.println("It's an armstrong number");
		} 
		
		else {
			
			System.out.println("It's not an armstrong number");
		}
		
	
		
	}
		
				
		
	}
	
	
