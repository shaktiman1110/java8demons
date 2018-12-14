package function;

import java.util.function.Function;

public class IdentityDemo {
public static void main(String[] args) {
	Function<String, String> function= Function.identity();
	String string= function.apply("Nishant");
	System.out.println(string);
	}
}
