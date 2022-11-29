class Calculator{
	public int add(int a, int b) {
		return a+b;
	}
}

public class DemoPolymorphism extends Calculator {

	int a, b, c;

	public int add(int a, int b) {
		return a + b;
	}

	public int add(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		Calculator dpoly = new DemoPolymorphism();
		DemoPolymorphism dpoly1 = new DemoPolymorphism();
		
		System.out.println("Result of addition od a and b : " + dpoly.add(10, 15));
		System.out.println("Result of addition od a ,b and c : " + dpoly1.add(10, 15, 100));
	}

}
