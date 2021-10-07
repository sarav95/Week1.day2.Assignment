package week1.day2;

public class MyMobile {
	
	int cost=10000;
	String brand ="Samsung";
	String color="red";
	
	public void makeCall() {
		System.out.println("Making Calls");
	}
	
	public void sendMsg() {
		System.out.println("sending Message");
	}
			
	private void payBills() {
		System.out.println("paying bills");
	}
	public static void main(String[] args) {
		MyMobile m=new MyMobile();
		m.makeCall();
		m.sendMsg();
		m.payBills();
		System.out.println("cost: "+m.cost);
		System.out.println("brand: "+m.brand);
		System.out.println("color: "+m.color);

	}

}
