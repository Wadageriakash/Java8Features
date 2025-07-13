package streamcodinginterview;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

//Find the longest string in a list of strings using Java streams...?
public class FindLongestString {

	public static void main(String[] args) {

		List<String> str = Arrays.asList("Bangalore", "Mumbai", "Hyderabad", "Bhalki");
		Optional<String> longestString = str.stream().max(Comparator.comparing(String::length));
		System.out.println("longestString = " + longestString);
	}
}
