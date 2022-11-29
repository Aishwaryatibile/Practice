import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DemoStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = Arrays.asList(9,6,3,5,1,7,2);
		
	Stream<Integer> da = nums.stream();
//		long count = da.count();
//		System.out.println("Total = "+count);
		
//		Stream<Integer> sorted = da.sorted();
//		sorted.forEach(n->System.out.println(n));
		
//		nums.forEach(n->System.out.println(n));
//		da.forEach(n->System.out.println(n));
	
	nums.stream()
				.filter(n->n%2==0)
				.sorted()
				.map(n->n*3)
				.forEach(n->System.out.println(n));
	}

}
