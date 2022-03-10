import java.util.ArrayList;
import java.util.List;

public class Example01 {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(1);
		numbers.add(5);
		numbers.add(6);
		numbers.add(10);
		
		
		
		numbers.forEach((n) -> {
			System.out.println("Element: " + n);
		});
		
		List<Integer> dobleNumbers =  numbers
			.stream()
			.map(n -> n*2)
			.toList();
		
		System.out.println(dobleNumbers);
	}
	
	

}
