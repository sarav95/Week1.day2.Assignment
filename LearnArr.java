package week1.day2;

import java.util.Arrays;

public class LearnArr {

	public static void main(String[] args) {
		int numArr[]= {100,49,398,34,1,267};
		
		int len=numArr.length;
		System.out.println("lenght :"+len);
		
		//before sort
		System.out.println("Before sort");
		for (int i = 0; i < numArr.length; i++) {
			System.out.println(numArr[i]);
		}
		
	
		
		Arrays.sort(numArr);
		
		System.out.println("afte sort");
		//display the array element after sort
		for (int i = 0; i < numArr.length; i++) {
			System.out.println(numArr[i]);
		}
		
		//Second largest number
		System.out.println("second largest number:"+numArr[len-2]);
		 
		//Second smalles number
		System.out.println("second smallest number:"+numArr[1]);
		
	}

}
