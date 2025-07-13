package streamcodinginterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

// Remove duplicates from a list while preserving the order using Java streams:
public class RemoveduplicatesfromAList {

	public static void main(String [] args) {
		
		List<Integer> num1 = new ArrayList<>(Arrays.asList(1, 2, 6,3,7,10, 3, 6));
		List<Integer> result =  num1.stream().distinct().collect(Collectors.toList());
		System.out.println(result); // [1, 2, 6, 3, 7, 10]
		
		
		
	}
}
