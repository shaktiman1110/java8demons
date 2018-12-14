package predicate;

import java.util.function.Predicate;

public class Predicate1 {

	public static void main(String[] args) {
		Predicate<String> predicate= new Predicate<String>() {
			
			@Override
			public boolean test(String t) {
				return t.length()>3;
			}
		};
		
		System.out.println(predicate.test("nishant"));
		
		// making use of lamda expression
		Predicate<String> predicate2 = (s)-> (s.length()>3);
		System.out.println(predicate2.test("rk"));
	}
}
