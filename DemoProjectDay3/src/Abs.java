abstract class Phone {
	public abstract void calling();

	public void contacts() {
		System.out.println("inside contacts");
	}

}

class Nokia extends Phone {

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("calling from Nokia");
	}

}

public class Abs {
	public static void main(String[] args) {
		Phone n = new Nokia();
		n.calling();
	}
}
