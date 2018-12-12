package streamapi;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MapExample {
public static void main(String[] args) {
	List<String> uris = new ArrayList<>();
	uris.add("c://myfile1.txt");
	uris.add("c://myfile2.txt");
	uris.add("c://myfile3.txt");
	uris.add("c://myfile4.txt");
	
	uris.stream()
			.map(mapper->Paths.get(mapper))
			.forEach(System.out::println);
	
	System.out.println("-----------------------------");

	List<Detail> details= new ArrayList<>();
	
	List<String> part1= new ArrayList<>();
	part1.add("part1_1");
	part1.add("part1_2");
	part1.add("part1_3");
	part1.add("part1_4");
	System.out.println("demo for forEach");
	part1.forEach(System.out::println);
	
	List<String> part2= new ArrayList<>();
	part2.add("part2_1");
	part2.add("part2_2");
	part2.add("part2_3");
	part2.add("part2_4");

	details.add(new Detail(1001, part1));
	details.add(new Detail(1002, part2));
	
	details.stream()
	.flatMap(mapper->mapper.getParts().stream())
	.forEach(System.out::println);
}
}
