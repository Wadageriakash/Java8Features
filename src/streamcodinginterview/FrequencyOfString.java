package streamcodinginterview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// Given a list of strings, find the frequency of each word using Java streams:
public class FrequencyOfString {
	
	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("apple", "banana", "apple", "cherry", 
                "banana", "apple");
		
		List<Integer> result = words.stream().map(item -> item.length()).collect(Collectors.toList());
		System.out.println("result = "+ result);
		// result = [5, 6, 5, 6, 6, 5]

		
		Map<String, Long> wordFrequency = words.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
				
	              
		
		System.out.println("wordFrequency = "+ wordFrequency);
		//wordFrequency = {banana=2, cherry=1, apple=3}

	}

}
