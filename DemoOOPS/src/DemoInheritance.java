class Mobile {
	
	int price = 90000;
	
	public void calling() {
		System.out.println("Calling from mobile");
	}
	
}

class Apple extends Mobile {
	public void calling() {
		System.out.println("Calling from Apple mobile");
	}

}

public class DemoInheritance {
	
	public static void main(String[] args) {
		Mobile mob = new Apple();
		mob.calling();
		System.out.println("Price of mobile : "+mob.price);
	}

}
