package week1.day2;

public class SecondSmallestNumberArray {

	public static void main(String[] args) {
		
	int[] arr = {23,45,67,32,89,22};
	
	int small = arr[0];
	int secsmall = arr[0];
		
	for (int i = 0; i < arr.length; i++) {
		
	if (arr[i] < small) {
	
		small = arr[i];
	}	
	
	if (arr[i] > small && arr[i] < secsmall) {
	
		secsmall = arr[i];
	
	}
		
	}
		
	System.out.println(" Second Smallest number in array is:" +(secsmall));
		
	}
	
		 
}
	
		
	

