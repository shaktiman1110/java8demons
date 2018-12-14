package function;

import java.util.function.Function;

public class FunctionChaining {

	public static void main(String[] args) {

		
		Function<String, String> function1= s->s.toUpperCase();
		Function<String, String> function2= s->s.substring(0,9);
		//f1.andThen(f2): First f1 will be applied and then for the result ,f2 will be applied.
		System.out.println("Result of Function1 and then Function2 is :--->" + function1.andThen(function2).apply("Shaktimanhigangadharhai"));
		//f1.compose(f2)===>First f2 will be applied and then for the result f1 will be applied.
		
		System.out.println("Result of Function1,decompose Function2 is :--->" + function1.compose(function2).apply("Shaktimanhigangadharhai"));
		
	}
}
