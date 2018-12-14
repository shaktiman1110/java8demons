package supplier;

import java.util.Date;
import java.util.function.Supplier;

/*Supplier won't take any input and it will always supply objects. 
Supplier Functional Interface contains only one method get(). 1) interface Supplier<R> 2) { 3) public R get(); 4) } Supplier Functional interface does not contain any default and static methods.*/
public class Supplier1 {
public static void main(String[] args) {
	
	Supplier<Date> supplier=()-> new Date();
	System.out.println(supplier.get());
}
}
