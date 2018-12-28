package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortingAMapProgram {
	public static void main(String[] args) {
		Map<Integer, Integer> lmap = new HashMap<>();
		lmap.put(12, 24);
		lmap.put(2, 124);
		lmap.put(21, 240);
		lmap.put(8, 4);
		lmap.put(1, 1124);

		Map<Integer, Integer> mapSortedBykey = lmap.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		System.out.println("sorting by key\n");
		mapSortedBykey.forEach((k, v) -> System.out.println("key " + k + "value" + v + "\n"));
		System.out.println("sorting by value\n");
		Map<Integer, Integer> mapSortedByValue = lmap.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		mapSortedByValue.forEach((k, v) -> {
			System.out.println("key " + k + "value " + v + "\n");
		});

		// second example

		/*Map<String, Integer> ItemToPrice = new HashMap<>();
		ItemToPrice.put("Sony Braiva", 1000);
		ItemToPrice.put("Apple iPhone 6S", 1200);
		ItemToPrice.put("HP Laptop", 700);
		ItemToPrice.put("Acer HD Monitor", 139);
		ItemToPrice.put("Samsung Galaxy", 800);

		Map<String, Integer> mapSortedBykeyItemToPrice = ItemToPrice.entrySet().stream()
				.sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		mapSortedBykeyItemToPrice.forEach((k, v) -> {
			System.out.println("key" + k + "value" + v);
		});*/
	}
}
