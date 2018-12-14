package consumer;

import java.util.function.Consumer;

class MovieLaunch {
	public static void main(String[] args) {
		Consumer<Movie> c1 = m -> System.out.println("Movie:" + m.name + " is ready to release");

		Consumer<Movie> c2 = m -> System.out.println("Movie:" + m.name + " is just Released and it is:" + m.result);

		Consumer<Movie> c3 = m -> System.out.println("Movie:" + m.name + " information storing in the database");

		Consumer<Movie> chainedC = c1.andThen(c2).andThen(c3);

		Movie m1 = new Movie("Zero", "Hit");

		chainedC.accept(m1);
		Movie m2 = new Movie("Kedarnath", "Flop");

		chainedC.accept(m2);

	}
}