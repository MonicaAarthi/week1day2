package week1.day2;




public class Calculator {

	public int add(int num1, int num2) {

		return num1+num2;

	} 
	
	
	public int sub(int num1, int num2) {

		return num1-num2;

	}
	
	public int mul(int num1, int num2) {

		return num1*num2;

	}
	
	public double div(double num1, double num2) {

		return num1/num2;

	}
	
	
	
	public static void main(String[] args) {
		
		Calculator cal = new Calculator ();
		
		int add = cal.add(10,20);
		
		System.out.println("sum of 10 and 20 is:" +(add));
		
		
		int sub = cal.sub(10, 20);
		
		System.out.println("sub of 10 and 20 is:" +(sub));
		
		
		
        int mul = cal.mul(10,20);
		
		System.out.println("multiplication of 10 and 20 is:" +(mul));
		
		

		double div = cal.div(10, 20);
		
		System.out.println("dividing 10 by 20:" +(div));
		
	}
	
	
	
	
	
}
