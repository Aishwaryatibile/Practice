abstract class Animal {
	public abstract void eat();

	public void sound() {
		System.out.println("Different Animal sounds ");
	}
}

class Dog extends Animal {

	@Override
	public void eat() {
		System.out.println("Dog is eating");
	}

}

class Lion extends Animal {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Lion is eating");
	}

}

public class DemoAbstract {
	public static void main(String[] args) {
		Animal dg = new Dog();
		Animal li = new Lion();

		dg.eat();
		li.eat();
	}

}
