package week1.day2.assignment;

public class ChangeOddIndexToUpper {

	public static void main(String[] args) {
		String test="changeme";
		char[] test2=test.toCharArray();
		String up=" ";
		for (int i = 0; i < test2.length; i++) {
			 	if (i%2!=0) {
			 		up=up+Character.toUpperCase(test2[i]);
				}
			 	else {
			 		
			 		up=up+test2[i];
			 	}
		}
		System.out.println(up);
	}

}
