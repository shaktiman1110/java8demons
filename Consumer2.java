package consumer;

import java.util.function.Consumer;

public class Consumer2 {
	public static void main(String[] args) {
		Consumer<String> consumer = s -> System.out.println(s);

		consumer.accept("consumer only accept the input");
		consumer.accept("it can be used to consume object and perform certain operation");
	}
}
