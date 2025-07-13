package streamcodinginterview;

import java.util.List;
import java.util.stream.Collectors;

// Find the intersection of two lists using Java streams:
public class Intersectionoftwolists {

	public static void main(String [] args) {
		
		List<Integer> num1 = List.of(1, 2, 3, 4, 5, 6);
		List<Integer> num2 = List.of(3, 2, 6, 7, 10);
		
		List<Integer> result = num1.stream().filter(num2::contains).toList();
		System.out.println(result); // [2, 3, 6]

		
	}
}
