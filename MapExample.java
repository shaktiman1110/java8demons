package streamapi;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ForEachDemo {
public static void main(String[] args) {
	
	List<Detail> details= new ArrayList<>();
	
	List<String> part1= new ArrayList<>();
	part1.add("This is ");
	part1.add("demo for ");
	part1.add("Default method");
	part1.add("I am not disturbing any other method of List interface which were there before java 8");
	System.out.println("demo for forEach");
	part1.forEach(System.out::println);

}
}
