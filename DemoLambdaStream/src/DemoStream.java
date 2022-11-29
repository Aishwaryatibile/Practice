import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product {
	int id;
	String name;
	int price;

	public Product(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class DemoStream {
	public static void main(String[] args) {
		 List<Product> productsList = new ArrayList<Product>();  
	     
		 
	     productsList.add(new Product(1,"HP Laptop",25000));  
	     productsList.add(new Product(2,"Dell Laptop",35000));  
	     productsList.add(new Product(3,"Lenevo Laptop",28000));  
	     productsList.add(new Product(4,"Sony Laptop",28000));  
	     productsList.add(new Product(5,"Apple Laptop",90000));  
	     List<Integer> productPriceList2 =productsList.stream()  
	                                  .filter(p -> p.price > 30000)
	                                  .map(p->p.price)        
	                                  .collect(Collectors.toList());  
	     System.out.println(productPriceList2); 
	}

}
