
@FunctionalInterface
interface A {
	void show();

	String toString();
}
//
//class B implements A{
//
//	@Override
//	public void show() {
//		// TODO Auto-generated method stub
//		System.out.println("hello");
//	}
//	
//}

public class DemoFI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		A a = new A() {
//			@Override
//			public void show() {
//				// TODO Auto-generated method stub
//				System.out.println("Hello inside the main");
//			} };

		A a = () -> System.out.println("Hello inside the main");
		a.show();

	}

}
