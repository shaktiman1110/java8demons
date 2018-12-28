package changeinmap;

import java.util.HashMap;
import java.util.Map;

public class Java8Enhancements {

	// replace(key,value)
	// replaceAll(BiFunction<k,v,v>)
	// remove(key,value)
	// getOrDefault
	// putIfAbsent
	// compute
	// computeIfAbsent
	// computeIfPresent
	// merge
	// forEach

	public static void main(String[] args) {
		final Product defaultProduct = new Product(-1, "Whatever the customer wants", 100);
		final Map<Integer, Product> idToProduct= new HashMap<>();
		
		idToProduct.put(1, new Product(1, "door", 2000));
		idToProduct.put(2, new Product(2, "floorPanel", 2300));
		idToProduct.put(3, new Product(3, "window", 1200));
		
		
		Product product= idToProduct.get(10);
		System.out.println("Products are");
		System.out.println(product); // we get null
		idToProduct.forEach((k, v) -> System.out.println((k + ":" + v)));
		// so as the product with id 10 is not there ,default will be inserted
		Product product2= idToProduct.getOrDefault(10, defaultProduct);
				
		System.out.println(product2);
		System.out.println("Products are");
		idToProduct.forEach((k, v) -> System.out.println((k + ":" + v)));
		System.out.println("BUT --->this means getOrDefault doesn't modify map");
		
		
		
		// replace method
		idToProduct.replace(2, new Product(2, "Bicycle", 700));
		System.out.println(idToProduct.get(2));
		System.out.println("Products are");
		idToProduct.forEach((k, v) -> System.out.println((k + ":" + v)));
		
		
		System.out.println("What if we try to non existing map obejct");
		idToProduct.replace(4, new Product(4, "Bicycle", 700));
		System.out.println(idToProduct.get(4));
		System.out.println("Products are");
		idToProduct.forEach((k, v) -> System.out.println((k + ":" + v)));
		
		System.out.println("there will be no update/creation in map");
		
		
		//replaceAll method

		System.out.println("Products before replaceAll are");
		idToProduct.forEach((k, v) -> System.out.println((k + ":" + v)));
		idToProduct.replaceAll((id,oldproduct)->
		new Product(id, oldproduct.getName(), oldproduct.getWeight()+10));
		
		System.out.println("Products after replaceAll are");
		idToProduct.forEach((k, v) -> System.out.println((k + ":" + v)));
		
		//computeIfAbsent
		
		Product  result= idToProduct
				.computeIfAbsent(10, id->new Product(10,"Custom Product",10));
		System.out.println(result);
		System.out.println(idToProduct.get(10));
		System.out.println("Products are");
		idToProduct.forEach((k, v) -> System.out.println((k + ":" + v)));
		
	}
}
