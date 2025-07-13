package streamcodinginterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Merge two sorted lists into a single sorted list using Java streams
public class Mergetwosortedlists {

	public static void main(String [] args) {
		
		List<Integer> num1 = new ArrayList<>(Arrays.asList(100, 3, 2, 4, 56, 7, 6, 10));
		List<Integer> num2 = new ArrayList<>(Arrays.asList(12,11, 14, 13, 16, 17,20));
		
//		another way
		List<Integer> mergedList = Stream.concat(num1.stream(), num2.stream()).sorted().collect(Collectors.toList());
		System.out.println(mergedList); // [2, 3, 4, 6, 7, 10, 11, 12, 13, 14, 16, 17, 20, 56, 100]
		
		
	}
}
