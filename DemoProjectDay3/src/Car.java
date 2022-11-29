class Vehicle{
	
	String brand ="Tata";
	public void display()
	{
		System.out.println("Welcome to Tata");
	}
}

public class Car extends Vehicle{

	String model="Nexon";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		c.display();
	}

}
