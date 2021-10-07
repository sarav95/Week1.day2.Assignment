package week1.day2.assignment;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] words = test.split(" ");
		String reversestr = "";
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String reverse = "";
			if (i % 2 != 0) {
				for (int j = word.length() - 1; j >= 0; j--) {

					reverse = reverse + word.charAt(j);
					// System.out.println(reverse);

				}
			} else {
				for (int j = 0; j < word.length(); j++) {
					reverse = reverse + word.charAt(j);
				}
			}
			reversestr = reversestr + reverse + " ";

		}

		System.out.println("reverse:" + reversestr);
	}

}
