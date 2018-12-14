package function;

import java.util.function.Function;

public class Function1 {
public static void main(String[] args) {
	
	Function<String, Integer> function1 = (s)->s.length();
	System.out.println(function1.apply("Nishant"));
}
}
