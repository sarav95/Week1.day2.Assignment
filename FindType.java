package week1.day2.assignment;

public class FindType {

	public static void main(String[] args) {
		String test="$$ Welcome to 2nd Class of Automation $$";
		int letter=0,space=0,spl=0,num=0;
		
		//Convert into char Array
		
		System.out.println(test);
		
		char[] t1=test.toCharArray();
		//int len=t1.length;
		for (int i = 0; i < t1.length; i++) {
			if (Character.isLetter(t1[i])) {
				letter++;
			}else if (Character.isDigit(t1[i])) {
				num++;
			}else if (Character.isSpaceChar(t1[i])) {
				space++;
			}else {
				spl++;
			}
		}
		System.out.println("Number of letter in a word:"+letter);
		System.out.println("Number of digit in a word:"+num);
		System.out.println("Number of space in a word:"+space);
		System.out.println("Number of special char in a word:"+spl);
		
		
		
		
	}

}
