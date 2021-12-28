package week1.day2;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,7,6,8}; 
		int sum1 = 0;
		int sum2 = 0;
		
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			
			sum1 = sum1 + arr[i];
					
		}
		
		for (int i = 1; i<= 8; i++) {
			
			
			sum2 = sum2 + i;
			
		}
		
		
		System.out.println("Missing Element is:"+(sum2-sum1));
		
		
		

	}

}
