import java.util.function.Consumer;

public class Example03 {
	public static void main(String[] args) {
		
		add(5, 8, result -> {
			System.out.println("Result: " + result);
		});
		
		add(10, 15, Example03::printResult);
		add(1, 153, Example03::printResult);
		add(21, 12, Example03::printResult);
		
	}
	
	private static void add(Integer a, Integer b, Consumer<Integer> onResult) {
		Integer result = a + b;
		
		//Process takes long time
		
		//Callback(result)
		onResult.accept(result);
	}
	
	private static void printResult(Integer n) {
		System.out.println("Result: " + n);
	}
}
