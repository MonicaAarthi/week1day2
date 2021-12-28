package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		int[] data = {3,2,11,4,6,7};
		
		Arrays.sort(data);
		
		int secondlargest = data.length -2;
		
		System.out.print("Second Largest number is:" +data[secondlargest]);
			

	}

}
