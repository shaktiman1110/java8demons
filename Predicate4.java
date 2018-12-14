package predicate;

import java.util.function.Predicate;

public class Predicate4 {

	public static void main(String[] args) {
		Predicate<String> i = Predicate.isEqual("thissessionisboring");

		System.out.println(i.test("thissessioniSboring"));
		
		System.out.println(i.test("thissessionisboring"));
	}
}