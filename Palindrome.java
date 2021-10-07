package week1.day2.assignment;

public class Palindrome {
	public static void main(String[] args) {
		String val="appa";
		int len=val.length();
		String rev="";
//		int j=0;
		for (int i = len-1; i>=0; i--) {
			rev=rev+val.charAt(i);
		}
		if ((val.equals(rev)) || (val.equalsIgnoreCase(rev))) {
			
			System.out.println("Palindrome: "+val);
			
		}
		else {
			System.out.println("Not Palindrome: "+val);
		}
			
	}
	

}
