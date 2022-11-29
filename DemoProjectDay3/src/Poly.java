class Animal{
	public void sound() {
		System.out.println("Animal sound");
	}
}

class Bird extends Animal{
	public void sound() {
		System.out.println("Birds sound");
	}
}
class Dog extends Animal{
	public void sound() {
		System.out.println("Dog sound");
	}
}


public class Poly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal an = new Animal();
		Animal br = new Bird();
		Animal dg = new Dog();
		
		an.sound();
		br.sound();
		dg.sound();
		
	}

}
