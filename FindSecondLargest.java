package week1.day2.assignment;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data= {3,2,11,4,6,7};
		int len=data.length;
		System.out.println("before sorting elements array:");
		for (int i = 0; i < len; i++) {
			System.out.println(data[i]);
		}
		Arrays.sort(data);
		
		System.out.println("after sorting elements array:");
		for (int i = 0; i < len; i++) {
			System.out.println(data[i]);
		}
		
		System.out.println("Second largest number in array: "+data[len-2]);
		
		
	}

}
