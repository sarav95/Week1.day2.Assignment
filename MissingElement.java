package week1.day2.assignment;

import java.util.Arrays;


public class MissingElement {
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,7,6,8};

		int len=arr.length;
		
		System.out.println("length of the array:"+len);
		
		System.out.println("elements in array :");
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i]);
			
		}
		
		Arrays.sort(arr);
		int m=1;
		for (int i = 0; i < arr.length; i++) {
			if (m!=arr[i]) {
				System.out.println("Missing element:" + m);
				break;
			}
			else {
				m++;
			}
			
		}
		
		}
		
	}

