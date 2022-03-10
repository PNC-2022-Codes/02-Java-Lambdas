import java.util.ArrayList;
import java.util.List;

public class Example02 {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(1);
		numbers.add(5);
		numbers.add(6);
		numbers.add(10);
		
		numbers.forEach(System.out::println);
		
		List<Integer> dobleNumbers =  numbers
			.stream()
			.map(Example02::intTimesTwo)
			.toList();
		
		System.out.println(dobleNumbers);
	}

	private static Integer intTimesTwo(Integer n) {
		return n * 2;
	}
}
