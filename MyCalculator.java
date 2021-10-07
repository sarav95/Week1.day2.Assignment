package week1.day2.assignment;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator c=new Calculator();
		System.out.println("addition of three num is : " + c.add(5, 10, 12));
		System.out.println("subtractio of the two num is : " + c.sub(10, 5));
		System.out.println("multiplication of the two num is : "+ c.mul(10.5, 15.2));
		System.out.println("division of the two num is : "+c.div(10.0f, 5.2f));
	}

}
