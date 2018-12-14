package predicate;

import java.util.function.Predicate;

public class Predicate2 {

	public static void main(String[] args) {
		int[] x= {0,5,10,15,20,25,30};
		Predicate<Integer> predicate1= (i)-> i>10;
		Predicate<Integer> predicate2= (i)-> i%2==0;
		System.out.println("No greater than 10 are");
		m1(predicate1,x);
		System.out.println("No greater which are even");
		m1(predicate2,x);
		System.out.println("No greater which are even and greater than 10 are:");
		m1(predicate2.and(predicate1),x);
		System.out.println("No greater which are not even are:");
		m1(predicate2.negate(),x);
		System.out.println("No greater which are even or greater than 10 are");
		m1(predicate2.or(predicate1),x);
	}

	private static void m1(Predicate<Integer> predicate1, int[] x) {
		// TODO Auto-generated method stub
		for (int i : x) {
			if(predicate1.test(i)){
				System.out.println(i);
			}
			
		}
		
	}
}
