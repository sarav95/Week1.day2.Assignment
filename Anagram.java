package week1.day2.assignment;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1="stops";
		String text2="potss";
		int len=text1.length();
		int len1=text2.length();
		if (len==len1) {
			char t[]=text1.toCharArray();
			char t1[]=text2.toCharArray();
			System.out.println("before sorting array value:");
			for (int i = 0; i < t.length; i++) {
				System.out.print(t[i]);
			}
			System.out.println();
			for (int j= 0; j < t1.length; j++) {
			System.out.print(t1[j]);	
			}
			System.out.println();
			Arrays.sort(t);
			Arrays.sort(t1);
			System.out.println("after sorting array value:");
			for (int i = 0; i < t.length; i++) {
				System.out.print(t[i]);
			}
			System.out.println();
			for (int j= 0; j < t1.length; j++) {
			System.out.print(t1[j]);	
			}
			System.out.println();
			for (int i = 0; i < t1.length; i++) {
				if (t[i]==t1[i]) {
					System.out.print(t[i]);
				}
			}
			
			
		}
		
	}

}
