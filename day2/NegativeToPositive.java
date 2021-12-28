package week1.day2;


public class NegativeToPositive {

	public static void main(String[] args) {
		
		int num = -40;
		
		int temp = 0;
		
		if (num<0) {
			
			temp = num * -1;
			
			System.out.println("Negative number -40 converted to:" +(temp));
			
		} else if(num>0){
			
			System.out.println("The number is positive");

		}

		
		
	}

	

}
